package com.employee.dao;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeDaoI {

	String createEmp(Object employee);

	Employee findEmpById(Integer empId);

	List<Employee> findAllEmployees();

	String deleteEmp(Integer empId);

	String updateEmp(Employee employee);

}
