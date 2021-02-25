package memento;

public class Originator {

	// state of the Momento object
	private String article;

	public void set(String newArticle) {

		System.out.println("From Originator : Current version of article \n" + newArticle + "]n");

		article = newArticle;

	}

	/**
	 * Creates new Memento and assigns value to it
	 * 
	 * @return new memento article
	 */
	public Memento storeInMemento() {

		System.out.println("From Originator : Saving to Memento");

		return new Memento(article);
	}
	
	
	/**
	 * Method that returns a specific Memento
	 * @param thisMemento
	 * @return a specific Memento
	 */
	public String restoreFromMemento(Memento thisMemento) {
		article = thisMemento.getSavedArticle();
		System.out.println("From Originator : Previous article saved in Memento\n" + article + "\n");
		return article;
	}

}
