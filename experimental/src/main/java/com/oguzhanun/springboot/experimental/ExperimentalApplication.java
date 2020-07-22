package com.oguzhanun.springboot.experimental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@SpringBootApplication
public class ExperimentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperimentalApplication.class, args);
	}
	
//	@Bean
//	public ViewResolver viewResolver() {
//		
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		
//		viewResolver.setPrefix("/static/");
//		viewResolver.setSuffix(".jsp");
//		
//		return viewResolver;
//	}

}
