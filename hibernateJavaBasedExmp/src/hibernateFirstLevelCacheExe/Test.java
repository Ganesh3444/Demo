package hibernateFirstLevelCacheExe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf = HibUtil.getSessionFactory();
		Session session = sf.openSession();
		Session session1 = sf.openSession();
		//Showroom showroom = new Showroom();
		//showroom.setCompanytyp("honda");
		//showroom.setModel("shine");
		//showroom.setType("2 wheeler");
		//showroom.setPrice(755224);
		
		//session.save(showroom);
		//session.beginTransaction().commit();
		//System.out.println("successfully save....!!");
	
		Showroom showroom = session.get(Showroom.class, 1);
		System.out.println(showroom);
		
		// to remove perticular object first level cache.
		session.evict(showroom);
		
		// to remove all objects first level cache(data) in a single time.
		session.clear();
		
		System.out.println("----------*** same seesion ****----------");
		
		// if we call same session object it does not fire the query bcz its allready save data in a cache.
		Showroom showroom1 = session.get(Showroom.class, 1);
		System.out.println(showroom1);
		
		System.out.println("----------*** Diff session ****----------");
		
		// if we call diffrent session object fire the query bcz its a new session and there is no save cache abt tht dada.
		Showroom showroom3 = session1.get(Showroom.class, 1);
		System.out.println(showroom3);
		
		
		
		
		
		

		
		
		

	}

}
