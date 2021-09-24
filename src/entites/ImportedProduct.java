package entites;

public class ImportedProduct extends Product {
	
	private Double customsFree;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
	
	public double totalPrice() {
		return price + customsFree;
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Produto: " + name + " R$" + price + " (" +"Customs free " + customsFree + ")" + "valor total " + totalPrice());
		return sb.toString();
	}
}

