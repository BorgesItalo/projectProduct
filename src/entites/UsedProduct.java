package entites;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends Product {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	
	public UsedProduct() {
		
	}


	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}


	public Date getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Produto: " + name + " (used) " + " R$"+  price + " (" + "Manufacture date:  " + sdf.format(manufactureDate) + ")");
		return sb.toString();
	}
	
	
}
