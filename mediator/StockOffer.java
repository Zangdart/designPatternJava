package mediator;

public class StockOffer {

	private int stockShares = 0;
	private int collegueCode = 0;
	private String stockSymbol = "";

	public StockOffer(int stockShares,String stockSymbol, int collegueCode) {
		super();
		this.stockShares = stockShares;
		this.collegueCode = collegueCode;
		this.stockSymbol = stockSymbol;
	}

	public int getCollegueCode() {
		return collegueCode;
	}

	public void setCollegueCode(int collegueCode) {
		this.collegueCode = collegueCode;
	}

	public int getStockShares() {
		return stockShares;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	
	
}
