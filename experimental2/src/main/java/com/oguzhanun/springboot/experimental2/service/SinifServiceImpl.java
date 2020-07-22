package com.oguzhanun.springboot.experimental2.service;


import com.oguzhanun.springboot.experimental2.entity.Sinif;
import com.oguzhanun.springboot.experimental2.repository.SinifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
public class SinifServiceImpl implements SinifService {

	
	@Autowired
	private SinifRepository sinifRepository;

	
	@Override
	@Transactional
	public List<Sinif> findAll() 
	{	
		return sinifRepository.findAll();
	}

	@Override
	@Transactional
	public Sinif find(int id) 
	{
		Optional<Sinif> sinifOpt = sinifRepository.findById(id);

		Sinif sinif = null;

		if(sinifOpt.isPresent())
		{
			sinif = sinifOpt.get();
		} else
			{
				throw new NoSuchElementException();
			}
	
		return sinif;
	}

	@Override
	@Transactional
	public Sinif saveOrUpdate(Sinif sinif)
	{
		return sinifRepository.save(sinif);
	}

	@Override
	@Transactional
	public int delete(int id)
	{
		if(id != 0)
		sinifRepository.deleteById(id);
		return id;
	}

}
