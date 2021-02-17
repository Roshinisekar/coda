package item;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ItemsReadClient {
	
	public static void main(String[] args) {

		SessionFactory factory = 
				new AnnotationConfiguration().
				configure("hibernate.anno.cfg.xml").buildSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			ItemsDTO item=(ItemsDTO)session.get(ItemsDTO.class,new Integer(1));
			System.out.println(item.desp);
			System.out.println(item.unit);
			System.out.println(item.price);
			
			ItemsDTO item1=(ItemsDTO)session.get(ItemsDTO.class,new Integer(2));
			System.out.println(item1.desp);
			System.out.println(item1.unit);
			System.out.println(item1.price);
			
			ItemsDTO item2=(ItemsDTO)session.get(ItemsDTO.class,new Integer(3));
			System.out.println(item2.desp);
			System.out.println(item2.unit);
			System.out.println(item2.price);
	}

}
