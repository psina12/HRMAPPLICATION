package com.saturn.hrm.controller.defaultcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

	@GetMapping("/default")
	public String getDefaultController(Model model) {
		model.addAttribute("name", "GENERIC_NAME");
		
		return "default";
	}
	
}
