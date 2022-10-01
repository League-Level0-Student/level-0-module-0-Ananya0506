package _99_extra;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// Create a new Robot
Robot gamer= new Robot();
	void go() {
		
		// Make the robot move quickly (setSpeed)
gamer.setSpeed(50);
		// Set the robot's pen width to 5                   
		gamer.setPenWidth(5);
		// Put the robot's pen down
		gamer.penDown();
		// This numberOfSquares variable will track how many squares the robot has drawn
		// It's set to zero here, because the robot hasn't drawn any squares yet.
		int squaresDrawn = 0;

		// LOOP: Start a while loop to repeat the following code until 4 squares have been drawn:
while (squaresDrawn < 4) {
				// PEN COLOR.     Set the pen color to random       setRandomPenColor()
		gamer.setRandomPenColor();
				// DRAW A SQUARE. Call the drawSquare() method.  Have you put some code in it?
		drawSquare();
				// TURN.          Turn the robot 90 degrees to the right
			gamer.turn(90);
			    // INCREASE COUNT. Add one to the number of squares drawn
			squaresDrawn +=1;
		// End the loop here
}
	}

	
	void drawSquare() {
		System.out.println("Yay! you called the drawSquare() method!");

		/*  Put code here to draw one square - don't forget to use a loop! */
		for (int i = 0; i < 4; i++) {
			gamer.move(100);
			gamer.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



