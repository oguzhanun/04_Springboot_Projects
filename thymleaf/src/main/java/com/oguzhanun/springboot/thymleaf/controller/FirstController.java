package com.oguzhanun.springboot.thymleaf.controller;


import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FirstController 
{

	@RequestMapping("/")
	public String hello(Model model) 
	{
		model.addAttribute("theDate", new Date());
		
		return "hello";
	}
	
	@RequestMapping("/login")
	public String login(Model model) 
	{
		model.addAttribute("theDate", new Date());
		
		return "login";
	}
}
