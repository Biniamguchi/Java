package com.codingdojo.displaytime.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {
	private static Date currentDate = new Date();
	private static SimpleDateFormat formatter;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/day")
    public String getdate(Model model) {
//		formatter = new SimpleDateFormat("EEEE, 'the ' d 'of' MMMM, yyyy");
		String formattedDate = formatter.format(currentDate);
        model.addAttribute("date", formattedDate);        
        return "date";
    }
//	@RequestMapping("/date")
//	public String date(Model model){
//	    Date date = new Date();  
//	    SimpleDateFormat formatter = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, yyyy");
//		model.addAttribute("date",formatter.format(date));
//		return "_date.jsp";
//	}
//
//	@RequestMapping("/time")
//	public String time(Model model){
//	    Date date = new Date();  
//	    SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
//		model.addAttribute("time",formatter.format(date));
//		return "_time.jsp";
//	}
//}
	@RequestMapping("/display")
    public String getTime(Model model) {
		formatter = new SimpleDateFormat("hh:mm aa");
		String formattedDate = formatter.format(currentDate);
        model.addAttribute("time", formattedDate);
        return "time";
    }
	
}
