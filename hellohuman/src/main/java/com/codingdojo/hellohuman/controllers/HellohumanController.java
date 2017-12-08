package com.codingdojo.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HellohumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="fname", defaultValue="Human") String first,@RequestParam(value="lname",defaultValue="") String last,Model model){
		model.addAttribute("first","John");
		model.addAttribute("last", "Smith");
		return "index";
	}
}


  
	
			





