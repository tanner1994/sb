package com.sb.api.org;

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
import com.sb.dao.org.model.Org;
import com.sb.service.org.OrgService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 组织接口
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@RestController
@RequestMapping("/org")
@Api(tags = "组织接口")
public class OrgController extends BaseController {

    @Autowired
    private OrgService orgService;

    /**
     * 创建
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    @PostMapping("/create")
    @ApiOperation("新建")
    public ApiResponse create(@RequestBody Org org) {
        return ApiResponse.success(orgService.create(org));
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
        orgService.deleteById(id);
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
    public ApiResponse updateById(@RequestBody Org org) {
        orgService.updateById(org);
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
    public ApiResponse findPage(@RequestBody PageWrap<Org> pageWrap) {
        return ApiResponse.success(orgService.findPage(pageWrap));
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
        return ApiResponse.success(orgService.findById(id));
    }
}
