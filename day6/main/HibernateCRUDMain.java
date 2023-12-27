package day6.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import day6.beans.Restaurant;
import day6.utils.HibernateUtils;

public class HibernateCRUDMain {
	private static void showRestaurantAgain() {
		//Use lazy=false for EAGER initialization
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		Class<Restaurant> entityClassType = Restaurant.class;
		Serializable entityId = 101;
				
		Restaurant foundRestaurant = session.load(entityClassType, entityId);
		System.out.println(foundRestaurant.getClass().getName());
	
		System.out.println(foundRestaurant.getRestaurantId());
		System.out.println(foundRestaurant.getRestaurantId());
		System.out.println(foundRestaurant.getRestaurantId());
		System.out.println(foundRestaurant.getRestaurantId());
		System.out.println(foundRestaurant.getCuisine());
		System.out.println(foundRestaurant.getName());
	}
	private static void deleteRestaurant() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Class<Restaurant> entityClassType = Restaurant.class;
		Serializable entityId = 102;//Serializable entityId  = new Integer(101);
		Restaurant foundRestaurant = session.load(entityClassType, entityId);
		
		Transaction tx = session.beginTransaction();
			session.delete(foundRestaurant);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record deleted");
	}
	private static void updateRestaurant() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Class<Restaurant> entityClassType = Restaurant.class;
		Serializable entityId = 101;//Serializable entityId  = new Integer(101);
		Restaurant foundRestaurant = session.load(entityClassType, entityId);
		
		Transaction tx = 	session.beginTransaction();
			foundRestaurant.setCuisine("Oriental");
			foundRestaurant.setBranchCount(12);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record updated");
		
	}
	private static void showOneRestaurant() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		//Specifying the entity specific Class type using a reference of type 'Class' class
		Class<Restaurant> entityClassType = Restaurant.class;
		//Class<Employee> type = Employee.class;
		
		//Specifying the identity in the form of java.io.Serializable
		Serializable entityId = 101;//Serializable entityId  = new Integer(101);
		
		
		Restaurant foundRestaurant = session.load(entityClassType, entityId);
		System.out.println(foundRestaurant);
		session.close();
		factory.close();
		
		
	}
	
	private static void createNewRestaurant() {
		//Building Configuration Object
		Configuration hibernateConfig = new Configuration();//Looks for hibernate.properties
		//Obtaining SessionFactory
		hibernateConfig = hibernateConfig.configure();//Looks for hibernate.cfg.xml
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		//Obtaining Session
		Session hibernateSession = hibernateFactory.openSession();
		//Creating Entity Class Object
		Restaurant rst = new Restaurant(102, "Hotel Sliversand", "Thai", 7);
		//Obtaining and Starting 'Transaction' using 'Session'
		Transaction hibernateTransaction = hibernateSession.beginTransaction();
		//Attaching the Entity Class Object to the "Session'
			hibernateSession.save(rst);
		//Committing the 'Transaction'
		hibernateTransaction.commit();
		//Closing the Session
		hibernateSession.close();
		//Closing the SessionFactory
		hibernateFactory.close();
		System.out.println("Restaurant created successfully.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createNewRestaurant();
		//showOneRestaurant();
		//updateRestaurant();
		//deleteRestaurant();
		showRestaurantAgain();

	}

}
