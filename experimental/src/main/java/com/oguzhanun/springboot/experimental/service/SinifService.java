package com.oguzhanun.springboot.experimental.service;


import java.util.List;
import com.oguzhanun.springboot.experimental.entity.Sinif;


public interface SinifService 
{
	
	public List<Sinif> findAll();
	
	public Sinif find(int id);
	
	public Sinif saveOrUpdate(int id);
	
	public int delete(int id);

}
