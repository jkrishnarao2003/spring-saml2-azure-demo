package com.test.spring.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	public HomeController() {
		System.out.println("HomeController.HomeController()");
	}

    @RequestMapping(path = "/home")
    public ModelAndView handle(HttpServletRequest request) {
    	System.out.println("HomeController.handle()");
        return new ModelAndView("home");
    }
}