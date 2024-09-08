package com.example.demo04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MavenController {

	@RequestMapping("/")
	public @ResponseBody String index() {
		return "Hello Build - Maven";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value="/maven", method=RequestMethod.GET)
	public String maven(Model model) {
		
		model.addAttribute("name", "Maven 설정");
		return "maven";
	}
}
