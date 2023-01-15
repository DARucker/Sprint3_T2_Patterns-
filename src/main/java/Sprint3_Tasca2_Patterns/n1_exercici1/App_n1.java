package Sprint3_Tasca2_Patterns.n1_exercici1;

public class App_n1 {

	/*
	 * Diseña un sistema en el que un Agente de Bolsa 
	 * (Observable) notifica a varias agencias de Bolsa 
	 * (Observers) cambios cuando la Bolsa sube o baja.
	 * 
	 * Es necesario que el objeto Observable mantenga 
	 * referencias a los Observadores.
	 */
	
	
	public static void main(String[] args) {
	
		Subject subject = new Subject();
		
		new BrokerLondon(subject);
		new BrokerMadrid(subject);
		new BrokerNewYork(subject);
		
		System.out.println("Monday stock market result");
		subject.setState("up");
		System.out.println("\n");
		System.out.println("Tuesday stock market result");
		subject.setState("unchanged");
	}

}
