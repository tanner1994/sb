package com.sb.service;

import org.springframework.context.annotation.ComponentScan;

import com.alibaba.fastjson.JSON;

import lombok.extern.slf4j.Slf4j;

/**
 * 单元测试基类
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 11:23
 */
@Slf4j
@ComponentScan("com.sb")
public class BaseTest {

    /**
     * 打印测试结果
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    protected void print(Object obj) {
        log.info("测试结果: {}", obj == null ? "无返回" : JSON.toJSONString(obj));
    }

}
