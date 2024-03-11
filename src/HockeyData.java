import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Harman 
 * Date: June 2021
 * Description: Program that loads the names and season goals for a number of hockey players.
 *				Display the average of the goals for the season.
 * Method list:
 * 			public static void main(String[] args) - the main method 
 */
public class HockeyData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare arrays for the data 
		String playerNames[];
		int playerGoals[];
		
		// create the arrays with 5 elements each 
		playerNames = new String [5];
		playerGoals = new int [5];
		
		// declare the variables to calculate the average
		double average = 0, sum = 0;
		
		// prompt the user to enter each name and their goals
		// for the season
		for (int i = 0; i < playerNames.length; i++) {
			// prompt for the name 
			playerNames[i] = JOptionPane.showInputDialog(null, "Enter the name for player #" + (i+1));
			// prompt for the goals 
			playerGoals[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Eneter the goals for player #" + (i+1)));
			
			// add the goals of each player to the sum 
			sum = sum + playerGoals[i];

		}
		// calculate the average of the goals 
		average = sum / playerNames.length;
		
		// code to display the information 
		String list = "Name\tGoals\n";
		list = list + "=====\t=====\n";
		
		// display my arrays and the average 
		for (int i = 0; i < playerGoals.length; i ++) {
			list = list + playerNames[i] + "\t" + playerGoals[i] + "\n";
		
		}
		list = list + "The average goals for the season is " + average;
		
		// display it in a JTextArea
		JTextArea displayArea = new JTextArea();
		
		// add the list to the display area
		displayArea.setText(list);
		
		// display it on dialog box 
		JOptionPane.showMessageDialog(null, displayArea);
	}

}
