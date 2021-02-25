package decoratorLocal;

//Decoration to add on top of another object
public class DecorationFenetre extends LocalDecorator {

	private static int countOfFenetres=0;
	
	protected static void reset() {
		countOfFenetres = 0;
	}

	protected static int getNumberOfFenetres() {
		return countOfFenetres;
	}
	
	public DecorationFenetre(Local local) {
		super(local);
		System.out.println("Vous venez d'ajouter une fenetre");
		countOfFenetres++;
	}

	// OR la methode pour une nouvelle description
	@Override
	public String getDescription() {
		//templocal est la reference vers Local
		return referenceToLocal.getDescription(); //+ " fenetre "
	}

}

