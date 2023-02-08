package hibernateJavaBasedExmp.javaBase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Employee emp = new Employee();
		 // we remove id details becoz we give auto generated value like 1,2,3 sequence
		emp.setName("ganesh1");
		emp.setAddress("pune");
		
		Student stu = new Student();
		// we remove id value
		stu.setName("ganu1");
		
		Session session = sf.openSession();
		session.save(emp);
		session.save(stu);
		
		session.beginTransaction().commit();
		System.out.println("Your data inserted successfully");

	}

}
