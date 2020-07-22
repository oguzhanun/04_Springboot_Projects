package com.oguzhanun.springboot.thymleaf.service;

import java.util.List;

import com.oguzhanun.springboot.thymleaf.entity.Roller;
import com.oguzhanun.springboot.thymleaf.entity.Uyeler;


public interface RollerService 
{
	
	public List<Roller> findAllRoller();
	public Roller findRol(Uyeler id);
	public Roller saveOrUpdateRol(Roller rol);
	public void deleteRol(Uyeler id);
	

}
