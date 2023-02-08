package hibernateFirstLevelCacheExe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Showroom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private String companytyp;
	private String type;
	private String model;
	private double price;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getCompanytyp() {
		return companytyp;
	}
	public void setCompanytyp(String companytyp) {
		this.companytyp = companytyp;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Showroom [mid=" + mid + ", companytyp=" + companytyp + ", type=" + type + ", model=" + model
				+ ", price=" + price + "]";
	}
	
	
	
}
