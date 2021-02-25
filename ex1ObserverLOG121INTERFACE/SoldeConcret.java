package ex1ObserverLOG121INTERFACE;

public class SoldeConcret extends Solde {

	private int solde;

	public SoldeConcret() {
		super();
	}

	public void validate() {
		if (this.solde <= -1000) {
			notifyBank();
		} else if (this.solde > 10000) {
			notifyBank();
		}
	}

	// access to solde value in Soldes
	public int getSolde() {
		return this.solde;
	}

	int retirer(int retrait) {
		this.solde -= retrait;
		validate();
		return this.solde;
	}

	int deposer(int depot) {
		this.solde += depot;
		validate();
		return this.solde;
	}
	
}
