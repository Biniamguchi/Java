package com.project.dojosurvey.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class DojosurveyController{
  

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping(path="/survey", method=RequestMethod.POST)
    public String survey(
        @RequestParam(value="name", defaultValue="default") String name,
        @RequestParam(value="location",defaultValue="") String location,
        @RequestParam(value="language",defaultValue="") String language,
        @RequestParam(value="comment",required=false) String comment, HttpSession session){

        session.setAttribute("name",name);
        session.setAttribute("location", location);
        session.setAttribute("language", language);
        session.setAttribute("comment", comment);
        return "redirect:/process";
    }
    @RequestMapping("/process")
    public String result(HttpSession session){
        return "result";
    }
    // @RequestMapping("/reset")
    // public String reset(HttpSession session) {
    //     session.setAttribute("name");
    //     session.setAttribute("location");
    //     session.setAttribute("language");
    //     session.setAttribute("comment");
    //     return "redirect:/";
    // }
    
}
