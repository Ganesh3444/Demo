package hibernatenewproj;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.mapping.Map;

import com.model.Products;
import com.model.User;
import com.util.HashMap;
import com.util.Object;
import com.util.String;

public class Hibutil {

	private static StandardServiceRegistry registery = null;
	private static SessionFactory sf = null;
	
	public static SessionFactory getSessionFactory() {
		if(sf==null) {
			
			java.util.Map<String,Object>m = new java.util.HashMap<String,Object>();
			m.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			m.put(Environment.URL, "jdbc:mysql://localhost:3306/IdentityProject");
			m.put(Environment.USER, "root");
			m.put(Environment.PASS, "root");
			m.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			m.put(Environment.SHOW_SQL, true);
			m.put(Environment.HBM2DDL_AUTO, "update");
			
			registery = new StandardServiceRegistryBuilder().applySettings(m).build();
			
			MetadataSources mds = new MetadataSources(registery).addAnnotatedClass(Products.class).addAnnotatedClass(User.class);
		
			Metadata md = mds.getMetadataBuilder().build();
			
			sf = md.buildSessionFactory();
		
		
		}
		return sf;
	}
}
