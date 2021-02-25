package otherObserver;

public class GrabStocks {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		//observer1 will observe stockGrabber
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAapPrice(677.60);
		stockGrabber.setGoogPrice(676.40);

		StockObserver observer2 = new StockObserver(stockGrabber);

		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAapPrice(677.60);
		stockGrabber.setGoogPrice(676.40);
		
		stockGrabber.unRegister(observer1);
		
		
	}

}
