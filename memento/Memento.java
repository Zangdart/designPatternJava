package memento;

public class Memento {

	//state of the Memento object
	private String article;

	//constructor with parameter
	public Memento(String articleSaved) {
		this.article = articleSaved;
	}
	
	//getter
	public String getSavedArticle() {
		return article;
	}

}
