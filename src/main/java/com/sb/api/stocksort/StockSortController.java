package com.sb.api.stocksort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.api.BaseController;
import com.sb.core.model.ApiResponse;
import com.sb.core.model.PageWrap;
import com.sb.dao.stocksort.model.StockSort;
import com.sb.service.stocksort.StockSortService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 库存组织接口
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@RestController
@RequestMapping("/stockSort")
@Api(tags = "库存组织接口")
public class StockSortController extends BaseController {

    @Autowired
    private StockSortService stockSortService;

    /**
     * 创建
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    @PostMapping("/create")
    @ApiOperation("新建")
    public ApiResponse create(@RequestBody StockSort stockSort) {
        return ApiResponse.success(stockSortService.create(stockSort));
    }

    /**
     * 用户删除
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    @GetMapping("/delete/{id}")
    @ApiOperation("根据ID删除")
    public ApiResponse deleteById(@PathVariable Integer id) {
        stockSortService.deleteById(id);
        return ApiResponse.success(null);
    }

    /**
     * 修改用户
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    @PostMapping("/updateById")
    @ApiOperation("根据ID修改")
    public ApiResponse updateById(@RequestBody StockSort stockSort) {
        stockSortService.updateById(stockSort);
        return ApiResponse.success(null);
    }

    /**
     * 分页查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    @PostMapping("/page")
    @ApiOperation("分页查询")
    public ApiResponse findPage(@RequestBody PageWrap<StockSort> pageWrap) {
        return ApiResponse.success(stockSortService.findPage(pageWrap));
    }

    /**
     * 通过ID查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    @GetMapping("/{id}")
    @ApiOperation("根据ID查询")
    public ApiResponse finById(@PathVariable Integer id) {
        return ApiResponse.success(stockSortService.findById(id));
    }
}
