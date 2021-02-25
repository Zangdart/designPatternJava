package adapter;

import java.util.Random;

public class EnemyRobot {
	
	Random generator = new Random();

	public void smashWithHands() {
		
		int atkDmg = generator.nextInt(10) + 1;

		System.out.println("Enemy robot deals " + atkDmg + " damage with his hands !");
	}
	
public void walkForward() {
		
		int mvt = generator.nextInt(5) + 1;

		System.out.println("Enemy robot moves " + mvt + " spaces !");
	}
	
public void reactToHuman(String driverName) {
	
	System.out.println(driverName + " is trampled by the robot !");
}
	
	
}
