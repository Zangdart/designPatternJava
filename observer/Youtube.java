package observer;

public class Youtube {

	public static void main(String[] args) {
		
		Channel ftte = new Channel();

		Subscriber s1 = new Subscriber("Alice");
		Subscriber s2 = new Subscriber("Bob");
		Subscriber s3 = new Subscriber("Dave");
		Subscriber s4 = new Subscriber("Caro");
		Subscriber s5 = new Subscriber("Mary");

		
		ftte.subscribe(s1);
		ftte.subscribe(s2);
		ftte.subscribe(s3);
		ftte.subscribe(s4);
		ftte.subscribe(s5);
		
		ftte.unSubscribe(s3);
		
		s1.subscribeChannel(ftte);
		s2.subscribeChannel(ftte);
		s3.subscribeChannel(ftte);
		s4.subscribeChannel(ftte);
		s5.subscribeChannel(ftte);
		
		ftte.upload("How to program in Java");
		
		System.out.println(ftte.getSubs());
		
	}

}
