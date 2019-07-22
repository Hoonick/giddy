package com.hoonick.giddy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hoonick.giddy.dao.UserDao;
import com.hoonick.giddy.entity.User;

@Controller
public class HelloController
{
	@Autowired
	private UserDao userDao;
	
	@GetMapping("sayhello")
	public Map<String, Object> hello(){
		Map<String, Object> map = new HashMap<>();
		map.put("message", "hello world");
		return map;
	}
	
	@GetMapping("sayhello2")
	public Map<String, Object> hello2(){
		Map<String, Object> map = new HashMap<>();
		map.put("message", "hello world");
		return map;
	}
	
	@GetMapping("/jump/{viewName}")
	public String jump(@PathVariable("viewName") String viewName) {
		
		return "redirect:/"+viewName;
	}
	
	@GetMapping("findUserById")
	public User findUser(Long id) {
		return userDao.getOne(id);
	}
}
