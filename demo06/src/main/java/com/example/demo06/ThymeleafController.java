package com.example.demo06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ThymeleafController {

	// /hello --> hello.html
	// method 옵션 생략 시 GET 자동 설정 되는데 일단 써놓는다.
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("name","hello Thymeleaf");
		return "hello";
	}
	
	// /thyme --> thyme.html
	@RequestMapping(value="/thyme",method=RequestMethod.GET)
	public String thyme(Model model) {
		model.addAttribute("name","thyme.html");
		model.addAttribute("message","ThymeleafController");
		return "thyme";
	}
	
	// /user --> /data/text.html
	// th:utext는 넘기는 데이터의 태그를 인식할 수 있다.
	@GetMapping("/user")
	public String data(Model model) {
		model.addAttribute("data", "Hello <b> Thymeleaf </b>");
		return "/data/text";
	}
	
	// /number --> /data/number.html
	// th:block으로 반복문 사용
	@GetMapping("/number")
	public String number(Model model) {
		return "/data/number";
	}
		
}
