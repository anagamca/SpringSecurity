package com.spring.security;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model, Principal principal) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/secure/secureView", method = RequestMethod.GET)
	public String secureView(Locale locale, Model model, Principal principal) {
		logger.info("Welcome Secure View! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		logger.info("Principal." +principal.getName());
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("yourName",principal.getName());
		
		return "securedpage";
	}
	
	@RequestMapping(value = "/secure/extreme/secureView", method = RequestMethod.GET)
	public String extremeSecureView(Locale locale, Model model, Principal principal) {
		logger.info("Welcome Extreme Secure View! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		logger.info("Principal." +principal.getName());
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("yourName",principal.getName());
		
		return "extremepage";
	}
	
}
