package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utility.ConnectionUtility;

public class LoginAction extends Action{
	
	

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
		Connection con=ConnectionUtility.createConnection();
		String username=request.getParameter("uname");
		String password=request.getParameter("upass");
		PreparedStatement ps = con.prepareStatement("insert into users(uname,upass,flag) values(?,?,1);");
		ps.setString(1, username);
		ps.setString(2, password);
		ps.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String uname=request.getParameter("uname");
		
		ActionErrors errors=new ActionErrors();
		Set<ActionError> set=new HashSet<>();
		if(uname==null || uname.length()==0) {
			RequiredActionError req=new RequiredActionError("username is compulsory");
			set.add(req);
			errors.setError(set);
			request.setAttribute("errors",errors);
			return "login.error";
		}
		
		HttpSession session=request.getSession();
		session.setAttribute("uname", uname);
		
		return "login.success";
	}

}
