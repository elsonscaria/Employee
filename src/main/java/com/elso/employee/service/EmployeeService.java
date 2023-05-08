package com.elso.employee.service;

import java.util.List;

import com.elso.employee.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployeeById(Long id);

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Long id, Employee employee);

	void deleteEmployee(Long id);

}
