package decoratorLocal;

//Concrete class of Local
public class Chambre implements Local {

	@Override
	public String getDescription() {
		return "Ceci est une chambre avec " + DecorationPorte.globalCountOfPortes + " porte(s) et "
				+ DecorationFenetre.getNumberOfFenetres() + " fenetre(s)";
	}

}

