package com.sprint1.nutritionapp.doaimpl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



import com.sprint1.nutritionapp.domain.CaloriesLog;
import com.sprint1.nutritionapp.util.MenuUtil;



public class CaloriesLogDAOImpl {
	MenuUtil menuUtil=new MenuUtil();
	/**
	 * save method saves new entry of the user.
	 */
	
	public CaloriesLog save(CaloriesLog calorieslog) {
		CaloriesLog caloriesLog1=calorieslog;
		caloriesLog1.setCalories(caloriesLog1.getCalories());
		caloriesLog1.setCreated_At(caloriesLog1.getCreated_At());
		caloriesLog1.setUpdated_At(caloriesLog1.getUpdated_At());
		caloriesLog1.setUserId(caloriesLog1.getUserId());
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(calorieslog);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		return calorieslog;
	
	
	}
	
	/**
	 * Calories entry for the user can be updated here.
	 */

	public CaloriesLog update(CaloriesLog calorieslog) {
		int calories=calorieslog.getCalories();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		CaloriesLog caloriesLog1=entityManager.find(CaloriesLog.class,calorieslog.getUserId());
		calorieslog.setCalories(calories);
		entityManager.persist(calorieslog);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("Successfully updated");
		return caloriesLog1;
		
	}

	/*
	 * User can Delete his/her calories Log here.
	 */
	
	public CaloriesLog delete(CaloriesLog calorieslog) {
		int calories=calorieslog.getCalories();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		CaloriesLog caloriesLog1=entityManager.find(CaloriesLog.class,calorieslog.getUserId());
		calorieslog.setCalories(calories);
		entityManager.remove(calorieslog);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("Successfully deleted");
		return caloriesLog1;
	}

	
	
	/**
	 * This method is responsible for displaying the data to the user.
	 */

	public List<CaloriesLog> findAll() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Query query=entityManager.createQuery("from CaloriesLog");
		List<CaloriesLog> rs=query.getResultList();
		for(CaloriesLog rslist:rs) {
		System.out.println("UserId"+rslist.getUserId());
		System.out.println("Calories"+rslist.getCalories());
		}
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		return rs;
			
}

}
