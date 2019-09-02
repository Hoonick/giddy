package com.hoonick.giddy.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//import org.apache.shiro.web.filter.AccessControlFilter;
//import org.apache.shiro.web.filter.authc.AuthenticationFilter;

public class MyShiroFilter2 /* extends AccessControlFilter */{
	/*
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		this.appliedPaths.put("/**", "onAccessDenied");
		System.out.println("hoonick onAccessDenied");
		return true;
	}
	
	@Override
	public boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		this.appliedPaths.put("/**", "onPreHandle");
		System.out.println("helloworld");
		return super.onPreHandle(request, response, mappedValue);
	}

	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {
		System.out.println("hoonick12");
		return true;
	}
	
	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
	}
	
	

	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {
		System.out.println("hoonick isAccessAllowed");
		return false;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		
		System.out.println("hoonick onAccessDenied");
		return false;
	}*/

}
