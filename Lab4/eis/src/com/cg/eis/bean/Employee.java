package com.cg.eis.bean;

//In this package, create “Employee” class with different attributes such as 
//id, name, salary, designation, insuranceScheme.

public class Employee {
	
	/**
	 * This holds the Employee id
	 */
	private int id;
	/**
	 * This holds the Employee name
	 */
	private String name;
	/**
	 * This holds the Employee salary
	 */
	private int salary;
	/**
	 * This holds the Employee designation
	 */
	private String designation;
	/**
	 * This holds the Employee insurance scheme
	 */
	private String insuranceScheme;
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
	
	
}
