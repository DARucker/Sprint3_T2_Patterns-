package Sprint3_Tasca2_Patterns.n3_exercici1;

public class Article {

	private double price;
	private String name;
	
	public Article(double price, String name) {
		this.price = price;
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
