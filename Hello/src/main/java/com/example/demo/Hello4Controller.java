package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello4Controller {
	
	@PostMapping("/hello4")
	public String sayHello(@RequestParam("name") String name) {
		return "안녕하세요! " + name + "씨!!";
	}
}
