package com.cg.eis.service;

import java.util.List;
import java.util.ArrayList;
import com.cg.eis.bean.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

private List<Employee> EmployeeRepository;
	
	public EmployeeServiceImpl() {
		EmployeeRepository=new ArrayList<>();
	}

	@Override
	public void employeeDetails(int id, String name, int salary, String designation) {
		
	}

	@Override
	public String findScheme11(String insuranceScheme) {
		int salary1 = 0;
		String designation1 = null;
		if ((designation1== "manager") && (salary1==20000)){
			System.out.println("Scheme 1");
		}
		if ((designation1== "accountant") && (salary1==10000)){
			System.out.println("Scheme 2");
		}
		if ((designation1== "clerk") && (salary1==5000)){
			System.out.println("Scheme 3");
		}
		return findScheme11(insuranceScheme);
	}
	@Override
	
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		return EmployeeRepository;
	}

}	