package com.project.admindashboard.controllers;

import com.project.admindashboard.models.User;
import com.project.admindashboard.services.UserService;
import com.project.admindashboard.validators.UserValidator;
import java.security.Principal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import com.project.admindashboard.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.project.admindashboard.services.RoleService;
import com.project.admindashboard.services.UserService;
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
	@Autowired
	private RoleService roleService;
	private UserValidator userValidator;
	
	public Users(UserService userService,RoleService roleService,UserValidator userValidator){
		this.userService = userService;
		this.roleService = roleService;
		this.userValidator = userValidator;
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

// @PostMapping("/registration")
// public String register(@Valid @ModelAttribute("user") User user,BindingResult res,Model model){
// 	userValidator.validate(user,res);
// 	if(res.hasErrors()){
// 		return "loginregPage";}
// 	userService.saveWithUserRole(user);
// 	return "redirect:/login";
// 	}
	@PostMapping("/registration")
	public String register(@Valid @ModelAttribute("user") User user,BindingResult res,Model model){
		userValidator.validate(user,res);
		if(res.hasErrors()){return "loginregPage";}
		
		if(roleService.findByName("ROLE_ADMIN").getUsers().size() < 1){ // Less than one admin? Make them admin, else user.
			userService.create(new String[]{"ROLE_USER","ROLE_ADMIN"}, user);
		}else{
			userService.create(new String[]{"ROLE_USER"}, user);
		}
		return "redirect:/login";
	}
// @PostMapping("/registration")
// public String register(@Valid @ModelAttribute("user") User user,BindingResult res,Model model){
// 	userValidator.validate(user,res);
// 	if(res.hasErrors()){
// 		return "loginregPage";}
// 	userService.saveUserWithAdminRole(user);
// 	return "redirect:/login";
// 	}

	@RequestMapping("/admin")
	public String adminPage(Principal principal, Model model) {
		model.addAttribute("user",userService.findByEmail(principal.getName()));
		model.addAttribute("users",userService.all());
		// String email = principal.getName();
		// model.addAttribute("currentUser", userService.findByEmail(email));
		return "adminPage";
		}
	@RequestMapping("/superadmin")
	public String superadmin(Principal principal,Model model){
		model.addAttribute("user",userService.findByEmail(principal.getName()));
		return "superadminPage";
		}
	@RequestMapping("/admin/delete/{id}")
	public String delete(@PathVariable("id") long id){
		userService.destroy(id);
		return "redirect:/admin";
		}
	@RequestMapping("/admin/upgrade/{id}")
	public String upgrade(@PathVariable("id") long id){
		User user = userService.getById(id);
		List<Role> userRoles = user.getRoles();
		userRoles.add(roleService.findByName("ROLE_ADMIN"));
		userService.update(user);

		return "redirect:/admin";
		}

	@RequestMapping(value={"/","/home"})
	public String home(Principal principal,Model model){
		User user = userService.findByEmail(principal.getName());
		model.addAttribute("currentUser",user);
		user.setUpdatedAt(new Date());
		userService.update(user);
		
		if(user.isSuperAdmin()){
			// System.out.println("super admin");
			return "redirect:/superadminPage";
		}else if(user.isAdmin()){
			// System.out.println("admin");
			return "redirect:/admin";
		}else{
			// System.out.println("user");
			return "homepage";
		}
	}
}

