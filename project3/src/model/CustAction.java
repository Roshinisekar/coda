package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.ConnectionUtility;

public class CustAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			Connection con=ConnectionUtility.createConnection();
			int custid=Integer.parseInt(request.getParameter("custid"));
			String cname=request.getParameter("cname");
			String cpass=request.getParameter("cadd");
			PreparedStatement ps = con.prepareStatement("insert into customer(custid,cname,cpass) values(?,?,?);");
			ps.setInt(1,custid);
			ps.setString(2, cname);
			ps.setString(3, cpass);
			ps.executeUpdate();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		return "login.success";
	}

}
