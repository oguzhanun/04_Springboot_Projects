package com.oguzhanun.springboot.thymleaf.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.oguzhanun.springboot.thymleaf.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
