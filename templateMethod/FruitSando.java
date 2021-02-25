package templateMethod;

public class FruitSando extends Sando{

	String[] fruits = {"banana","ichigo", "melon"};
	String[] condiments = {"kurimuh"};
	
	
	public FruitSando() {
		System.out.println("Your fruit sando contains : ");
	}
	
	@Override
	protected void addFruits() {
		for(String froots : fruits) {
			System.out.print(froots + " ");
		}
	}

	@Override
	protected void addCondiments() {
		for(String conds : condiments) {
			System.out.print(conds + " ");
		}
	}

	//set if we want meat or not
	boolean wantsMeat() {return false;}
	protected void addMeat() {}
	
	
}//class
