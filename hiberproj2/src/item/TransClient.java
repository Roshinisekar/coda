package item;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TransClient {
	
	public static void main(String[] args) throws Exception{
		
		SessionFactory factory = 
				new Configuration().
				configure("hibernate.anno.cfg.xml").buildSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			TransDTO t1=new TransDTO();
			t1.billdate="20-1-2021";
			t1.custid=1;
			t1.discount=50;
			t1.gst=18;
			
			session.save(t1);
			
			tx.commit();
		
	}

}
