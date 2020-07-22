package com.oguzhanun.springboot.thymleaf.service;

import java.util.List;
import com.oguzhanun.springboot.thymleaf.entity.Employee;


public interface EmployeeService {
	
	public List<Employee> findAllEmployee();
	public Employee findEmployee(int id);
	public Employee saveOrUpdateEmployee(Employee employee);
	public int deleteEmployee(int id);

}
