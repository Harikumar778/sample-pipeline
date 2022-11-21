package com.harry.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pro {
	
	public Pro() {
		System.out.println("Hello World");
	}
	
	@GetMapping("/abc")
	String m1() {
		return "xyz.jsp";
	}

}
