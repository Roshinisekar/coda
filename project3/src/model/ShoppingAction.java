package model;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	// TODO Auto-generated method stub
	HttpSession session=request.getSession();
	String shopid=request.getParameter("shopid");
	Enumeration<String> en=request.getParameterNames();
	while(en.hasMoreElements()) {
		String name=en.nextElement();
		String value=request.getParameter(name);
		session.setAttribute(name, value);
	}
	return shopid;
}
}
