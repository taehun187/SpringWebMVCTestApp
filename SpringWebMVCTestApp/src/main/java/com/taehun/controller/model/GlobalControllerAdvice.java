package com.taehun.controller.model;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice(basePackages = "com.taehun.controller.model")
public class GlobalControllerAdvice { 
	
	@ModelAttribute
	public void addGlobalAttributes(Model model) {
		
		model.addAttribute("globalMessage", "Welcome to our website!");
	}

	
	
}
