package Sprint3_Tasca2_Patterns.n1_exercici1;

public class BrokerNewYork extends Observer {

	private String message = "Broker New York says that the stock exchange is ";
	
	public BrokerNewYork(Subject subject) {
	this.subject = subject;
	this.subject.addObserver(this);
	}

	@Override
	public void update() {
		
		System.out.println(message + subject.getState());
	}
}
