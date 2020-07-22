package com.oguzhanun.springboot.thymleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oguzhanun.springboot.thymleaf.entity.Roller;
import com.oguzhanun.springboot.thymleaf.entity.Uyeler;


public interface RollerRepository extends JpaRepository<Roller, Uyeler> {

}
