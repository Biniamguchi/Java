package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//public class CounterController {
//	@RequestMapping("/your_server")
//	public String index() {
//		return "index";
//	}
//	
//	@RequestMapping("/your_server/counter")
//	public String counter(Model model){
//		Counter count = new Count(); 
//		counter = 0
//		for i in count: 
//			if not i in counter
//			counter =0
//			else:
//				counter +=1
//	    SimpleDateFormat formatter = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, yyyy");
//		model.addAttribute("count",formatter.format(date));
//		return "_date.jsp";
//	}
//}
@Controller
//@RequestMapping("/")
public class CounterController{
	@RequestMapping("/")
	public String index(HttpSession session){
		if(session.getAttribute("count") == null){
			session.setAttribute("count",0);
		}else{
			session.setAttribute("count",(Integer) session.getAttribute("count")+1);
		}

		return "index";
	}

	@RequestMapping("/counter")
	public String counter(){
		return "count";
	}

//	@RequestMapping("/countertwo")
//	public String counterTwo(HttpSession session){
//		if(session.getAttribute("count") == null){
//			session.setAttribute("count",0);
//		}else{
//			session.setAttribute("count",(Integer) session.getAttribute("count")+2);
//		}
//		return "_counter2.jsp";
//	}
//	
	@RequestMapping("/reset")
	public String reset(HttpSession session){
		session.setAttribute("count",0);
		return "redirect:/count";
	}
}