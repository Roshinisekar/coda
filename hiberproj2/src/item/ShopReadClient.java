package item;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ShopReadClient {
	
	public static void main(String[] args) {
		
		SessionFactory factory = 
				new AnnotationConfiguration().
				configure("hibernate.anno.cfg.xml").buildSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			ShopDTO shop=(ShopDTO)session.get(ShopDTO.class,new String("s1"));
			System.out.println(shop.shopid);
			System.out.println(shop.shopname);
			
			ShopDTO shop1=(ShopDTO)session.get(ShopDTO.class,new String("s2"));
			System.out.println(shop1.shopid);
			System.out.println(shop1.shopname);
			
			ShopDTO shop2=(ShopDTO)session.get(ShopDTO.class,new String("s3"));
			System.out.println(shop2.shopid);
			System.out.println(shop2.shopname);
		
	}

}
