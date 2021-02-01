package com.sprint1.nutritionapp.serviceimpl;


import java.util.List;

import com.sprint1.nutritionapp.doaimpl.CaloriesLogDAOImpl;
import com.sprint1.nutritionapp.domain.CaloriesLog;


/*
 * implementation of CaloriesLogService interface.
 */
public class CaloriesLogServiceImpl  {
	CaloriesLog calorieslog=new CaloriesLog();
	 CaloriesLogDAOImpl calorieslogdao=new CaloriesLogDAOImpl();
	
	
	
	/**
	 *  implementation of method addCaloriesLog() of  CaloriesLogService interface
	 */
	
	public CaloriesLog addCaloriesLog(CaloriesLog calorieslog) {
		return calorieslogdao.save(calorieslog);
	}

	/**
	 *  implementation of method updateCaloriesLog() of  CaloriesLogService interface
	 */
	
	public CaloriesLog updateCaloriesLog(CaloriesLog calorieslog)  {
		return calorieslogdao.update(calorieslog);
	}

	/**
	 *  implementation of method removeCaloriesLog() of  CaloriesLogService interface
	 */
	
	public CaloriesLog removeCaloriesLog(CaloriesLog calorieslog) {
		return calorieslogdao.delete(calorieslog);
		
	}

	/**
	 *  implementation of method showAllCaloriesLog() of  CaloriesLogService interface
	 */
	
	
	public List<CaloriesLog> showAllCaloriesLog() {
		
		return calorieslogdao.findAll();
	}
	
}
