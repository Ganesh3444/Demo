package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Environment;

import com.model.User;

public class HibernateUtil {

private static StandardServiceRegistry registry = null;
	
	private static SessionFactory sf = null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sf == null) {
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			map.put(Environment.URL, "jdbc:mysql://localhost:3306/mybatch22hibernateOnetomanybiExample");
			map.put(Environment.USER, "root");
			map.put(Environment.PASS, "root");
			
			map.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			map.put(Environment.SHOW_SQL, true);
			map.put(Environment.HBM2DDL_AUTO, "update");
			
			registry = new StandardServiceRegistryBuilder().applySettings(map).build();
			
			MetadataSources mds = new MetadataSources(registry).addAnnotatedClass(Products.class).addAnnotatedClass(User.class);
			
			Metadata md = mds.getMetadataBuilder().build();
			
			sf = md.buildSessionFactory();
		}
		
		return sf;
	}

}
