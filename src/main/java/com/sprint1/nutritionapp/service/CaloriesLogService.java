package com.sprint1.nutritionapp.service;

import java.util.List;

import com.sprint1.nutritionapp.domain.CaloriesLog;

public interface CaloriesLogService {
	
	public CaloriesLog addCaloriesLog( CaloriesLog  calorieslog) ;
	public CaloriesLog updateCaloriesLog( CaloriesLog  calorieslog) ;
	public CaloriesLog removeCaloriesLog( CaloriesLog  calorieslog) ;
	public List<CaloriesLog> showAllCaloriesLog();

}