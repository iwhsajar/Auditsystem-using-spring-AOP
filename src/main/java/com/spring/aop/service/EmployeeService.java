package com.spring.aop.service;

import java.util.Optional;

import com.spring.aop.entity.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);

	void updateEmployee(Employee employee);

	Optional<Employee> getEmployeeById(Integer id);
	 
	void deleteEmployeeByid(int id);

}
