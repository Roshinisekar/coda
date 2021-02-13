package control;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MySessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
         System.out.println("session created...");
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
         System.out.println("session destroyed");
    }
	
}
