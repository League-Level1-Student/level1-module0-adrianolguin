import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

// screen is 900,600

public class Houses {

	static Robot k = null;

	public static void main(String[] args) {

		k = new Robot();

		k.moveTo(50, 300);
	///
		int r = 0;
		
		Random randy = new Random();
		
		 r = ;
		
		for(int x = 0; x < 9; x++) {
			//use(20,randy(300 - 100)+1)-100);
		}

	}

	public static void house(int x, int y) {

		k.setPenWidth(2);
		k.hide();
		k.penDown();
		k.setSpeed(999999999);
		k.setRandomPenColor();
		k.setAngle(0);

		k.move(y);
		k.turn(90);
		k.move(x);
		k.turn(90);
		k.move(y);
		k.setPenColor(0, 170, 0);
		k.turn(270);
		k.move(15);
	}

}
