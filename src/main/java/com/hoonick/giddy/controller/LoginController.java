package com.hoonick.giddy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;

@Controller
public class LoginController {

	
//	@PostMapping("login")
	@GetMapping("login")
	@ResponseBody
	public Object login() {
		return "success";
	}
}
