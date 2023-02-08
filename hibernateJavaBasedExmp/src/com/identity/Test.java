package com.identity;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernatejavabasegetnloadmethod.Movies;

public class Test {
	
	private static void getmethod(Session session) {  // for get/fetch the data of perticular id(using get method)
		Car car = session.get(Car.class, 1);
		System.out.println(car.getCid());;
		System.out.println(car.getCname());
		
		
	}
	
	private static void loadmethod(Session session) {    // for get/fetch the data of perticular id(using load method)
		Car car = session.get(Car.class, 2);
		System.out.println(car.getCid());;
		System.out.println(car.getCname());
	}
	
	private static void updatemethod(Session session) {  // update the any values from our table
		Car car = session.get(Car.class, 3);
		System.out.println(car.getCid());;
		System.out.println(car.getCname());
		
		System.out.println("----------update method----------");
		car.setCname("swift desire");
		session.update(car);
		session.beginTransaction().commit();
		
	}
	
	private static void deletemethod(Session session) {    // delete the any values from our table
		
		Car car = session.get(Car.class, 1);
		System.out.println(car.getCid());;
		System.out.println(car.getCname());
		
		System.out.println("-----------delete method----------");
		session.delete(car);
		session.beginTransaction().commit();
	}
	
	
	// this is HQL query
	
	private static void fetchalldata(Session session) {    // for fetching the all data from our table . 
	org.hibernate.query.Query<Car> query = 	session.createQuery("from Car");
	List<Car> clist = query.getResultList();
	System.out.println(clist);
		
	
		
	}
	
	

	public static void main(String[] args) {
		
		
		SessionFactory sf = HbUtil.getSessionFactory();
		Session session = sf.openSession();
		
		//fetchalldata(session); // static mathods
		//getmethod(session);
		//loadmethod(session);
		//updatemethod(session);
		deletemethod(session);
		
		
		//Car car = new Car();
		//car.setCname("altroz");
		
		//Cdriver cdr = new Cdriver();
		//cdr.setCdriverName("sagar");
		
		
		//session.save(car);
		//session.save(cdr);
		
		//session.beginTransaction().commit();
		//System.out.println("data inserted successfully");

	}

}
