package comppack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class CompKeyReadClient {
	
	public static void main(String[] args) {
		
		SessionFactory factory = 
				new AnnotationConfiguration().
				configure("hibernate.anno.cfg.xml").buildSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			Invoice in=(Invoice)session.get(Invoice.class,new CompKey());
			System.out.println(in.getDetails());
			
		
	}

}
