package ex1ObserverLOG121;

public interface Observer {

	// method will be called by Solde everytime there is an update
	void update();

	//to display the infos of the account (optionnal)
	void linkToSolde(Solde solde);

}