package ex1ObserverLOG121;

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

	public void detach(Observer observer) {
		banks.remove(observer);
	}

	/**
	 * The observers will be updated as soon as notified
	 */
	public void notifyBank() {
		for (Observer obs : banks) {
			obs.update();
		}
	}
//	private int solde;
//
//	// access to solde value in Soldes
//	public int getSolde() {
//		return this.solde;
//	}

}
