package mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator {

	private ArrayList<Colleague> colleagues;
	private ArrayList<StockOffer> stockBuyOffer;
	private ArrayList<StockOffer> stockSellOffer;

	private int colleagueCodes = 0;

	public StockMediator() {
		super();
		colleagues = new ArrayList<Colleague>();
		stockBuyOffer = new ArrayList<StockOffer>();
		stockSellOffer = new ArrayList<StockOffer>();
	}

	@Override
	public void addColleague(Colleague newColleague) {
		colleagues.add(newColleague);
		colleagueCodes++;
		newColleague.setCollCode(colleagueCodes);
	}

	@Override
	public void saleOffer(String stock, int shares, int collCode) {

		boolean stockSold = false;

		for (StockOffer offer : stockBuyOffer) {
			if ((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)) {
				System.out
						.println(shares + " shares of " + stock + " sold to colleague code " + offer.getCollegueCode());
				stockBuyOffer.remove(offer);
				stockSold = true;
			}
			if (stockSold) {
				break;
			}
		}
		if (!stockSold) {
			System.out.println(shares + " share of " + stock + " added to inventory");

			StockOffer newOffering = new StockOffer(shares, stock, collCode);
			stockSellOffer.add(newOffering);
		}
	}

	@Override
	public void buyOffer(String stock, int shares, int collCode) {
		
		boolean stockBought = false;

		
		for (StockOffer offer : stockSellOffer) {
			if ((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)) {
				System.out
						.println(shares + " shares of " + stock + " bougth by colleague code " + offer.getCollegueCode());
				stockSellOffer.remove(offer);
				stockBought = true;
			}
			if (stockBought) {
				break;
			}
		}
		if (!stockBought) {
			System.out.println(shares + " share of " + stock + " added to inventory");

			StockOffer newOffering = new StockOffer(shares, stock, collCode);
			
			stockBuyOffer.add(newOffering);
		}
	}
	
	public void getStockOfferings() {
		
		System.out.println("\nStocks for sale");
		
		for(StockOffer offer : stockSellOffer) {
			System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
		}
		
		System.out.println("\nStock Buy Offers");
		for(StockOffer offer : stockBuyOffer) {
			System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
		}
	}

}
