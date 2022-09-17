package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String question= JOptionPane.showInputDialog("do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if(question.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null,"you will RULE THE WORLD!");
		}else {
			JOptionPane.showMessageDialog(null,"then, sign up for classes at the League");
		}
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

