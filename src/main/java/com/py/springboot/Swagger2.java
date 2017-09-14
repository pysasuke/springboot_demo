package com.py.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2
 * Swagger相关类
 * @author pysasuke
 * @date 2017/9/13
 */
@Configuration
@EnableSwagger2 //启动swagger2
//请求地址http://localhost:8080/swagger-ui.html
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //需要扫描api的包路径
                .apis(RequestHandlerSelectors.basePackage("com.py.springboot.web"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("这只是一个demo")
                .contact("PySasuke")
                .version("1.0")
                .build();
    }

}
