package com.example.demo02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/helloC")
	public @ResponseBody String HelloCont() {
		return "Hello Controller";
	}
}
