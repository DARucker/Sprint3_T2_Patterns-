package Sprint3_Tasca2_Patterns.n1_exercici1;

public class BrokerLondon extends Observer {

	private String message = "Broker London says that the stock exchange is ";
	
	public BrokerLondon(Subject subject) {
	this.subject = subject;
	this.subject.addObserver(this);
	}

	@Override
	public void update() {
		
		System.out.println(message + subject.getState());
	}

}
