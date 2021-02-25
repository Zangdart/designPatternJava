package decoratorPizza;

//Topping to add on top of another object
public class Mozza extends ToppingDecorator{

	public Mozza(Pizza newPizza) {
		//super of the ToppingDecorator
		super(newPizza);
		System.out.println("Adding dough");
		System.out.println("Adding mozza");
	}
	public String getDescription() {
		return tempPizza.getDescription() + ", mozza"; 
	}
	
	public double getCost() {
		return tempPizza.getCost() + .50; 
	}
}
