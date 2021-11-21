package com.ccl.zhatu.main.config;

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
 * @author chenchunlu
 * @date 2021-11-21 13:57
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                        .apiInfo(apiInfo()).select()
                        //为当前包下controller生成API文档
                        .apis(RequestHandlerSelectors.basePackage("com.ccl.zhatu"))
                        //为有@Api注解的Controller生成API文档
//                      .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                        //为有@ApiOperation注解的方法生成API文档
//                         .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                        .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("渣土运输系统")
                .description("渣土运输系统")
                .contact("macro")
                .version("1.0")
                .build();
    }
}
