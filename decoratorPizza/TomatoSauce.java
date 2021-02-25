package decoratorPizza;

// Topping to add on top of another object
public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		// super of the ToppingDecorator
		super(newPizza);
		System.out.println("Adding sauce");
	}

	public String getDescription() {
		return tempPizza.getDescription() + ", tomato sauce";
	}

	public double getCost() {
		return tempPizza.getCost() + .35;
	}
}
