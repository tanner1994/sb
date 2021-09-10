package com.sb.api.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sb.api.BaseController;
import com.sb.core.model.ApiResponse;
import com.sb.core.model.PageWrap;
import com.sb.dao.user.model.User;
import com.sb.service.user.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 示例Controller
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 11:23
 */
@RestController
@RequestMapping("/user")
@Api(tags = "示例接口")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 用户管理页面
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    @GetMapping("/manage")
    @ApiOperation("用户管理页面")
    public ModelAndView manage() {
        ModelAndView mav = new ModelAndView("user/manage");
        User req = new User();
        req.setIsDelete(Boolean.FALSE);
        List<User> users = userService.findList(req);
        mav.addObject("userList", users);
        return mav;
    }

    /**
     * 创建
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    @PostMapping("/create")
    @ApiOperation("创建")
    public ApiResponse<User> create(@RequestBody User req) {
        return ApiResponse.success(userService.create(req));
    }

    /**
     * 通过id查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    @GetMapping("/{id}")
    @ApiOperation("根据ID查询")
    public ApiResponse<User> finById(@PathVariable Integer id) {
        return ApiResponse.success(userService.findById(id));
    }

    /**
     * 分页查询
     * 
     * @author Caesar Liu
     * @date 2020-06-27 14:31
     */
    @PostMapping("/page")
    @ApiOperation("分页查询")
    public ApiResponse findPage(@RequestBody PageWrap<User> pageWrap) {
        return ApiResponse.success(userService.findPage(pageWrap));
    }

    /**
     * 根据ID修改
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    @PostMapping("/updateById")
    @ApiOperation("根据ID修改")
    public ApiResponse<User> updateById(@RequestBody User req) {
        userService.updateById(req);
        return ApiResponse.success(null);
    }

    /**
     * 根据ID删除
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    @GetMapping("/delete/{id}")
    @ApiOperation("根据ID删除")
    public ApiResponse delete(@PathVariable Integer id) {
        userService.deleteById(id);
        return ApiResponse.success(null);
    }
}
