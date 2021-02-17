package item;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity(name="transaction")
@Table(name="transaction")
public class TransDTO implements Serializable,Comparable<TransDTO>{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int billno;
	public String billdate;
	@JoinColumn(name="customer_custid")
	public int custid;
	public int discount;
	public int gst;
	

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
	
	public TransDTO() {
		// TODO Auto-generated constructor stub
	}
	
	


	public TransDTO(int billno, String billdate, int custid, int discount, int gst) {
		this.billno = billno;
		this.billdate = billdate;
		this.custid = custid;
		this.discount = discount;
		this.gst = gst;
	}


	@Override
	public int compareTo(TransDTO o) {
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
		TransDTO other = (TransDTO) obj;
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


}
