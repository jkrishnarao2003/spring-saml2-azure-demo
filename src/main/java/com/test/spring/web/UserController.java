package com.test.spring.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/user")
public class UserController {
	
	public UserController() {
		System.out.println("UserController.UserController()");
	}

	@RequestMapping(path = "/")
    public ModelAndView handle(HttpServletRequest request) {
    	System.out.println("HomeController.handle()");
        return new ModelAndView("user/user");
    }
}