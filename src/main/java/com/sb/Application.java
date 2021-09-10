package com.sb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;

/**
 * 启动类
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 11:23
 */
@Slf4j
@SpringBootApplication
@MapperScan("com.sb.dao")
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class);
        Environment env = context.getEnvironment();
        log.info("====================================================================");
        log.info("项目版本: {}", env.getProperty("project.version"));
        log.info("启动环境: {}", env.getProperty("project.env"));
        log.info("启动端口: {}", env.getProperty("server.port"));
        log.info("日志等级: {}", env.getProperty("logback.level"));
        log.info("日志Appender: {}", env.getProperty("logback.appender"));
        log.info("Swagger: {}", Boolean.valueOf(env.getProperty("swagger.enabled")) ? "启用" : "禁用");
        log.info("Startup complete ...");
        log.info("====================================================================");
    }
}
