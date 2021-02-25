package otherObserver;

public class StockObserver implements Observer {

	private double ibmPrice, aaplPrice, googPrice;

	// static so that all instances keeps updating it
	private static int observerIDTracker = 0;
	private int observerID;

	private Subject stockGrabber;

//end of attibutes

	// constructor
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer " + this.observerID);
		// add an observer to the stockGrabber ArrayList of observers
		stockGrabber.register(this);
	}

	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;

		printThePrices();
	}

	public void printThePrices() {
		System.out.println(observerID + "\nIBM : " + ibmPrice + "\nAAPL : " + aaplPrice + "\nGOOG : " + googPrice);
	}

}
