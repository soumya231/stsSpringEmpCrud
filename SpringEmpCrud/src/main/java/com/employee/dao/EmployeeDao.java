package com.employee.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;



@Repository
@Transactional
public class EmployeeDao implements EmployeeDaoI {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public String createEmp(Object employee) {
		entityManager.persist(employee); 
		return "Employee Added";
	}

	
	@Override
	public Employee findEmpById(Integer empId) {
		return  entityManager.find(Employee.class,empId);
		
	}
	
	@Override
	public List<Employee> findAllEmployees() {
		Query q=entityManager.createQuery("select r from Employee r");
		@SuppressWarnings("unchecked")
		List<Employee> l= q.getResultList();
		return l;
	}


	@Override
	public String deleteEmp(Integer empId) {
		entityManager.remove(empId);
		return "Employee Deleted";
	}


	@Override
	public String updateEmp(Employee employee) {
		entityManager.merge(employee);
		return "Employee Updated";
	}

}


