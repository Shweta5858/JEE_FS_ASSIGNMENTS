package com.sprint1.nutritionapp.util;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.sprint1.nutritionapp.doaimpl.CaloriesLogDAOImpl;
import com.sprint1.nutritionapp.domain.CaloriesLog;
import com.sprint1.nutritionapp.serviceimpl.CaloriesLogServiceImpl;

public class MenuUtil {

	public void start()  {
		

	
		while(true) {
		LocalDate cr_date=LocalDate.now();
		LocalDate up_date=LocalDate.now();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice : ");
		System.out.println("1. Save the data : ");
		System.out.println("2. Add the data : ");
		System.out.println("3. Update the data : ");
		System.out.println("4. Remove the data: ");
		System.out.println("5. Exit: ");
		int choice = sc.nextInt();
		CaloriesLogDAOImpl calorieslogdao=new CaloriesLogDAOImpl();
			switch (choice) {
			case 1:
			
				System.out.println("Enter Calories : ");
				int calories=sc.nextInt();
				System.out.println("Enter userid : ");
				int userId=sc.nextInt();
				CaloriesLog calorieslog=new CaloriesLog(calories,cr_date,up_date,userId);
				CaloriesLogServiceImpl caloriesLogServiceimpl=new CaloriesLogServiceImpl();
				caloriesLogServiceimpl.addCaloriesLog(calorieslog);
				break;
			case 2:
				CaloriesLogServiceImpl caloriesLogServiceimp3=new CaloriesLogServiceImpl();
				caloriesLogServiceimp3.showAllCaloriesLog();
				List<CaloriesLog> list =  caloriesLogServiceimp3.showAllCaloriesLog();	
				break;
			
				
			case 3:
				System.out.println("Enter Calories : ");
				calories=sc.nextInt();
				System.out.println("Enter userid : ");
				userId=sc.nextInt();
				CaloriesLog calorieslog1=new CaloriesLog(calories,cr_date,up_date,userId);
				CaloriesLogServiceImpl caloriesLogServiceimpl1=new CaloriesLogServiceImpl();
				caloriesLogServiceimpl1.updateCaloriesLog(calorieslog1);		
				break;
			case 4:
				System.out.println("Enter Calories : ");
				calories=sc.nextInt();
				System.out.println("Enter userid : ");
				userId=sc.nextInt();
				CaloriesLog calorieslog2=new CaloriesLog(calories,cr_date,up_date,userId);
				CaloriesLogServiceImpl caloriesLogServiceimpl2=new CaloriesLogServiceImpl();
				caloriesLogServiceimpl2.removeCaloriesLog(calorieslog2);	
				break;
			case 5:
				System.out.println("------5. Exit--------");	
				System.exit(0);
				break;


			default:
				System.out.println("---------Wrong Choice----------");
				break;
			}
			System.out.println("Do you want to continue : (yes | no) : ");
			
	}

	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
