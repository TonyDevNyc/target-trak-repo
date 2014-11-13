package com.target.trak.system.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomepageController {

	// /context-root/app/homepage/index.htm
	
	@RequestMapping(value = "/index.htm", method=RequestMethod.GET)
	public String getHomepage() {
		
		return "homepage";
	}
}
