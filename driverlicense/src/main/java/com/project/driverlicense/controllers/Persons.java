package com.project.driverlicense.controllers;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/persons")
public class Persons {
	private final DMVService dmv;
	
	public Persons(DMVService dmv) {
		this.dmv = dmv;
	}
	
	@RequestMapping("/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "/persons/new.jsp";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String newPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "/persons/new.jsp";
		} else {
			dmv.createPerson(person);
			return "redirect:/licenses/new";
		}
	}
	
	@RequestMapping("/{id}")
	public String showPerson(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", dmv.getPerson(id));
		return "/persons/show.jsp";
	}
}
