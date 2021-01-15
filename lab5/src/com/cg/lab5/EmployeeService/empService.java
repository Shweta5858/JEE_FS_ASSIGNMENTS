package com.cg.lab5.EmployeeService;

import exception.InvalidAgeException;
import exception.InvalidNameException;
import exception.InvalidEntryException;
	
	public interface empService {
		
		void service(final int age, final String fname,final String lname,final int salary) throws InvalidAgeException,InvalidNameException,InvalidNameException,InvalidEntryException;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
