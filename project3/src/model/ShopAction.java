package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.ConnectionUtility;

public class ShopAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	try {
		Connection con=ConnectionUtility.createConnection();
		int shopid=Integer.parseInt(request.getParameter("shopid"));
		String shopname=request.getParameter("shopname");
		PreparedStatement ps = con.prepareStatement("insert into shop(shopid,shopname) values(?,?);");
		ps.setInt(1,shopid);
		ps.setString(2,shopname);
		ps.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	return "shop.success";
}
}
