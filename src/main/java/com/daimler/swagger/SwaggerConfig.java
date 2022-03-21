package com.daimler.swagger;

import com.daimler.pojo.Story;
import com.fasterxml.classmate.TypeResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
/*
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;;
*/
@Configuration
//@EnableSwagger2WebMvc
//@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig {
/* 
	@Bean
    public Docket swaggerConfigApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.apiInfo(new ApiInfoBuilder()
                        .title("********* Daimler Spring Boot project *********")
                        .description("Spring Boot swagger poject")
                        .version("0.1")
                        .build())
              .select()  
              .apis(RequestHandlerSelectors.basePackage("com.daimler.rest"))             
              .paths(PathSelectors.ant("/**") )                         
              .build();  
    }
     */
}
