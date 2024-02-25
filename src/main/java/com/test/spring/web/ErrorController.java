package com.test.spring.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {
	
	public ErrorController() {
		System.out.println("ErrorController.ErrorController()");
	}

    @RequestMapping(path = "/error", method = RequestMethod.GET)
    public ModelAndView handle(HttpServletRequest request) {
    	System.out.println("Error Code:" +request.getAttribute("javax.servlet.error.status_code")+" Message: "+request.getAttribute("javax.servlet.error.message"));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", request.getAttribute("javax.servlet.error.status_code"));
        map.put("reason", request.getAttribute("javax.servlet.error.message"));
    	return new ModelAndView("error",map);
    }
}