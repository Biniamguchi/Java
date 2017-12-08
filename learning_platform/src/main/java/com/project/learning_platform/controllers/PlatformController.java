package com.project.learning_platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlatformController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    
    @RequestMapping("/m/{chapter}/{code}/{assignmentNumber}")
    public String show_assignment(

        @PathVariable("chapter") String discard, 
        @PathVariable("code") String code, 
        @PathVariable("assignmentNumber") String assignmentNumber) {

            if (code.equals("0483")){
                return "assignment";
            }
            else if (code.equals("0553")) {
                return "lesson";
            }
            else if (code.equals("0672")) {
                return "quiz";
            }
            else {
                return "redirect:/";
            }
            
    }
    
}




