package bookExercises;

import javax.swing.JOptionPane;

public class Ex78 {

	public static void main(String[] args) {

		String userAnswer;

		Ex78methods roundNumber = new Ex78methods();

		Float userInput;

		int roundDoubleToInteger;

		do {

			userInput = Float.parseFloat(
					JOptionPane.showInputDialog(null, "Enter a decimal number that will be converted to an integer"));

			roundDoubleToInteger = roundNumber.roundDoubleToInteger(userInput);

			JOptionPane.showMessageDialog(null, "Round: " + roundDoubleToInteger + "\nDecimal number: " + userInput);

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
