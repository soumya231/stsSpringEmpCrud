package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping(value="/Employee")
@CrossOrigin("http://localhost:1213")

public class RestControllerTest {
	
		@Autowired
		private EmployeeService empservice;
		
		@PostMapping(value="/create")
		public String createEmp(@RequestBody Employee employee)
		{
			return empservice.createEmp(employee);
		}
		
		@GetMapping("/findById/{empId}")
		public Employee findEmpById(@PathVariable Integer empId) {
			return empservice.findEmpById(empId);
		}
		
		@GetMapping("/fetchall")
		public List<Employee> findAllEmployees() {
			return empservice.findAllEmployees();
		}
		
		@PutMapping("/update")
		public String updateEmp(@RequestBody Employee employee) {
			return empservice.updateEmp(employee);
		}
		
		@DeleteMapping("/delete")
		public String deleteEmp(@PathVariable Integer empId)
		{
			return empservice.deleteEmp(empId);
		}
		
	}


