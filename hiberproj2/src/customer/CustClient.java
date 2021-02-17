package customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustClient {
	
	public static void main(String[] args) throws Exception{
		
		SessionFactory factory = 
				new Configuration().
				configure("hibernate.anno.cfg.xml").buildSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			CustDTO c1=new CustDTO();
			c1.cname="raja";
			c1.cadd="chennai";
			
			CustDTO c2=new CustDTO();
			c2.cname="rani";
			c2.cadd="bangalore";
			
			session.save(c1);
			session.save(c2);
			
			tx.commit();
		
	}

}
