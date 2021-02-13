package model;

import java.io.Serializable;

public class CustDTO implements Serializable,Comparable<CustDTO> {
	
	private int custid;
	private String cname;
	private String cadd;
	

	public int getCustid() {
		return custid;
	}


	public void setCustid(int custid) {
		this.custid = custid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCadd() {
		return cadd;
	}


	public void setCadd(String cadd) {
		this.cadd = cadd;
	}


	public CustDTO(int custid, String cname, String cadd) {
		this.custid = custid;
		this.cname = cname;
		this.cadd = cadd;
	}


	@Override
	public int compareTo(CustDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cadd == null) ? 0 : cadd.hashCode());
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
		result = prime * result + custid;
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
		CustDTO other = (CustDTO) obj;
		if (cadd == null) {
			if (other.cadd != null)
				return false;
		} else if (!cadd.equals(other.cadd))
			return false;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		if (custid != other.custid)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CustDTO [custid=" + custid + ", cname=" + cname + ", cadd=" + cadd + "]";
	}

}
