package decoratorLocal;

//Decoration to add on top of another object
public class DecorationPorte extends LocalDecorator {

	protected static int globalCountOfPortes = 0;

	protected static void reset() {
		globalCountOfPortes = 0;
	}
	
	public DecorationPorte(Local newLocal) {
		super(newLocal);
		System.out.println("Vous venez d'ajouter une porte");
		globalCountOfPortes++;
		 //System.out.println(globalCountOfPortes);
	}

	// OR la methode pour une nouvelle description
	@Override
	public String getDescription() {
		// templocal est la reference vers Local
		return referenceToLocal.getDescription(); // + " porte "
	}

}
