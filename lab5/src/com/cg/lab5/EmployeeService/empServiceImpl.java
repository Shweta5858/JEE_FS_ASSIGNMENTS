package com.cg.lab5.EmployeeService;

import exception.InvalidAgeException;
import exception.InvalidNameException;
import exception.InvalidEntryException;

public class empServiceImpl implements empService {

	
	public void service(final int age, final String fname,final String lname,final int salary) throws InvalidAgeException, InvalidNameException, InvalidEntryException {
		if (age<15) {
			throw new  InvalidAgeException("Not the valid age");
		}
		if (fname.isEmpty()) {
			throw new  InvalidNameException("Not a valid name");
		}
		if (lname.isEmpty()) {
			throw new  InvalidNameException("Not a valid name");
		}
		if (salary<3000) {
			throw new  InvalidEntryException("Not a valid entry");
		}	
	}
	
}
