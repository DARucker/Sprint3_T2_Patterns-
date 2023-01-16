package Sprint3_Tasca2_Patterns.n2_exercici1;

public class Invoice implements Callback{

	PaymentPlatform paymentPlatform = new PaymentPlatform(25, this);
	
	public void generateInvoice()  {
		
	System.out.println("Invoice detail:");
	System.out.println("Ladys shoes");
	System.out.println("Amount: $25");
	System.out.println("Connecting payment Platform");
	paymentPlatform.processPayment();		
	}

	@Override
	public void notifyCaller() {

		System.out.println("Payment ok");
		System.out.println("Printing invoice");
	}
	
}
