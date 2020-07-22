package com.oguzhanun.springboot.experimental.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oguzhanun.springboot.experimental.entity.Sinif;
import com.oguzhanun.springboot.experimental.repository.SinifRepository;


@Service
public class SinifServiceImpl implements SinifService {

	
	@Autowired
	private SinifRepository sinifRepository;

	
	@Override
	public List<Sinif> findAll() 
	{	
		return sinifRepository.findAll();
	}

	@Override
	public Sinif find(int id) 
	{
		Optional<Sinif> sinifOpt = sinifRepository.findById(id);
	
		return null;
	}

	@Override
	public Sinif saveOrUpdate(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
