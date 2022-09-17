package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
	int score=0;
		// ASK A QUESTION AND CHECK THE ANSWER
	JOptionPane.showMessageDialog(null,"today, i will MAKE YOU SAY ALL THE CAPITALS OF THE STATES OF THE USA!!!! be prepared:)");
				// 2.  Ask the user a question 
	String virginia= JOptionPane.showInputDialog("what is the capital of Virginia?");
				// 3.  Use an if statement to check if their answer is correct
				if (virginia.equalsIgnoreCase("richmond")) {
					JOptionPane.showMessageDialog(null,"good, you have survived the first question!");
					score++;
				}else {
					JOptionPane.showMessageDialog(null,"YOU FAILED! your score will be going to negative numbers now!");
					score--;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer

		String indiana= JOptionPane.showInputDialog("what is the capital of Indiana?");
		// 3.  Use an if statement to check if their answer is correct
		if (indiana.equalsIgnoreCase("indianapolis")) {
			JOptionPane.showMessageDialog(null,"you did it!");
			score++;
		}else {
			JOptionPane.showMessageDialog(null,"nice try!");
			score--;
		}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null,"good effort! your score is: "+score);
	}
}
