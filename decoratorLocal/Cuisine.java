package decoratorLocal;

public class Cuisine implements Local {

	
	@Override
	public String getDescription() {
		return "Ceci est une cuisine avec " + DecorationPorte.globalCountOfPortes + " porte(s) et "
				+ DecorationFenetre.getNumberOfFenetres() + " fenetre(s)";
	}
	
}
