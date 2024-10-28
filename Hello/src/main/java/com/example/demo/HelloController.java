package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello/{name},{age}")
	public String sayHello(@PathVariable("name") String name,
			@PathVariable("age") int age) {
		return "안녕하세요!" + name + "씨!! 당신은 " + age + "세입니다.";
	}
}
