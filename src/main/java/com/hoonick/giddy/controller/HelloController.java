package com.hoonick.giddy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/helloController")
public class HelloController
{
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
}
