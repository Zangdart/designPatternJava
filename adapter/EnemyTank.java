package adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{

	Random generator = new Random();
	
	@Override
	public void fireWeapon() {
		
		int atkDmg = generator.nextInt(10);

		System.out.println("Enemy tank deals " + atkDmg + " damage !");
	}

	@Override
	public void driveForward() {
		
	int mvt = generator.nextInt(5);
		
		System.out.println("Enemy tank moves " + mvt + " spaces !");
		
	}

	@Override
	public void assignDriver(String driverName) {
		
		System.out.println(driverName + " is driving the tank !");
	}

}
