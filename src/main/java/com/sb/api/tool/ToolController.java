package com.sb.api.tool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.api.BaseController;
import com.sb.core.model.ApiResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tool")
@Api(tags = "工具接口")
public class ToolController extends BaseController {

    @GetMapping("/test")
    @ApiOperation("测试")
    public ApiResponse test() {
        return ApiResponse.success("error");
    }

}
