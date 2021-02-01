package com.cg.com.sprint1.nutritionapp;

import java.sql.SQLException;
import java.time.LocalDate;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.sprint1.nutritionapp.doa.CaloriesLogDAO;
import com.sprint1.nutritionapp.doaimpl.CaloriesLogDAOImpl;
import com.sprint1.nutritionapp.domain.CaloriesLog;


 
public class AppTest 
{
    
    
    private CaloriesLogDAO calorieslogDAO ;
    private CaloriesLog calorieslog;

	@Before
	public void setUp()
	{
		calorieslogDAO=(CaloriesLogDAO) new CaloriesLogDAOImpl();
		
	}


	@Test
	public void test_Save_Given_NullWeightLog_ShouldReturnNull() throws SQLException
	{

		calorieslog=null;
		CaloriesLog calorieslogTest=calorieslogDAO.save(calorieslog);
		assertNull(calorieslogTest);
	}

	@Test
	public void test_Save_GivenWeightLog_ShouldReturnWeightLogObject() throws SQLException
	{
		LocalDate date=LocalDate.now();
		calorieslog=new CaloriesLog();
		calorieslog.setCalories(75);
		calorieslog.setCreated_At(date);
		calorieslog.setUpdated_At(date);
		calorieslog.setUserId(1);
		CaloriesLog calorieslogTest=calorieslogDAO.save(calorieslog);
		assertNotNull(calorieslogTest);
	}
	
	
	
	@Test(expected = NullPointerException.class)
	public void test_delete_Given_Null_returns_Null() throws SQLException
	{LocalDate date=LocalDate.now();
	CaloriesLog calorieslog=new CaloriesLog(100,date,date,1);
	CaloriesLog update=calorieslogDAO.delete(calorieslog);
	
	}
}
