package ex1ObserverLOG121INTERFACE;


//observer of Solde
public class Bank {

	// name of the Bank
	private String name;

	public Bank() {
	}

	public Bank(String name) {
		this.name = name;
	}

	Solde solde = new SoldeConcret();

	// method will be called by Solde everytime there is an update
	public void update() {
		System.out.println(this.name + " : le solde a change, il est de : " + ((SoldeConcret) solde).getSolde());
	}

	/**
	 * To which channel you are subscribing used to get the title from the video of
	 * the channel you're subscribed to if no instance of channel can't access the
	 * .getTitle();
	 * 
	 * @param channel
	 */
	public void linkToSolde(Solde solde) {
		this.solde = solde;
	}

}
