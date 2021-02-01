package com.sprint1.nutritionapp.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 * In this class all the data in the module is stored and same is manipulated in all the classes in the app.
 * This model class is foundation of  CaloriesLog Module.
 * Also we provide defaults for caloriesLog here.
 * @author 
 *
 */
@Entity
public class CaloriesLog {
	/*
	 * Store your calories Entry.
	 * Cannot be negative.
	 * Does work with decimal values.
	 */
	Integer calories;
	/*
	 * stores date of the creation of record.
	 * Does automatically from your device.
	 */
	LocalDate created_At;
	/**
	 * Stores date of updation of record.
	 */
	LocalDate updated_At;
	/*
	 * userid is the unique identification of user.
	 * Will be asked from user whenever they access any record.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int userId;
	/**
	 * Provides initialization to module.
	 */
	public CaloriesLog() {
		super();
	}
	/**
	 * provides default values to the things user do not provide.
	 */
	public CaloriesLog(Integer calories, LocalDate created_At, LocalDate updated_At, int userId) {
		
		super();
		
		this.calories = calories;
		this.created_At = created_At;
		this.updated_At = updated_At;
		this.userId = userId;
	}
	
	/**
	 * Below are getters and setters methods for getting and storing data.
	 * getters and setters are for calories,created_At,updated_At,user_Id. 
	 * @return
	 */
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public LocalDate getCreated_At() {
		return created_At;
	}
	public void setCreated_At(LocalDate created_At) {
		this.created_At = created_At;
	}
	public LocalDate getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(LocalDate updated_At) {
		this.updated_At = updated_At;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
	this.userId = userId;
	}
	/**
	 * To String method to return all kind of  data in string format.
	 */
	@Override
	public String toString() {
		return "WeightLog [calories=" + calories + ", created_At=" + created_At + ", updated_At=" + updated_At + ", userId="
				+ userId + "]";
	}
	
	
	
}
