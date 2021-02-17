package item;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ItemsClient {
	
	public static void main(String[] args) throws Exception{
		
		
		SessionFactory factory = 
				new Configuration().
				configure("hibernate.anno.cfg.xml").buildSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			ItemsDTO i1=new ItemsDTO();
			i1.desp="tomato";
			i1.unit="kg";
			i1.price=40;
			i1.shopid="s1";
			
			ItemsDTO i2=new ItemsDTO();
			i2.desp="apple";
			i2.unit="kg";
			i2.price=150;
			i2.shopid="s2";
			
			ItemsDTO i3=new ItemsDTO();
			i3.desp="mutton";
			i3.unit="kg";
			i3.price=400;
			i3.shopid="s3";
			
			session.save(i1);
			session.save(i2);
			session.save(i3);
			
			tx.commit();
			
	}

}
