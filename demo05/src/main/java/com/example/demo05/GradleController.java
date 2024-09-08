package com.example.demo05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GradleController {

	@RequestMapping("/")
	public @ResponseBody String index() {
		return "Hello Build - Gradle";
	}
	
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value="/gradle",method = RequestMethod.GET)
	public String gradle(Model model) {
		
		model.addAttribute("name","Gradle 설정");
		return "gradle";
	}
}
