package com.spring.orm.DAO;

import java.util.List;

import com.spring.orm.Model.Employee;

public interface EmployeeDAO 
{
	
	// INSERT RECORD
	public int create(Employee employee);
	
	// UPDATE RECORD
	public void update(Employee employee);
	
	// DELETE RECORD
	public void delete(Employee employee);
	
	// FETCH SINGLE RECORD
	public Employee getById(int id);
	
	// FETCH ALL RECORDS
	public List<Employee> getAllEmployees();

}
