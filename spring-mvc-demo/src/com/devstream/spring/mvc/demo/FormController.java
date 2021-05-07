package com.devstream.spring.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
}
