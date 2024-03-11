import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Harman 
 * Date: May 2021
 * Desc: Program is built to quiz the user with 15 questions related to geography.
 *
 */
public class ChoiceA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare variables  
		String answer = "";
		int tries = 0, points = 0;
		int totalPoints = 0, wrongAnswers = 0;
		int attempts = 0;
		double mark = 0;
		String choice = "";

		// drop down for options
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(false);
		frame.setSize(420, 420);

		ImageIcon icon = new ImageIcon("earth.png");


		// ask user for name name and user id

		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();

		Object[] fields = {
				"Name", field1,
				"User ID", field2 
		};

		JOptionPane.showConfirmDialog(null, fields, "Geography Quiz", JOptionPane.OK_CANCEL_OPTION); // asks for the name and username

		do {
			// Prompt user for answer of first question
			// Variables for options
			String[] options1 = {"Ottawa", "Paris", "Montreal", "Africa"};
			answer = (String) JOptionPane.showInputDialog(

					frame, 
					"What is the capital of France ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options1,
					options1[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Paris") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame,
						"What is the capital of France? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options1,
						options1[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Paris")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Paris", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of second question 
			// Variables for options
			String[] options2 = {"Ottawa", "Japan", "New York", "Toronto"};
			answer = (String) JOptionPane.showInputDialog(

					frame, 
					"What is the capital of Canada? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options2,
					options2[1]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Ottawa") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame,
						"What is the capital of Canada? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options2,
						options2[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Ottawa")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Ottawa", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of third question
			// Variables for options
			String[] options3 = {"Cape Town", "Tokyo", "New York", "Toronto"};
			answer = (String) JOptionPane.showInputDialog(

					frame, 
					"What is the capital of Japan? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options3,
					options3[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Tokyo") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the capital of Japan? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options3,
						options3[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Tokyo")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Tokyo", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of fourth question
			// Variables for options
			String[] options4 = {"Mumbai", "New Delhi", "New York", "Toronto"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is the capital of India? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options4,
					options4[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("New Delhi") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the capital of India? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options4,
						options4[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("New Delhi")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "New Delhi", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of fifth question
			// Variables for options
			String[] options5 = {"Mumbai", "Brasilia", "Cuba", "Toronto"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is the capital of Brazil? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options5,
					options5[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Brasilia") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the capital of Brazil? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options5,
						options5[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Brasilia")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Brasilia", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of sixth question
			// Variables for options
			String[] options6 = {"Berlin", "Accra", "Cuba", "Manitoba"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is the capital of Germany? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options6,
					options6[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Berlin") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the capital of Germany? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options6,
						options6[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Berlin")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Berlin", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of seventh question
			// Variables for options
			String[] options7 = {"Georgetown", "Accra", "Jakarta", "Manitoba"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is the capital of Ghana? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options7,
					options7[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Accra") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the capital of Ghana? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options7,
						options7[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Accra")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Accra", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of eight question
			// Variables for options
			String[] options8 = {"Georgetown", "Budapest", "Jakarta", "Cuba"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is the capital of Hungary? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options8,
					options8[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Budapest") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the capital of Hungary? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options8,
						options8[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Budapest")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Budapest", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of ninth question
			// Variables for options
			String[] options9 = {"Georgetown", "Islambad", "Jakarta", "Cuba"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is the capital of Pakistan? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options9,
					options9[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Islambad") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the capital of Pakistan? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options9,
						options9[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Islambad")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Islambad", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of tenth question
			// Variables for options
			String[] options10 = {"Georgetown", "Bratislava", "Jakarta", "Mogadishu"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is the capital of Slovakia? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options10,
					options10[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Bratislava") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the capital of Slovakia? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options10,
						options10[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Bratislava")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Bratislava", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of eleventh question
			// Variables for options
			String[] options11 = {"Europe", "Antartica", "North America", "Asia"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is the largest continent in the world? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options11,
					options11[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Asia") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the largest continent in the world? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options11,
						options11[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Asia")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Asia", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of twelfth question
			// Variables for options
			String[] options12 = {"India", "Canada", "China", "Russia"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is largest country in the world? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options12,
					options12[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Russia") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is largest country in the world? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options12,
						options12[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Russia")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Russia", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of thirteenth question
			// Variables for options
			String[] options13 = {"New York", "Tokyo", "Cape Town", "Toronto"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is the worlds most populated CITY? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options13,
					options13[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Tokyo") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the worlds most populated CITY? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options13,
						options13[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Tokyo")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Tokyo", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of fourteenth question
			// Variables for options
			String[] options14 = {"Antartica", "Asia", "South America", "Australia"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is the worlds least populated continent? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options14,
					options14[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Antartica") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the worlds least populated continent? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options14,
						options14[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Antartica")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Antartica", new ImageIcon("sad.png"));
			}

			tries = 0;

			// Prompt user for answer of 15th question
			// Variables for options
			String[] options15 = {"Indian Ocean", "Pacific Ocean", "Atlantic Ocean", "Artic Ocean"};
			answer = (String) JOptionPane.showInputDialog(
					frame, 
					"What is the worlds largest ocean? ",
					"Geography Quiz",
					JOptionPane.WARNING_MESSAGE,
					icon,
					options15,
					options15[0]
					);

			tries = tries + 1;

			//check if answer is not correct in 3 tries
			while (!answer.equalsIgnoreCase("Pacific Ocean") && tries < 3) {
				IO.display("Incorrect! Try again!", new ImageIcon("sadface.png"));

				//prompt and get answer
				answer = (String) JOptionPane.showInputDialog(
						frame, 
						"What is the worlds largest ocean? ",
						"Geography Quiz",
						JOptionPane.WARNING_MESSAGE,
						icon,
						options15,
						options15[0]
						);

				tries = tries + 1;
			}
			// check if the answers correct 
			if (answer.equalsIgnoreCase("Pacific Ocean")) {
				IO.display("Correct! 1 point", new ImageIcon("yes.png")); // display correct message

				points = points + 1;
			}
			else {
				IO.display("Nice try! The correct answer is " + "Pacific Ocean", new ImageIcon("sad.png"));
			}

			attempts = attempts + 1;

			//Display correct answers
			totalPoints = points;
			IO.display("You got " + totalPoints + " correct!");

			//display wrong answers
			wrongAnswers = (15 - totalPoints);
			IO.display("You got " + wrongAnswers + " wrong", new ImageIcon ("sadface")); 

			// calculate percentage
			mark = (totalPoints/15.0) * 100;

			if (mark >= 0 && mark < 50) {
				IO.display("You have been assigned Level R");
			}
			else if (mark >= 50 && mark < 60) {
				IO.display("You have been assigned Level 1");
			}
			else if (mark >= 60 && mark < 70) {
				IO.display("You have been assigned Level 2");
			}
			else if (mark >= 70 && mark < 80) {
				IO.display("You have been assigned Level 3");
			}
			else if (mark >= 80 && mark <= 100) {
				IO.display("You have been assigned Level 4");
			}

			if (attempts < 2)	
				choice = IO.readString("Do you want to retake the test? Enter \"Yes\" to retake the test, enter anything else to exit"); 
		} while (attempts < 2 && choice.equalsIgnoreCase("Yes")); 
		IO.display("Thank you for using my program!", new ImageIcon ("cool (1).png"));

	}
}