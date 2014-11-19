package com.target.trak.system.web.controllers.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/login.htm", method=RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
}
