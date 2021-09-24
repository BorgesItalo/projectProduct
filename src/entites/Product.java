package entites;

public class Product {
	protected String name;
	protected Double price;
	
	public Product() {
		super();
	}
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Produto: " + name + " R$" + price);
		return sb.toString();
	}
}
