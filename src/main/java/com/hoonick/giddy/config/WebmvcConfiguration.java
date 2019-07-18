package com.hoonick.giddy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebmvcConfiguration implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		
//		registry.addViewController("/hello").setViewName("hello.html");
//		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//		registry.addViewController("/index2").setViewName("index2.html");
		registry.addViewController("/loginhtml").setViewName("login.html");
//		registry.addViewController("/demo").setViewName("demo.html");
		WebMvcConfigurer.super.addViewControllers(registry);
	}
	
}
