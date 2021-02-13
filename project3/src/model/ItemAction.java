package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.ConnectionUtility;

public class ItemAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			Connection con=ConnectionUtility.createConnection();
			int itemid=Integer.parseInt(request.getParameter("itemid"));
			String desp=request.getParameter("desp");
			String unit=request.getParameter("unit");
			int price=Integer.parseInt(request.getParameter("price"));
			String shopid=request.getParameter("shopid");
			PreparedStatement ps = con.prepareStatement("insert into items(itemid,desp,unit,price,shopid) values(?,?,?,?,?);");
			ps.setInt(1,itemid);
			ps.setString(2,desp);
			ps.setString(3,unit);
			ps.setInt(4,price);
			ps.setString(5,shopid);
			ps.executeUpdate();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		return "shop.success";
	}

}
