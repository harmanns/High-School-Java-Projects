import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Harman 
 * Date: June 2021
 * Description: Program that loads the names and season goals from a text file for a number of hockey players.
 *				Display the average of the goals for the season.
 * Method list:
 * 			public static void main(String[] args) - the main method 
 */
public class HockeyDataFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// declare arrays for the data 
		String playerNames[];
		int playerGoals[];
		
		// create the arrays with 5 elements each 
		playerNames = new String [5];
		playerGoals = new int [5];
		
		// declare the variables to calculate the average
		double average = 0, sum = 0;
		
		// open the file to be read 
		FileReader fileR = new FileReader("hockey.txt");
		BufferedReader input = new BufferedReader(fileR);
		
		// prompt the user to enter each name and their goals
		// for the season
		for (int i = 0; i < playerNames.length; i++) {
			// prompt for the name 
			playerNames[i] = input.readLine();
			// prompt for the goals 
			playerGoals[i] = Integer.parseInt(input.readLine());
			
			// add the goals of each player to the sum 
			sum = sum + playerGoals[i];

		}
		
		// close the input file 
		fileR.close();
	
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
		displayArea.setTabSize(15);
		displayArea.setEditable(false);
		
		// add the list to the display area
		displayArea.setText(list);
		
		// display it on dialog box 
		JOptionPane.showMessageDialog(null, displayArea);
		
		//>>> commands to write to another file 
		
		// create a file to write to 
		FileWriter fileW = new FileWriter ("outputFile.txt");
		PrintWriter output = new PrintWriter(fileW);
		
		// loop to write the contents of my arrays to the file 
		for (int i = 0; i < playerGoals.length; i++) {
			output.println("Name: " + playerNames[i] + " Goals: " + playerGoals[i]);
		}
		output.print("The average goals for the season is " + average );  // writes the average to the file 
		
		// close the file 
		fileW.close();
		
		// display a message stating that the file as been saved 
		JOptionPane.showMessageDialog(null, "File saved");
	}

}
