package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
	public class HomeController {

	    @RequestMapping("/")
	    public ModelAndView home() {
	        ModelAndView modelAndView = new ModelAndView();
	        modelAndView.setViewName("index");
	        modelAndView.addObject("message", "Welcome to the Zumba Management System!");
	        return modelAndView;
	    }
	}


