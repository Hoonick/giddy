package com.hoonick.giddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@PostMapping("login")
	@ResponseBody
	public String login() {
		
		return "success";
	}
}
