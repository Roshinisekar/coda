package model;

import java.io.Serializable;

public class TransDTO implements Serializable,Comparable<TransDTO>{
	
	private int billno;
	private int itemid;
	private int qty;
	

	public int getBillno() {
		return billno;
	}


	public void setBillno(int billno) {
		this.billno = billno;
	}


	public int getItemid() {
		return itemid;
	}


	public void setItemid(int itemid) {
		this.itemid = itemid;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public TransDTO(int billno, int itemid, int qty) {
		this.billno = billno;
		this.itemid = itemid;
		this.qty = qty;
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
		result = prime * result + billno;
		result = prime * result + itemid;
		result = prime * result + qty;
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
		if (billno != other.billno)
			return false;
		if (itemid != other.itemid)
			return false;
		if (qty != other.qty)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TransDTO [billno=" + billno + ", itemid=" + itemid + ", qty=" + qty + "]";
	}

}
