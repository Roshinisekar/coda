package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.ConnectionUtility;

public class AlreadyAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			Connection con=ConnectionUtility.createConnection();
			String username=request.getParameter("uname");
			String password=request.getParameter("upass");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from users where username=?");
			if(password.equalsIgnoreCase(rs.getString(2))) {
				return "login.success";
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "login.success";
	}

}
