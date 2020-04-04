package com.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empstData")
public class Employee {
@Id
private int id;
private String name;
private String sal;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSal() {
	return sal;
}
public void setSal(String sal) {
	this.sal = sal;
}
public Employee(int id, String name, String sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}
public Employee(){
	
}

}
