package com.oguzhanun.springboot.experimental.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.oguzhanun.springboot.experimental.entity.Sinif;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="sinif")
public interface SinifRepository extends JpaRepository<Sinif, Integer> 
{

}
