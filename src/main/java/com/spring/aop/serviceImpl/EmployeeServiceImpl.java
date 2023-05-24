package com.spring.aop.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.entity.Employee;
import com.spring.aop.repository.EmployeeRepository;
import com.spring.aop.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.saveAndFlush(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		boolean exist = employeeRepository.existsById(employee.getId());
		if (exist) {
			employeeRepository.saveAndFlush(employee);
		} else {
			throw new RuntimeException("There is not employee with id " + employee.getId());
		}
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		return employee;
	}

	@Override
	public void deleteEmployeeByid(int id) {
		employeeRepository.deleteById(id);
	}
}

