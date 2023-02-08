package studentTabaleExe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Student student = new Student();
		student.setId(101);
		student.setName("Ganesh");
		student.setAddress("pune");
		
		Session session= sf.openSession();
		session.save(student);
		
		session.beginTransaction().commit();
		System.out.println("data inserted sucessfully");

	}

}
