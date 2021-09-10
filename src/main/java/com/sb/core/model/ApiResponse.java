package com.sb.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 接口返回对象
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 11:23
 */
@Data
@AllArgsConstructor
public class ApiResponse<T> {

    private Boolean success;

    private String message;

    private T data;

    /**
     * 请求成功
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    public static <T> ApiResponse success(T data) {
        return ApiResponse.success("请求成功", data);
    }

    /**
     * 请求成功
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    public static <T> ApiResponse success(String message, T data) {
        return new ApiResponse<>(Boolean.TRUE, message, data);
    }

    /**
     * 请求失败
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    public static ApiResponse failed() {
        return ApiResponse.failed("请求失败");
    }

    /**
     * 请求失败
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    public static ApiResponse failed(String message) {
        return new ApiResponse<>(Boolean.FALSE, message, null);
    }
}
