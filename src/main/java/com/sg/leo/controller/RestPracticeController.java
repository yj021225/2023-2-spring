package com.sg.leo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class RestPracticeController {
	@RequestMapping("/hello")
	public String hello() {
		return "return from /hello, RestPraticeController, 10/23 by 전영준";
	}
	
	@GetMapping("/get")
	public String get() {
		return "return from /get, RestPraticeController, 10/16 by 전영준";
	}
	
	@GetMapping(value="/getchk/{variable}")
	public String getchk(@PathVariable String variable) { 
		return "return from /getchk, RestPraticeController, 10/16 by 전영준: " + variable;
	}
	
	@GetMapping(value="/getparam")
	public String getparam( String name, String email) {
		return "return from /getparam  name= " + name + ", 이메일주소는= " + email;
	}
	
}
