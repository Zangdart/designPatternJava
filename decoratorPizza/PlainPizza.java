package decoratorPizza;

//Concrete class of a pizza 
public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Thin dough";
	}

	@Override
	public double getCost() {
		return 8;
	}

}
