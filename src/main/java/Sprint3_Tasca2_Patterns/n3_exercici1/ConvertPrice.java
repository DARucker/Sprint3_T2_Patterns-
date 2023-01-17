package Sprint3_Tasca2_Patterns.n3_exercici1;

import java.util.List;

public class ConvertPrice {

	// This class is "injected" with the object IRates
	// so it can use its method convert wich return the 
	// exchange rate for each currency.

	private IRates irate;

	public ConvertPrice(IRates irate) {
		this.irate = irate;
	}

	public void priceConverted(List<Article> articles) {
		
		articles.forEach(s -> System.out.println(s.getName() + " " + String.format("%.2f", s.getPrice()* irate.convert())));
		
	}

}
