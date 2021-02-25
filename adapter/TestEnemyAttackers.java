package adapter;

public class TestEnemyAttackers {

	public static void main(String[] args) {

		EnemyTank tank1 = new EnemyTank();
		EnemyRobot robotEnemy = new EnemyRobot();
		
		//creates an adapter for the robot
		EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(robotEnemy);
		
		System.out.println("The Robot");

		robotEnemy.reactToHuman("Paul");
		robotEnemy.walkForward();
		robotEnemy.smashWithHands();
		
		System.out.println("The enemy Tank");
		tank1.assignDriver("Frank");
		tank1.driveForward();
		tank1.fireWeapon();
		
		System.out.println("The robot with Adapter");
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}

}
