package com.hoonick.giddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@EnableWebMvc
public class GiddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiddyApplication.class, args);
	}

}
