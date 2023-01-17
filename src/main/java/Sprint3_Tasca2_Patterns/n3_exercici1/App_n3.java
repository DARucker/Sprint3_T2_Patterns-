package Sprint3_Tasca2_Patterns.n3_exercici1;

import java.util.ArrayList;
import java.util.List;

public class App_n3 {

	/*
	 * Diseña una clase que muestre en pantalla el precio de 
	 * varios articulos ya que tendra que mostrarlos tambien 
	 * en varios tipos de moneda.
	 * 
	 * Asegurate de añadirle como Inyeccion de Dependencia 
	 * una clase Conversor de Moneda que efectue la correccion
	 *  del precio en funcion del cambio de divisa.
	 */
	
	public static void main(String[] args) {

		IRates iRate;
		
		System.out.println("\n" + " -> Lista de precios convertida a Dolar" + "\n");
		iRate = new ExchangeRateDolar();
		callPriceConverter(iRate);
		
		System.out.println("\n" + " -> Lista de precios convertida a Pesos" + "\n");
		iRate = new ExchangeRatePesoArg();
		callPriceConverter(iRate);
		
		System.out.println("\n" + " -> Lista de precios convertida a Yenes" + "\n");
		iRate = new ExchangeRateYen();
		callPriceConverter(iRate);

	}
	
	public static void callPriceConverter(IRates iRate) {
		
		List<Article> articles = new ArrayList<>();
		articles.add(new Article(2.5, "pizza"));
		articles.add(new Article(2.0, "cheeseburguer"));
		articles.add(new Article(1.0, "fries"));
		articles.add(new Article(4.25, "ice cream"));
		
		ConvertPrice cp = new ConvertPrice(iRate);
		cp.priceConverted(articles);		
	}
		
}
