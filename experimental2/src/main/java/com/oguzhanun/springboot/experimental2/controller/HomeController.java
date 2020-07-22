package com.oguzhanun.springboot.experimental2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import com.oguzhanun.springboot.experimental2.entity.Sinif;
import com.oguzhanun.springboot.experimental2.service.SinifService;


@Controller
public class HomeController 
{
	@Autowired
	private Sinif sinif;
	
	@Autowired
	private SinifService sinifService;

	@RequestMapping("/")
	public String home()
	{
		return "../index";
	}
	
	@GetMapping("/formTalebi")
	public String formTalebi(Model model) 
	{
		model.addAttribute(sinif);
		
		return "formPage";
	}
	
	@PostMapping("/formIsle")
	public String formIsle(@ModelAttribute Sinif sinif, WebRequest request) 
	{
		//burada database işlemleri yapılacak...
		sinifService.saveOrUpdate(sinif);
		
		return "IslenenForm";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/accessDenied-page")
	public String showAccessDeniedPage() {
		
		//return "login-page";
		return "accessDenied-page";
	}
	
}
