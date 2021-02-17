package item;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="shop")
@Table(name="shop")
public class ShopDTO implements Serializable,Comparable<ShopDTO>{
	@Id
	public String shopid;
	public String shopname;
	

	public String getShopid() {
		return shopid;
	}


	public void setShopid(String shopid) {
		this.shopid = shopid;
	}


	public String getShopname() {
		return shopname;
	}


	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	
	public ShopDTO() {
		// TODO Auto-generated constructor stub
	}


	public ShopDTO(String shopid, String shopname) {
		this.shopid = shopid;
		this.shopname = shopname;
	}


	@Override
	public int compareTo(ShopDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shopid == null) ? 0 : shopid.hashCode());
		result = prime * result + ((shopname == null) ? 0 : shopname.hashCode());
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
		ShopDTO other = (ShopDTO) obj;
		if (shopid == null) {
			if (other.shopid != null)
				return false;
		} else if (!shopid.equals(other.shopid))
			return false;
		if (shopname == null) {
			if (other.shopname != null)
				return false;
		} else if (!shopname.equals(other.shopname))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ShopDTO [shopid=" + shopid + ", shopname=" + shopname + "]";
	}

}

