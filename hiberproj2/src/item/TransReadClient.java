package item;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TransReadClient {
	
	public static void main(String[] args) {
		

		SessionFactory factory = 
				new AnnotationConfiguration().
				configure("hibernate.anno.cfg.xml").buildSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			TransDTO trans=(TransDTO)session.get(TransDTO.class,new Integer(1));
			System.out.println(trans.billdate);
			System.out.println(trans.discount);
			System.out.println(trans.gst);
		
	}

}
