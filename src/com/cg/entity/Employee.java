package com.cg.entity;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empID;
	private String name;
	private int salary;
	private String designation=null;
	private String insuranceScheme=null;
	
	
	public Employee(int empID, String name, int salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
		
	}


	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getInsuranceScheme() {
		return insuranceScheme;
	}


	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}


	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary +  "]";
	}
	
	
	
	
}
