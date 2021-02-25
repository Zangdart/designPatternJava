package decoratorLocal;

public class Mainson {

	public static void main(String[] args) {

		// creation d'une instance de sdb
		Local hangar18 = new DecorationFenetre(new DecorationPorte(new DecorationPorte((new SalleDeBain()))));
		System.out.println("Composition du local : " + hangar18.getDescription());

		swagFlexing();

		// creation d'une instance de chambre
		Local chambre = new DecorationPorte(new DecorationFenetre(new DecorationFenetre(new DecorationPorte((new Chambre())))));
		System.out.println("Composition du local : " + chambre.getDescription());

		swagFlexing();

		// creation d'une instance de cuisine
		Local cuisine = new DecorationFenetre(new DecorationFenetre(new DecorationPorte(new DecorationFenetre((new Cuisine())))));
		System.out.println("Composition du local : " + cuisine.getDescription());
	}

	public static void swagFlexing() {
		//the swag stack
		System.out.println();
		DecorationPorte.reset();
		DecorationFenetre.reset();
	}

}
