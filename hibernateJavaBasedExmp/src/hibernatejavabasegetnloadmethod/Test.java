package hibernatejavabasegetnloadmethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	
	
	

	public static void main(String[] args) {
		
		SessionFactory sf = HiberUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Movies movies = new Movies();
		movies.setName("lucifer");
		movies.setPrice(249);
		
		session.save(movies);
		session.beginTransaction().commit();
		System.out.println("successfull...!");
		

		
		
	}

}
