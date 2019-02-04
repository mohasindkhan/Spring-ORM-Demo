package com.spring.orm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee 
{
	
	@Id
	@Column(name="ID")
	private int EmpID;
	
	@Column(name="Name")
	private String EmpName;
	
	@Column(name="Department")
	private String EmpDept;
	
	@Column(name="Address")
	private String EmpAdd;
	
	@Column(name="Age")
	private int EmpAge;
	
	@Column(name="Salary")
	private double EmpSal;

	public int getEmpID() 
	{
		return EmpID;
	}

	public void setEmpID(int empID) 
	{
		EmpID = empID;
	}

	public String getEmpName() 
	{
		return EmpName;
	}

	public void setEmpName(String empName) 
	{
		EmpName = empName;
	}

	public String getEmpDept() 
	{
		return EmpDept;
	}

	public void setEmpDept(String empDept) 
	{
		EmpDept = empDept;
	}

	public String getEmpAdd() 
	{
		return EmpAdd;
	}

	public void setEmpAdd(String empAdd) 
	{
		EmpAdd = empAdd;
	}

	public int getEmpAge() 
	{
		return EmpAge;
	}

	public void setEmpAge(int empAge) 
	{
		EmpAge = empAge;
	}

	public double getEmpSal() 
	{
		return EmpSal;
	}

	public void setEmpSal(double empSal) 
	{
		EmpSal = empSal;
	}

	@Override
	public String toString() 
	{
		return "Employee [ EmpID = " + EmpID + " , EmpName = " + EmpName + " , EmpDept = " + EmpDept + " , EmpAdd = " + EmpAdd
				+ " , EmpAge = " + EmpAge + " , EmpSal = " + EmpSal + " ] \n " + " \t ";
	}
	
	
	
}
