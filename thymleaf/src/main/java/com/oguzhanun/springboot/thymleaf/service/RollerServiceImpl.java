package com.oguzhanun.springboot.thymleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oguzhanun.springboot.thymleaf.dao.RollerRepository;
import com.oguzhanun.springboot.thymleaf.entity.Roller;
import com.oguzhanun.springboot.thymleaf.entity.Uyeler;


@Service
public class RollerServiceImpl implements RollerService 
{
	
	@Autowired
	private RollerRepository rollerRepository;
	
	@Override
	@Transactional
	public List<Roller> findAllRoller() 
	{
		
		return rollerRepository.findAll();
	}

	@Override
	@Transactional
	public Roller findRol(Uyeler id) 
	{
		
		Optional<Roller> option = rollerRepository.findById(id);
		Roller rol = null;
		
		if(option.isPresent()) 
		{
			rol = option.get();
		} else 
		{
			throw new RuntimeException("no such entity found with the id of" + id);
		}
		
		return rol;
	}

	@Override
	@Transactional
	public Roller saveOrUpdateRol(Roller rol) 
	{
		
		return rollerRepository.save(rol);
	}

	@Override
	@Transactional
	public void deleteRol(Uyeler id) 
	{
		rollerRepository.deleteById(id);;
	}

}
