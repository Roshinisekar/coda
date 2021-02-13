package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.ConnectionUtility;

public class InvoiceAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		try {
			Connection con=ConnectionUtility.createConnection();
			int billno=Integer.parseInt(request.getParameter("billno"));
			String billdate=request.getParameter("billdate");
			int custid=Integer.parseInt(request.getParameter("custid"));
			int discount=Integer.parseInt(request.getParameter("discount"));
			int gst=Integer.parseInt(request.getParameter("gst"));
			PreparedStatement ps = con.prepareStatement("insert into invoice(billno,billdate,custid,discount,gst) values(?,?,?,?,?);");
			ps.setInt(1,billno);
			ps.setString(2,billdate);
			ps.setInt(3,custid);
			ps.setInt(4,discount);
			ps.setInt(5,gst);
			ps.executeUpdate();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		return "pdf.success";
	}

}
