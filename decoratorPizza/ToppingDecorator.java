package decoratorPizza;

public abstract class ToppingDecorator implements Pizza {

	//holds a plain Pizza, a reference to that file 
	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza newPizza) {
		this.tempPizza = newPizza;
	}
	
	public String getDescription() {
		return tempPizza.getDescription(); 
	}
	
	public double getCost() {
		return tempPizza.getCost(); 
	}
}
