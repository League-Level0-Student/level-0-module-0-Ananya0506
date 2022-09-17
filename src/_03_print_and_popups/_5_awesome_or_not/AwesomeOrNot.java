package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
public static void main(String[] args) {
	

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	int num;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	num=ran.nextInt(4);
		// 3. Print your variable to the console
	System.out.println(num);
		// 4. Get the user to enter something that they think is awesome
	String stuff= JOptionPane.showInputDialog("enter something that you think is awesome!");
		// 5. If your variable is  0
	if (num==0) {
		JOptionPane.showMessageDialog(null,"wow! that is a pretty awesome thing!");
	}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	if (num==1) {
		JOptionPane.showMessageDialog(null,"meh. that pretty good, but it can be better!");
	}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	if (num==2) {
		JOptionPane.showMessageDialog(null,"*yawn* um, that's not too interesting.");
	}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	if (num==3) {
		JOptionPane.showMessageDialog(null,"really? that's the only thing you could come up with? i mean, think of all the better things in life!");
	}
			// -- invent your own message to give to the user (be nice).

}
}