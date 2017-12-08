package com.project.loginandreg.controllers;

import com.project.loginandreg.models.User;
import com.project.loginandreg.services.UserService;
import com.project.loginandreg.validators.UserValidator;
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
public class Users{
	private UserService   userService;
	private UserValidator userValidator;
	
	public Users(UserService userService,UserValidator userValidator){
		this.userService = userService;
		this.userValidator = userValidator;
	}
@RequestMapping(value={"/","/home"})
public String home(Principal principal,Model model){
	String email = principal.getName();
	User user = userService.findByEmail(email);	
	userService.update(user); 
	model.addAttribute("currentUser",user);
	return "homepage";
}
@RequestMapping(value={"/login","/registration"})
public String login_reg(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model){
	if(error != null) {
		model.addAttribute("errorMessage", "Invalid Credentials. Please try again.");
	}
	if(logout != null) {
		model.addAttribute("logoutMessage", "Logout Successfull!");
	}
	model.addAttribute("user",new User());
	return "loginregPage";
}

@PostMapping("/registration")
public String register(@Valid @ModelAttribute("user") User user,BindingResult res,Model model){
	userValidator.validate(user,res);
	if(res.hasErrors()){
		return "loginregPage";}
	userService.saveWithUserRole(user);
	return "redirect:/login";
	}

}

