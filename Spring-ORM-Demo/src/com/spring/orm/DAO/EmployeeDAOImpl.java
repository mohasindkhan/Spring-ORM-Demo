package com.spring.orm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.Model.Employee;

@Component("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	// INSERT RECORD IN DB
	@Override
	@Transactional(readOnly = false)
	public int create(Employee employee) 
	{
		// TODO Auto-generated method stub
		Integer res = (Integer) hibernateTemplate.save(employee);
		return res;
	
	}
	
	// UPDATE RECORD IN DB
	@Override
	@Transactional(readOnly = false)
	public void update(Employee employee) 
	{
		// TODO Auto-generated method stub
		hibernateTemplate.update(employee);
	}

	// DELETE RECORD IN DB
	@Override
	@Transactional(readOnly = false)
	public void delete(Employee employee) 
	{
		// TODO Auto-generated method stub
		hibernateTemplate.delete(employee);
	}
	
	// FETCH SINGLE RECORD FROM DB
	@Override
	public Employee getById(int id) 
	{
		// TODO Auto-generated method stub
		Employee load = hibernateTemplate.get(Employee.class, id);
		return load;
	}

	// FETCH ALL RECORDS FROM DB
	@Override
	public List<Employee> getAllEmployees() 
	{
		// TODO Auto-generated method stub
		List<Employee> loadAll = hibernateTemplate.loadAll(Employee.class);
		return loadAll;
	}

}
