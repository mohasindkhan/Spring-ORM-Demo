package com.spring.orm.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.DAO.EmployeeDAO;
import com.spring.orm.Model.Employee;

public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println(" \n APPLICATION CONTEXT XML FILE LOADED SUCCESSFULLY ");
		
		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");
		
		EmployeeDAO empdao = (EmployeeDAO) context.getBean("employeeDAO");
		System.out.println(" \n EMPLOYEE BEAN CREATED ");
		
		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");
		
		
		
		
		System.out.println(" \n CREATE OPERATION ");
		
		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");
		
		Employee emp = new Employee();
		emp.setEmpID(1);
		emp.setEmpName("Brad Traversy");
		emp.setEmpDept("WEB DEVELOPMENT");
		emp.setEmpAdd("BOSTON");
		emp.setEmpAge(38);
		emp.setEmpSal(80000.00);
		
		Employee emp1 = new Employee();
		emp1.setEmpID(2);
		emp1.setEmpName("Chad Darby");
		emp1.setEmpDept("JAVA");
		emp1.setEmpAdd("Philadelphia");
		emp1.setEmpAge(40);
		emp1.setEmpSal(90000.00);
		
		Employee emp2 = new Employee();
		emp2.setEmpID(3);
		emp2.setEmpName("Chand Shaikh");
		emp2.setEmpDept("Spring");
		emp2.setEmpAdd("India");
		emp2.setEmpAge(30);
		emp2.setEmpSal(90000.00);
		
		Employee emp3 = new Employee();
		emp3.setEmpID(4);
		emp3.setEmpName("Bharat Thippi Reddy");
		emp3.setEmpDept("Hibernate");
		emp3.setEmpAdd("India");
		emp3.setEmpAge(32);
		emp3.setEmpSal(90000.00);
		
		Employee emp4 = new Employee();
		emp3.setEmpID(5);
		emp3.setEmpName("Navin Reddy");
		emp3.setEmpDept("GIT");
		emp3.setEmpAdd("India");
		emp3.setEmpAge(37);
		emp3.setEmpSal(75000.00);

		
		empdao.create(emp);
		empdao.create(emp1);
		empdao.create(emp2);
		empdao.create(emp3);
		empdao.create(emp4);
		
		System.out.println("\n RECORD SAVED SUCCESSFULLY ");
		
		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");
		
		
		
		
//		System.out.println(" \n UPDATE OPERATION ");
//		
//		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");
//		
//		Employee eupdate = new Employee();
//		eupdate.setEmpID(2);
//		eupdate.setEmpName("CHAND SHAIKH");
//		eupdate.setEmpDept("HIBERNATE");
//		eupdate.setEmpAdd("INDIA");
//		eupdate.setEmpAge(32);
//		eupdate.setEmpSal(95000.00);
//		
//		empdao.update(eupdate);
//		
//		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");
		
		
		
//		System.out.println(" \n DELETE OPERATION ");
//		
//		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");
//		
//		empdao.delete(emp3);
//		System.out.println("\n RECORD DELETED SUCCESSFULLY ");
//		
//		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");
		
		
		
		System.out.println(" \n GET SINGLE RECORD ");
		
		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");
		
		Employee byId = empdao.getById(2);
		
		System.out.println(byId);
		
		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");
		
		
		
		
		System.out.println(" \n GET ALL RECORDS ");
		
		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");
		
		List<Employee> allEmployees = empdao.getAllEmployees();
		
		System.out.println(allEmployees);
		
		System.out.println(" \n ------------------------------------------------------------------------------------------------------ ");

	}

}
