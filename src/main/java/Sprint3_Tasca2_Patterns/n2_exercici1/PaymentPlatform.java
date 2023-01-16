package Sprint3_Tasca2_Patterns.n2_exercici1;

public class PaymentPlatform {

	private Callback callback;
	private int ammount;

	public PaymentPlatform(int ammount, Callback callback) {
		this.ammount = ammount;
		this.callback = callback;
	}
	
	//public PaymentPlatform() {}

	public void processPayment() {
	
		System.out.println("Payment through Credit card in process");
		
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		callback.notifyCaller();
	}


	
	

	

}
