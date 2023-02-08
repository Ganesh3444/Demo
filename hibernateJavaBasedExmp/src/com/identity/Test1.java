package com.identity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test1 {

	public static void main(String[] args) {
		
		SessionFactory sf = HbUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Car car = session.get(Car.class, 1);
		System.out.println(car);

	}

}
