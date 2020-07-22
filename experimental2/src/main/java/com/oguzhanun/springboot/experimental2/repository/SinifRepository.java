package com.oguzhanun.springboot.experimental2.repository;


import com.oguzhanun.springboot.experimental2.entity.Sinif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="sinif")
public interface SinifRepository extends JpaRepository<Sinif, Integer> 
{

}
