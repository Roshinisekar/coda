package customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class CustReadClient {
	public static void main(String[] args) {
		
		SessionFactory factory = 
				new AnnotationConfiguration().
				configure("hibernate.anno.cfg.xml").buildSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
		
			CustDTO cust=(CustDTO)session.get(CustDTO.class,Integer.valueOf(1));
			System.out.println(cust.getCname());
			System.out.println(cust.getCadd());
			
			CustDTO cust1=(CustDTO)session.get(CustDTO.class,Integer.valueOf(2));
			System.out.println(cust1.getCname());
			System.out.println(cust1.getCadd());
			
		
	}

}
