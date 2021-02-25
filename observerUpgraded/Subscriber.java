package observerUpgraded;

//is  an observer
public class Subscriber implements Observer{

	private String name;
	private Channel channel = new ChannelExtended();
	
	
	public Subscriber(String name) {
		this.name = name;
	}

	//method will be called by Channel everytime there is an update
	public void update() {
		System.out.println("Hey " + name + " a new video \"" + channel.getTitle() +  " \" was uploaded ! ");
	}
	
	/**
	 * To which channel you are subscribing
	 * used to get the title from the video of the channel you're subscribed to
	 * if no instance of channel can't access the .getTitle();
	 * @param channel
	 */
	public void subscribeChannel(Channel channel) {
		this.channel = channel; 
	}
	
	
	
	
}
