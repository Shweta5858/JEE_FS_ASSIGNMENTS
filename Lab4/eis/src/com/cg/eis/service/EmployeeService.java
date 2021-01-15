package com.cg.eis.service;

import com.cg.eis.bean.Employee;

import java.util.List;


//This package will contain code for services offered in Employee Insurance System.
//The service class will have one EmployeeService Interface and its corresponding implementation class.
//The services offered by this class are:
//i)	Get employee details from user.
//ii)	Find the insurance scheme for an employee based on salary and designation.
//iii)	Display all the details of an employee


public interface EmployeeService {
	/**
	 * This shows the employee details
	 * @param employee details
	 */
	void employeeDetails(int id, String name, int salary, String designation);
	/**
	 * This finds the scheme for employees 
	 * @param employee schemes
	 */
	String findScheme(String insuranceScheme);
	/**
	 * This shows the list of employee
	 * @param employee list
	 */
	List<Employee> showAllEmployee();
	Employee findScheme(Employee insuranceScheme);
	String findScheme1(String insuranceScheme);
	String findScheme11(String insuranceScheme);

}

