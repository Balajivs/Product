package com.test1.Product.Swagger;


import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

@EnableSwagger2
public class SwaggerConfig {
	/*
	 * @Bean public Docket postsApi() { return new
	 * Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant(
	 * "/api/**"))
	 * .apis(RequestHandlerSelectors.basePackage("com.test1.Product")).build().
	 * apiInfo(apiInfo()); }
	 * 
	 * private ApiInfo apiInfo() { return new
	 * ApiInfoBuilder().title("Application Programming Interface").
	 * description("Product Master")
	 * .termsOfServiceUrl("http://balajivs.com").contact("balaji@gmail.com").
	 * license("Product License")
	 * .licenseUrl("balaji@gmail.com").version("1.0").build(); }
	 */
}

