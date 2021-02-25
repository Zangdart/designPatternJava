package observer;

public class Subscriber  {
	
	//attributes
	private String name; 
	//to which channel you are subscribed
	private Channel channel = new Channel();
	
	//constructor
	public Subscriber(String name) {
		this.name = name;
	}

	//when a channel post a video it will call the update()
	public void update() {
		System.out.println("Hey " + name + ", video uploaded : " + channel.getTitle());
	}
	
	public void subscribeChannel(Channel ch) {
		channel = ch;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
