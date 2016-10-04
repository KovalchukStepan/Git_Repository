package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		Country country = new Country(1, "sfsf", 544545);
		session.save(country);
		
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
		
		
		
	
	}
}
