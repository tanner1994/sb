package com.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 11:23
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.host:}")
    private String host;

    @Value("${swagger.title:接口文档}")
    private String title;

    @Value("${swagger.description:}")
    private String description;

    @Value("${project.version:}")
    private String version;

    @Bean
    public ApiInfo getApiInfo() {
        return new ApiInfoBuilder().title(title).description(description).version(version).build();
    }

    @Bean
    public Docket getDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(this.getApiInfo()).host(host).select()
            // 设置需要被扫描的类，这里设置为添加了@Api注解的类
            .apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).paths(PathSelectors.any()).build();
    }
}
