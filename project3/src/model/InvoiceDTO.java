package model;

import java.io.Serializable;

public class InvoiceDTO implements Serializable,Comparable<InvoiceDTO> {
	
	private int billno;
	private String billdate;
	private int custid;
	private int discount;
	private int gst;
	

	public int getBillno() {
		return billno;
	}


	public void setBillno(int billno) {
		this.billno = billno;
	}


	public String getBilldate() {
		return billdate;
	}


	public void setBilldate(String billdate) {
		this.billdate = billdate;
	}


	public int getCustid() {
		return custid;
	}


	public void setCustid(int custid) {
		this.custid = custid;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}


	public int getGst() {
		return gst;
	}


	public void setGst(int gst) {
		this.gst = gst;
	}


	public InvoiceDTO(int billno, String billdate, int custid, int discount, int gst) {
		this.billno = billno;
		this.billdate = billdate;
		this.custid = custid;
		this.discount = discount;
		this.gst = gst;
	}


	@Override
	public int compareTo(InvoiceDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((billdate == null) ? 0 : billdate.hashCode());
		result = prime * result + billno;
		result = prime * result + custid;
		result = prime * result + discount;
		result = prime * result + gst;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceDTO other = (InvoiceDTO) obj;
		if (billdate == null) {
			if (other.billdate != null)
				return false;
		} else if (!billdate.equals(other.billdate))
			return false;
		if (billno != other.billno)
			return false;
		if (custid != other.custid)
			return false;
		if (discount != other.discount)
			return false;
		if (gst != other.gst)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "InvoiceDTO [billno=" + billno + ", billdate=" + billdate + ", custid=" + custid + ", discount="
				+ discount + ", gst=" + gst + "]";
	}

}

