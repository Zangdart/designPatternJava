package ex1ObserverLOG121INTERFACE;

import java.util.ArrayList;
import java.util.List;

//subject
public abstract class Solde {

	// list of all the subscribers
	private List<Bank> banks = new ArrayList<>();

	/**
	 * Attach an observer to a subject
	 * @param observer
	 */
	public void attach(Bank observer) {
		banks.add(observer);
	}

	public void detach(Bank observer) {
		banks.remove(observer);
	}

	/**
	 * The observers will be updated as soon as notified
	 */
	public void notifyBank() {
		for (Bank obs : banks) {
			obs.update();
		}
	}

}
