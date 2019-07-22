package com.hoonick.giddy;

import org.apache.shiro.spring.boot.autoconfigure.ShiroAutoConfiguration;
import org.apache.shiro.spring.config.web.autoconfigure.ShiroWebAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {ShiroWebAutoConfiguration.class,ShiroAutoConfiguration.class})
@SpringBootApplication
public class GiddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiddyApplication.class, args);
	}

}
