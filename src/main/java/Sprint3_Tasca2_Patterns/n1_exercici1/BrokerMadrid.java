package Sprint3_Tasca2_Patterns.n1_exercici1;

public class BrokerMadrid extends Observer {

	private String message = "Broker Madrid says that the stock exchange is ";
	
	public BrokerMadrid(Subject subject) {
	this.subject = subject;
	this.subject.addObserver(this);
	}

	@Override
	public void update() {
		
		System.out.println(message + subject.getState());
	}

}
