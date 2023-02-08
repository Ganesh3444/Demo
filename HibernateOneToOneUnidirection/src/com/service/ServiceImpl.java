package com.service;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Util.HibernateUtil;
import com.entity.Address;
import com.entity.Student;

public class ServiceImpl implements ServiceI {

	SessionFactory sf = HibernateUtil.getSessionFactory();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addStudentWithAddress() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Student student = new Student();
		Address address = new Address();
		
		System.out.println("Enter Student Name :");
		student.setSname(sc.next());
		
		System.out.println("Enter Student City :");
		address.setCity(sc.next());
		
		System.out.println("Enter Student Dist :");
		address.setDist(sc.next());
		
		student.setSaddress(address);
		
		session.save(student);
		session.beginTransaction().commit();
	}

	@Override
	public void getAllStudentWithTheirAddress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSingleStudentWithAddress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletSingleStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSingleStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAddressUsingStudent() {
		// TODO Auto-generated method stub
		
	}

	
	
}
