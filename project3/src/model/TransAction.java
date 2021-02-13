package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.ConnectionUtility;

public class TransAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		try {
			Connection con=ConnectionUtility.createConnection();
			int billno=Integer.parseInt(request.getParameter("billno"));
			int itemid=Integer.parseInt(request.getParameter("itemid"));
			int qty=Integer.parseInt(request.getParameter("qty"));
			PreparedStatement ps = con.prepareStatement("insert into trans(billno,itemid,qty) values(?,?,?);");
			ps.setInt(1,billno);
			ps.setInt(2,itemid);
			ps.setInt(3,qty);
			ps.executeUpdate();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		return "logout.success";
	}

}
