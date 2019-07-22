package com.hoonick.giddy.config;

import org.apache.shiro.realm.Realm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hoonick.giddy.shiro.ShiroDBRealm;

@Configuration
public class ShiroConfig {

	@Bean
	public Realm authRealm() {
		ShiroDBRealm authRealm = new ShiroDBRealm();
		return authRealm;
	}
}
