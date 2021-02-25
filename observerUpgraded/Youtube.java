package observerUpgraded;

public class Youtube {

	public static void main(String[] args) {
		
		Channel ftte = new ChannelExtended();
		
		Subscriber s1 = new Subscriber("Alice");
		Subscriber s2 = new Subscriber("Dean");
		Subscriber s3 = new Subscriber("Kallen");
		Subscriber s4 = new Subscriber("Nami");
		Subscriber s5 = new Subscriber("Dave");

		//add subs to the channel
		ftte.subscribe(s1);
		ftte.subscribe(s2);
		ftte.subscribe(s3);
		ftte.subscribe(s4);
		ftte.subscribe(s5);
		
		//unsub to the channel
		ftte.unsubscribe(s5);

		//subscribe to the channel
		s1.subscribeChannel(ftte);
		s2.subscribeChannel(ftte);
		s3.subscribeChannel(ftte);
		s4.subscribeChannel(ftte);
		s5.subscribeChannel(ftte);
		

		//upload a new video
		ftte.upload("How to learn programming");
	}

}
