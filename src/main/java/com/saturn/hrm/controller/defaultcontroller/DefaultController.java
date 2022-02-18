package com.saturn.hrm.controller.defaultcontroller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.saturn.hrm.service.DefaultSerivce;

@Controller
public class DefaultController {

	@Autowired
	private DefaultSerivce deaDefaultSerivce;
	
//	private final DefaultSerivce defaultSerivce;
//	
//	public DefaultController(DefaultSerivce defaultSerivce) {
//		this.defaultSerivce = defaultSerivce;
//	}
	
	
	@GetMapping("/default/name/{name}/status/{status}")
	public String getDefaultController(Model model, 
			@PathVariable("name") String name, 
			@PathVariable("status") Boolean status,
			@RequestParam("age") Integer age) {
		
		model.addAttribute("name", name);
		model.addAttribute("isActive", status);
		model.addAttribute("age", age);
		
		List<String> nameList = new ArrayList<>();
		
		nameList.add("ram");
		nameList.add("sita");
		nameList.add("hari");
		
		model.addAttribute("nameList", nameList);
		
		model.addAttribute("sum", deaDefaultSerivce.sumOfNumber(12, 20));
		deaDefaultSerivce.printer();
		
		return "default";
	}
	
	@PostMapping("/default")
	public String getDefaultControllerByPostMethod(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("name");
		String statusString = request.getParameter("status");
		String ageString = request.getParameter("age");
		
		Boolean status = Boolean.getBoolean(statusString);
		Integer age = Integer.valueOf(ageString);
		
		model.addAttribute("name", name);
		model.addAttribute("isActive", status);
		model.addAttribute("age", age);
		
		return "default";
	}
	
}
