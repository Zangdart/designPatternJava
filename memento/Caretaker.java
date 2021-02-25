package memento;

import java.util.ArrayList;

public class Caretaker {

	//AL of different Memento
	ArrayList<Memento> savedArticles = new ArrayList<Memento>();
	
	/**
	 * add a Memento to a list 
	 * @param m
	 */
	public void addMemento(Memento m) {
		savedArticles.add(m);
	}
	
	/**
	 * Method to get a specific Memento in a list
	 * @param index
	 * @return a specific Memenot
	 */
	public Memento getMemento(int index) {
		return savedArticles.get(index);
	}
	
}
