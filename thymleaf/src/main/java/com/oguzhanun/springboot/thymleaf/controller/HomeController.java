package com.oguzhanun.springboot.thymleaf.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oguzhanun.springboot.thymleaf.entity.Roller;
import com.oguzhanun.springboot.thymleaf.entity.Uyeler;
import com.oguzhanun.springboot.thymleaf.service.RollerService;
import com.oguzhanun.springboot.thymleaf.service.UyelerService;

@Controller
@RequestMapping("/home")
public class HomeController 
{
	
	@Autowired
	private UyelerService uyelerService;
	
	@Autowired
	private RollerService rollerService;
	
	// listenin dolması için /list url i ziyaret edilmeli
	private List<String> list;
	
	@RequestMapping("/hello")
	public String home(Model model) 
	{
		
		
		model.addAttribute("theDate", new Date());
		
		Uyeler uye = new Uyeler();
		model.addAttribute("uye", uye);
		
		int a ;
		System.out.println(0x0fffffffcafebabeL);
		
		return "hello";
	}
	
	@PostMapping("/uyeOlustur")
	public String uyeOlustur(@ModelAttribute Uyeler uye, Model model) 
	{
		
		Roller rol = new Roller();
		rol.setRol("user");
		rol.setUye_id(uye);
		rol.setId("c");
		rol.setUye_id(uye);
		uye.setRoller(rol);
		uyelerService.saveOrUpdateUye(uye);
		
		return "list";
	}
	@RequestMapping("/list")
	public String list(Model model) 
	{
		
		char[][] arr = new char[][]{{'4','d'}, {'2','9'}};
		System.out.println(arr[0][1]);
		
		list = new ArrayList<String>();
		
		list.add("ali");
		list.add("ayşe");
		list.add("ahmet");
		
		model.addAttribute("theList", list);
		return "list";
	}
	
	@RequestMapping("/updateList")
	public String updateList(@RequestParam("id") int id, @RequestParam("name") String name, Model model) 
	{
		
		list = new ArrayList<String>();
		
		BigDecimal big = new BigDecimal("5.000001");
		
		
		System.out.println("Big Number : " + big);
		
		list.add("ali");
		list.add("ayşe");
		list.add("ahmet");
		model.addAttribute("id", id);
		model.addAttribute("theThingToUpdate", list.get(id));
		model.addAttribute("theObject", list);
		
		return "updateList";
	}
	
	@RequestMapping("/processList")
	public String processList(Model model) 
	{
		
		
		return "processedList";
	}
}
