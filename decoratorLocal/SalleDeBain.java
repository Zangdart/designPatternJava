package decoratorLocal;

//Concrete class of Local
public class SalleDeBain implements Local {
	
	@Override
	public String getDescription() {
		return "Ceci est une salle de bain avec " + DecorationPorte.globalCountOfPortes + " porte(s) et "
				+ DecorationFenetre.getNumberOfFenetres() + " fenetre(s)";
	}

}
