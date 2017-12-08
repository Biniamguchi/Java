package com.codingdojo.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortfolioController {
	
	@RequestMapping("/")
	public String index() {
		return "forward:/index.html";
	}
	
	@RequestMapping("/project")
	public String project() {
		return "/projects.html";
	}
	
	@RequestMapping("/me")
	public String port() {
		return "/portfolio.html";
	}
//	@RequestMapping("/index")
//	public String test() {
//		return "index";
//	}
	@RequestMapping("/index")
    public String test(Model model) {
            model.addAttribute("dojoName", "Burbank");
            return "index";
    }
}

