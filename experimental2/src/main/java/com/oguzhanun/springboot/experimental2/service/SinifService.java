package com.oguzhanun.springboot.experimental2.service;


import com.oguzhanun.springboot.experimental2.entity.Sinif;

import java.util.List;


public interface SinifService 
{
	
	public List<Sinif> findAll();
	
	public Sinif find(int id);
	
	public Sinif saveOrUpdate(Sinif s);
	
	public int delete(int id);

}
