package otherObserver;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList <Observer> observers = new ArrayList<Observer>();
	private double ibmPrice, aaplPrice, googPrice;
	
	
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unRegister(Observer deletedObserver) {
		//print a msg that a specific observer was deleted 
		int observerIndex = observers.indexOf(deletedObserver);
		System.out.println("Observer " + (observerIndex+1) + " deleted");
		observers.remove(observerIndex);
		//observers.remove(deletedObserver);
	}

	/**
	 * Updates all the observer in the observers list 
	 */
	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	
	public void setIBMPrice(double newIBMPrice) {
		//sets new price
		this.ibmPrice = newIBMPrice;
		//notifies 
		notifyObserver();
	}

	public void setAapPrice(double newAaplPrice) {
		//sets new price
		this.aaplPrice = newAaplPrice;
		//notifies 
		notifyObserver();
	}
	
	public void setGoogPrice(double newgoogPrice) {
		//sets new price
		this.googPrice = newgoogPrice;
		//notifies 
		notifyObserver();
	}
	
	
}
