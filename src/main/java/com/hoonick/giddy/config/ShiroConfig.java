package com.hoonick.giddy.config;

import java.util.Map;

import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.config.web.autoconfigure.ShiroWebFilterConfiguration;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hoonick.giddy.shiro.ShiroDBRealm;

@Configuration
public class ShiroConfig extends ShiroWebFilterConfiguration{

	@Bean
	public Realm authRealm() {
		ShiroDBRealm authRealm = new ShiroDBRealm();
		return authRealm;
	}
	
	@Override
	protected ShiroFilterFactoryBean shiroFilterFactoryBean() {
        ShiroFilterFactoryBean filterFactoryBean = new ShiroFilterFactoryBean();

        filterFactoryBean.setLoginUrl("/login.html");
        filterFactoryBean.setSuccessUrl("/demo");
        filterFactoryBean.setUnauthorizedUrl(unauthorizedUrl);

        filterFactoryBean.setSecurityManager(securityManager);
        Map<String, String> filterChainMap = shiroFilterChainDefinition.getFilterChainMap();
        filterChainMap.put("/**", "anon");
        filterFactoryBean.setFilterChainDefinitionMap(filterChainMap);
		
		return filterFactoryBean;
	}
}
