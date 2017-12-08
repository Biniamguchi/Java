package com.project.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @PostMapping("/process")
    public String process(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
        System.out.println(code);
        if (code.equals("bushido")) {
            return "code";
        }
        else {
            redirectAttributes.addFlashAttribute("msg", "You must train harder!");
            return "redirect:/";
        }
        
    }
}

