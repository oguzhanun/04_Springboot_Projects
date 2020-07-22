package com.oguzhanun.springboot.experimental2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/secured")
public class SpringSecurityController 
{
	
	@PostMapping("/uyeGirisi")
	public String uyeGirisi(Model model)
	{
		//ÇALIŞMASI İÇİN SPRING SECURITY TAGLIBS BAĞLILIĞINI 
		// PROJECT OBJECT MODEL DOSYASINA EKLEMEK ZORUNDA KALDIK...
		return "../securedPages/uyeGirisi";
	}

	@RequestMapping("/securityPersonel")
	public String securityPersonel(Model model)
	{
		return "../securedPages/securityPersonel";
	}
}
