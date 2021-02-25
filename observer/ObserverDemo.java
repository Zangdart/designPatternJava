package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Observer {
	protected Subject subject;
	public abstract void update();
}

class HexObserver extends Observer {
	// constructeur
	public HexObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	@Override
	public void update() {
		System.out.print(" " + Integer.toHexString(subject.getState()));
	}

}

//Differents types d'observateurs
class OctObserver extends Observer {
	public OctObserver(Subject subject) {
		this.subject = subject;

		// on ajoute le sujet cree a la liste observers dans Subject
		this.subject.add(this);
	}

	public void update() {
		System.out.print(" " + Integer.toOctalString(subject.getState()));
	}
}

//Differents types d'observateurs
class BinObserver extends Observer {
	public BinObserver(Subject subject) {
		this.subject = subject;
		// on ajoute le sujet cree a la liste observers dans Subject
		this.subject.add(this);
	}

	public void update() {
		System.out.print(" " + Integer.toBinaryString(subject.getState()));
	}
}

//classe qui sera observee 
class Subject {
	// une liste d'observateur
	private List<Observer> observers = new ArrayList<>();
	// une info a broadcast
	private int state;

	// ajoute des observateurs
	public void add(Observer o) {
		observers.add(o);
	}

	public int getState() {
		return state;
	}

	public void setState(int value) {
		this.state = value;
		execute();
	}

	/**
	 * Methode qui update tous les observers qui observent le sujet
	 */
	private void execute() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public List<Observer> getObservers() {
		return observers;
	}
}

public class ObserverDemo {
	public static void main(String[] args) {
		Subject sub = new Subject();
		// Client configures the number and type of Observers
		new HexObserver(sub);
		new OctObserver(sub);
		new BinObserver(sub);

		// verifie que les instance d'Observer soient ajoutees a la liste dans Subject
		System.out.println(sub.getObservers());

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("\nEnter a number: ");
			sub.setState(scan.nextInt());
		}
	}
}