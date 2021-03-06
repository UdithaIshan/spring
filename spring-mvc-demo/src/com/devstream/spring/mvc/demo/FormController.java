package com.devstream.spring.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class FormController {
	
	@RequestMapping("/form")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "form_data";
	}

	@RequestMapping("/processFormWithModel")
	public String processFormWithModel(HttpServletRequest request, Model model) {
		String theName = request.getParameter("myname");
		theName = theName.toUpperCase();
		String result = "Hello " + theName;
		model.addAttribute("message", result);
		return "form_data";
	}
	
	@RequestMapping("/processFormWithModelV2")
	public String processFormWithModelV2(@RequestParam("myname") String theName, Model model) {
		theName = theName.toUpperCase();
		String result = "Hello from v2 " + theName;
		model.addAttribute("message", result);
		return "form_data";
	}
}
