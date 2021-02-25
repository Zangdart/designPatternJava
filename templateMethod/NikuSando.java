package templateMethod;

public class NikuSando extends Sando{

	String[] niku = {"5A beef", "wagyu", "buta"};
	String[] condiments = {"cheese", "sauce", "veggies"};

	public NikuSando() {
		System.out.println("Your niku sando contains : ");
	}
	
	@Override
	void addMeat() {
		for(String meat : niku) {
			System.out.print(meat + " ");
		}
	}

	@Override
	void addCondiments() {
		for(String conds : condiments) {
			System.out.print(conds + " ");
		}		
	}

	void addFruits() {}
	boolean wantsFruits() {return false;}
	
}
