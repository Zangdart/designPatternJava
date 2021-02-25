package templateMethod;

/**
 * Class that contains a method that provides the steps of the algo. Allows the
 * subclasses to override some of the methods
 * 
 * @author davyc
 *
 */

public abstract class Sando {

	/**
	 * Template method declared final so that 
	 * subclasses can't change the algo
	 * 
	 * One method that contains methods to be implemented
	 */
	final void makeSando() {


		if (wantsMeat()) {
			addMeat();
		}

		if (wantsCondiments()) {
			addCondiments();
		}

		if (wantsFruits()) {
			addFruits();
		}
		
		cutBun();
		wrapSando();

	}// makeSando()

	// abstract methods to implement

	abstract void addMeat();

	abstract void addFruits();

	abstract void addCondiments();

	boolean wantsFruits() {
		return true;
	};

	boolean wantsCondiments() {
		return true;
	};

	boolean wantsMeat() {
		return true;
	};

	void cutBun() {
		System.out.println();
		System.out.println("The sando was cut");
	};
	
	void wrapSando() {
		System.out.println("The sando has been made");
	};

}
