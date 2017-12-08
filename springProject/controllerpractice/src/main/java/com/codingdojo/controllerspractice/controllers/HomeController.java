package com.codingdojo.controllerspractice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "forward:/index.html";
	}
}

//@Controller
//public class HomeController {
//	@RequestMapping("/")
//	public String index() {
//		return "index.html";
//	}
//}
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/hello")
//public class HomeController {
//	@RequestMapping("")
//	public String hello() {
//		return "Hello World, everyone!!";
//	}
//	@RequestMapping("/world")
//	public String world() {
//		return "Class level annotations are cool too!!";
//	}
//
//}

