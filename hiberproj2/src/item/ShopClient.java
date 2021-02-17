package item;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ShopClient {
	
	public static void main(String[] args) throws Exception{
		
		SessionFactory factory = 
				new Configuration().
				configure("hibernate.anno.cfg.xml").buildSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			ShopDTO s1=new ShopDTO();
			s1.shopid="s1";
			s1.shopname="vegetable";
			
			ShopDTO s2=new ShopDTO();
			s2.shopid="s2";
			s2.shopname="fruits";
			
			ShopDTO s3=new ShopDTO();
			s3.shopid="s3";
			s3.shopname="meat";
			
			session.save(s1);
			session.save(s2);
			session.save(s3);
			
			tx.commit();
		
	}

}
