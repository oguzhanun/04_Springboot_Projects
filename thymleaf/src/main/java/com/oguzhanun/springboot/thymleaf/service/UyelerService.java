package com.oguzhanun.springboot.thymleaf.service;

import java.util.List;
import com.oguzhanun.springboot.thymleaf.entity.Uyeler;


public interface UyelerService 
{
	
	public List<Uyeler> findAllUyeler();
	public Uyeler findUye(String id);
	public Uyeler saveOrUpdateUye(Uyeler uye);
	public void deleteUye(String id);

}
