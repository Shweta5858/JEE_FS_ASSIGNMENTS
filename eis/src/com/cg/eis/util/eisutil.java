package com.cg.eis.util;
import java.util.List;
import java.util.Scanner;


import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;


public class eisutil {
private EmployeeService EmployeeService;
	
	public eisUtil() {
		EmployeeService=new EmployeeServiceImpl();
	}

	public void start() {
	Scanner sc = new Scanner(System.in) {
		System.out.println("Enter Employee Name: ");
		sc.nextLine();
		System.out.println("Enter Employee Salary: ");
		sc.nextInt();
		System.out.println("Enter Employee Designation: ");
		sc.nextLine();
		Object insuranceScheme = null;
		findScheme1(insuranceScheme);
	
}
