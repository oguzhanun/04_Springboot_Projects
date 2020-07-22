package com.oguzhanun.springboot.thymleaf.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.oguzhanun.springboot.thymleaf.dao.UyelerRepository;
import com.oguzhanun.springboot.thymleaf.entity.Uyeler;


@Service
public class UyelerServiceImpl implements UyelerService 
{
	
	@Autowired
	private UyelerRepository uyelerRepository;
	
	@Override
	@Transactional
	public List<Uyeler> findAllUyeler() 
	{
		
		return uyelerRepository.findAll();
	}

	@Override
	@Transactional
	public Uyeler findUye(String id) 
	{
		
		Optional<Uyeler> option = uyelerRepository.findById(id);
		Uyeler uye = null;
		
		if(option.isPresent()) 
		{
			uye = option.get();
		} else 
		{
			throw new RuntimeException("no such entity found with the id of" + id);
		}
		
		return uye;
	}

	@Override
	@Transactional
	public Uyeler saveOrUpdateUye(Uyeler uye) 
	{
		
		return uyelerRepository.save(uye);
	}

	@Override
	@Transactional
	public void deleteUye(String id) 
	{
		uyelerRepository.deleteById(id);;
	}

}
