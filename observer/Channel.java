package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	//must knowhow many subscriber it has 
	private List<Subscriber> subs = new ArrayList<>();
	private String title; 
	
	public String getTitle() {
		return title;
	}
	
	public List<Subscriber> getSubs() {
		return subs;
	}

	/**
	 * subscriber is added to a Channel
	 * @param sub
	 */
	public void subscribe(Subscriber sub) {
		//everytime you sub to the channel we will get your object
		//we add the sub to the list 
		subs.add(sub);
	}
	
	/**
	 * unSub method 
	 * @param sub
	 */
	public void unSubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	public void notifySubscribers() {
		for(Subscriber sub : subs) {
			//calls the update() of Subscriber class
			sub.update();
		}
	}
	
	public void upload(String title) {
		this.title = title;
		notifySubscribers();
	}
	
	
}
