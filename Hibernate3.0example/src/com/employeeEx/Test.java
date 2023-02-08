package com.employeeEx;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Employee emp = new Employee();
		emp.setId(111);
		emp.setName("ganesh");
		emp.setAddress("Pune");
		
		Session session= sf.openSession();
		session.save(emp);
		
		session.beginTransaction().commit();
		System.out.println("Your data inserted successfully");
	}

}
