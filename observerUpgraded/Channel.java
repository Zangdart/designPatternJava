package observerUpgraded;

import java.util.ArrayList;
import java.util.List;

public abstract class Channel {

	// list of all the subscribers
	private List<Subscriber> subs = new ArrayList<>();

	// title of the video
	private String title;

	/**
	 * adds a subscriber to a channel
	 * 
	 * @param sub
	 */
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}

	/**
	 * removes a subscriber to a channel
	 * 
	 * @param sub
	 */
	public void unsubscribe(Observer sub) {
		subs.remove(sub);
	}

	/**
	 * call the update method in subscirbers to notify them of a new video
	 */
	public void notifySubscribers() {
		for (Observer sub : subs) {
			sub.update();
		}
	}

	/**
	 * notifies the subs that a new video (+title) was published
	 * @param title
	 */
	public void upload(String title) {
		this.title = title;
		notifySubscribers();
	}

	public String getTitle() {
		return title;
	}
}
