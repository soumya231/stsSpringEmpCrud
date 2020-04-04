package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeServiceI {

	String createEmp(Employee employee);

	List<Employee> findAllEmployees();

	Employee findEmpById(Integer empId);

	String deleteEmp(Integer empId);

	String updateEmp(Employee employee);

}
