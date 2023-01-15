package Sprint3_Tasca2_Patterns.n1_exercici1;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<>();
	private String state;
	
	public String getState() {return state;}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void setState(String state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void notifyAllObservers() {
		observers.forEach(x -> x.update());
	}
	
}
