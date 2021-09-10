package com.sb.api.securities;

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
import com.sb.dao.securities.model.Securities;
import com.sb.service.securities.SecuritiesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 证券档案接口
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@RestController
@RequestMapping("/securities")
@Api(tags = "证券档案接口")
public class SecuritiesController extends BaseController {

    @Autowired
    private SecuritiesService securitiesService;

    /**
     * 创建
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    @PostMapping("/create")
    @ApiOperation("新建")
    public ApiResponse create(@RequestBody Securities securities) {
        return ApiResponse.success(securitiesService.create(securities));
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
        securitiesService.deleteById(id);
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
    public ApiResponse updateById(@RequestBody Securities securities) {
        securitiesService.updateById(securities);
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
    public ApiResponse findPage(@RequestBody PageWrap<Securities> pageWrap) {
        return ApiResponse.success(securitiesService.findPage(pageWrap));
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
        return ApiResponse.success(securitiesService.findById(id));
    }
}
