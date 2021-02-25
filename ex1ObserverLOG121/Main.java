package ex1ObserverLOG121;

public class Main {

	public static void main(String[] args) {

		Solde solde = new SoldeConcret();
	
		
		Bank bnc = new Bank("BNC");
		solde.attach(bnc);
		bnc.linkToSolde(solde);
		
		Bank td = new Bank("TD");
		solde.attach(td);
		td.linkToSolde(solde);

		
		//cast to use methods of subclass
		
		((SoldeConcret) solde).deposer(20000);
		((SoldeConcret) solde).retirer(30000);
		//pq je dois cast autant ? 
		System.out.println("Votre nouveau solde est de " + ((SoldeConcret) solde).getSolde());


	
	
	}

}
