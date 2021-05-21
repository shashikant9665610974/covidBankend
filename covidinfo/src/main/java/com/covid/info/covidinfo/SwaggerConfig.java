package com.covid.info.covidinfo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.hateoas.client.LinkDiscoverer;
import org.springframework.hateoas.client.LinkDiscoverers;
import org.springframework.hateoas.mediatype.collectionjson.CollectionJsonLinkDiscoverer;
import org.springframework.plugin.core.SimplePluginRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Predicates.or;


@EnableSwagger2
@Configuration
public class SwaggerConfig 
//extends WebMvcConfigurationSupport 
{

	// public Docket postsApi() {
	// return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
	// .apiInfo(apiInfo()).select().paths(postPaths()).build();
	// }

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.covid.info.covidinfo")).paths(regex("/api.*"))
				.build();

	}
	
//	private Predicate<String> postPaths() {
//		return or(regex("/api/posts.*"), regex("/api/index.*"));
//	}
//
	@Primary
	@Bean
	public LinkDiscoverers discoverers() {
		List<LinkDiscoverer> plugins = new ArrayList<>();
		plugins.add(new CollectionJsonLinkDiscoverer());
		return new LinkDiscoverers(SimplePluginRegistry.create(plugins));
	}
//
//	@Override
//	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//	}
}

//
// private Predicate<String> postPaths() {
// return or(regex("/index.*"),
// regex("/save.*"),regex("/CvoidInfoDTO10.*"),regex("/CvoidInfowhere.*"),regex("/findall.*"));
// }
//
// private ApiInfo apiInfo() {
// return new ApiInfoBuilder().title("JavaInUse API")
// .description("JavaInUse API reference for developers")
// .termsOfServiceUrl("http://javainuse.com")
// .contact("javainuse@gmail.com").license("JavaInUse License")
// .licenseUrl("javainuse@gmail.com").version("1.0").build();
// }
