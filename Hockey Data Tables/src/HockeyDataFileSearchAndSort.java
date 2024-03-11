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
 * 			public static int findName (String array[], String searchKey) - The search method for nameM
 * 			public static void main(String[] args) - the main method 
 */
public class HockeyDataFileSearchAndSort {

	/**
	 * Method to search for a name of a player within a 
	 * String array.
	 * The Linear / sequential search
	 */
	public static int findName (String array[], String searchKey) {
		// loop through my array from the beginning to the end  
		for (int i = 0; i < array.length; i++) {
			// check if the current element is the same as the searchKey
			if (array[i].equalsIgnoreCase(searchKey)) {
				// return the location of the persons name
				return i;
			}
		}
		// searchKey not found 
		return -1;
	}

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

		// >>>>>> Searching for a player in the playerGoals array 

		// prompt the user for a name to find 
		String nameToFind = IO.readString("Please enter a player name you would like to find");

		// declare a variable to save the location in the array
		int location = HockeyDataFileSearchAndSort.findName(playerNames, nameToFind);

		// check if the person was found 
		if (location < 0 ) {
			IO.display(nameToFind + " was not found!");
		}
		else {
			IO.display(nameToFind + " has " + playerGoals[location] + " goals!");
		}

		// >>>> Sort the goals array in ascending order (lowest goals to highest goals)

		for (int i = 0; i < playerGoals.length; i++) { // bubble sorting
			// loop through each element and compare to the next 
			for (int j = 0; j < playerGoals.length - 1; j++) {
				// compare my element to the next 
				if (playerGoals[j] > playerGoals[j+1]) {
					// swap the goal elements 
					int tempGoals = playerGoals[j];
					playerGoals[j] = playerGoals[j+1];
					playerGoals[j+1] = tempGoals;
					
					// swap the name elements 
					String tempNames = playerNames[j];
					playerNames[j] = playerNames[j+1];
					playerNames[j+1] = tempNames;

				}

			}// end for j

		}// end for i 

		// display the arrays again
		// code to display the information 
		list = "Name\tGoals\n";
		list = list + "=====\t=====\n";

		// display my arrays and the average 
		for (int i = 0; i < playerGoals.length; i ++) {
			list = list + playerNames[i] + "\t" + playerGoals[i] + "\n";
		}

		list = list + "The average goals for the season is " + average;

		// add the list to the display area
		displayArea.setText(list);

		// display it on dialog box 
		JOptionPane.showMessageDialog(null, displayArea);

	}// end main 

}// end class
