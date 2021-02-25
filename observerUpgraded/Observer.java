package observerUpgraded;

//An interfacfe Observer for Subscriber
public interface Observer {

	//method will be called by Channel everytime there is an update
	void update();

	/**
	 * To which channel you are subscribing
	 * @param ch
	 */
	void subscribeChannel(Channel channel);

}