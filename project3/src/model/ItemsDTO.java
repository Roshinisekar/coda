package model;

import java.io.Serializable;

public class ItemsDTO implements Serializable,Comparable<ItemsDTO>{
	
	private int itemid;
	private String desp;
	private String unit;
	private int price;
	private String shopid;
	

	public int getItemid() {
		return itemid;
	}


	public void setItemid(int itemid) {
		this.itemid = itemid;
	}


	public String getDesp() {
		return desp;
	}


	public void setDesp(String desp) {
		this.desp = desp;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getShopid() {
		return shopid;
	}


	public void setShopid(String shopid) {
		this.shopid = shopid;
	}


	public ItemsDTO(int itemid, String desp, String unit, int price, String shopid) {
		this.itemid = itemid;
		this.desp = desp;
		this.unit = unit;
		this.price = price;
		this.shopid = shopid;
	}


	@Override
	public int compareTo(ItemsDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desp == null) ? 0 : desp.hashCode());
		result = prime * result + itemid;
		result = prime * result + price;
		result = prime * result + ((shopid == null) ? 0 : shopid.hashCode());
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
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
		ItemsDTO other = (ItemsDTO) obj;
		if (desp == null) {
			if (other.desp != null)
				return false;
		} else if (!desp.equals(other.desp))
			return false;
		if (itemid != other.itemid)
			return false;
		if (price != other.price)
			return false;
		if (shopid == null) {
			if (other.shopid != null)
				return false;
		} else if (!shopid.equals(other.shopid))
			return false;
		if (unit == null) {
			if (other.unit != null)
				return false;
		} else if (!unit.equals(other.unit))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ItemsDTO [itemid=" + itemid + ", desp=" + desp + ", unit=" + unit + ", price=" + price + ", shopid="
				+ shopid + "]";
	}

}
