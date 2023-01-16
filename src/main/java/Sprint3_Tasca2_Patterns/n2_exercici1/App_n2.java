package Sprint3_Tasca2_Patterns.n2_exercici1;

public class App_n2 {

	/*
	 * Callback
	 * Simula una pasarela de pago que reciba un objeto encapsulador 
	 * del método de pago a efectuar: tarjeta de crédito, Paypal o
	 * deuda en cuenta bancaria.
	 *  
	 *  La pasarela invocará el pago sin conocer la forma y devolviendo
	 *  el control a la clase de origen.
	 *   
	 * 	La clase que invoca la pasarela de pago será una tienda de zapatos.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice invoice = new Invoice();
		invoice.generateInvoice();
	}

}
