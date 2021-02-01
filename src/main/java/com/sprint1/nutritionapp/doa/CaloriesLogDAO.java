package com.sprint1.nutritionapp.doa;



import java.util.List;

import com.sprint1.nutritionapp.domain.CaloriesLog;

/**
 * This class Performs all crud operations
 * @author shweta
 *
 */
public interface CaloriesLogDAO {
	/**
	 * save method saves the calories log
	 * @param calorieslog to be saved
	 * @return
	 */
	CaloriesLog  save(CaloriesLog calorieslog);
	/**
	 * update method updates the calories log
	 * @param calorieslog to be updated
	 * @return
	 */
	CaloriesLog  update(CaloriesLog calorieslog) ;
	/**
	 * delete method deletes the calories log
	 * @param calorieslog to be deleted
	 * @return
	 */
	CaloriesLog delete(CaloriesLog calorieslog) ;
	/**
	 * lists all the calories log
	 * @param calorieslog to be listed
	 */
	List<CaloriesLog> findAll();
}
