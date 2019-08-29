package com.xkcoding.orm.mybatis.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * Swagger2 配置
 * </p>
 *
 * @package: com.xkcoding.swagger.config
 * @description: Swagger2 配置
 * @author: yangkai.shen
 * @date: Created in 2018-11-29 11:14
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    /**
     * swagger 文档地址 http://127.0.0.1:8083/gwq/swagger-ui.html
     * @return
     */
    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();
    }

}