import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

/**
 * 
 */

/**
 * @author Harman 
 * Date: June 2021
 * Description: Read information from the rainfall file. Calculate the percentage of total precipitation from each month.
 * 				Program should allow user to search for a month and display related info. The code should also display % 
 * 				from highest to lowest 
 * Method list:
 * 			public static String displayText (String dialogbox) - method to diaply dialog box
 * 			public static int findName (String array[], String searchKey) - search method for month
 * 			public static void main(String[] args) - the main method 
 *
 */
public class RainfallStudy {

	/*
	 * Method for display JText area
	 */
	public static String displayText (String dialogbox) {
		String text = "";

		// set background color (make background fully white for neatness)
		Color myColour = new Color (240, 239, 239);

		// Change font to personal 
		Font myFont = new Font ("Courier New", 1, 15);

		// create dialog text box
		JTextArea displayArea = new JTextArea();
		displayArea.setTabSize(15);
		displayArea.setEditable(false); 
		displayArea.setBackground(myColour); // set background color 
		displayArea.setFont(myFont); // set font 

		// add the list to the display area
		displayArea.setText(dialogbox);

		// display it on dialog box 
		JOptionPane.showMessageDialog(null, displayArea);

		return text; // return variable
	} 

	/**
	 * Method to search for a month within a string array
	 */
	public static int findName (String array[], String searchKey) {
		// loop through my array from the beginning to the end  
		for (int i = 0; i < array.length; i++) {
			// check if the current element is the same as the searchKey
			if (array[i].equalsIgnoreCase(searchKey)) {
				// return the location of the persons name
				return i;
			} // end if 
		}// end for loop

		// searchKey not found 
		return -1;

	}// end if loop

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		try {

			// declare arrays for data
			String months[];
			double precipitation[];
			double totalPercent[];

			// setup for 2 decimal place formatting
			DecimalFormat twoDigit = new DecimalFormat("#00.00");

			// create array with 12 months, 12 precipitation and 12 percentages
			months = new String [12];
			precipitation = new double [12];
			totalPercent = new double [12];

			// declare variable for total percentage
			double totalPrecipitation = 0;

			// prompt user for file name 
			String fileName = IO.readString("Enter name for file", "rainfall.txt");

			// open file to be read
			FileReader fileR = new FileReader(fileName);
			BufferedReader input = new BufferedReader(fileR);


			// read text file for info
			for (int i = 0; i < months.length; i++) {
				// prompt for the month 
				months[i] = input.readLine();
				// prompt for the precipitation
				precipitation[i] = Double.parseDouble(input.readLine());
			}

			// for loop to get total precipitation 
			for (int i = 0; i < precipitation.length; i++) {

				totalPrecipitation = totalPrecipitation + precipitation[i];
			}
			// loop to calculate for total percent
			for (int i = 0; i < precipitation.length; i++) {
				// calculate the percent for each month
				totalPercent[i] = (precipitation[i] / totalPrecipitation) * 100;		
			}

			// close the input file 
			fileR.close();

			// code to display the information 
			String list = "Month\tPrecipitation\t% of Total\n";
			list = list + "=============\t=============\t=============\n";

			// display my arrays and the average 
			for (int i = 0; i < months.length; i ++) {
				list = list + months[i] + "\t" + precipitation[i] + "\t" + twoDigit.format(totalPercent[i])+ "\n";

			}

			// display dialog box via method
			RainfallStudy.displayText(list);

			// >>> search for month and display info 
			// prompt the user for a name to find 
			String nameToFind = IO.readString("Please enter a month you like to find");

			// declare a variable to save the location in the array
			int location = RainfallStudy.findName(months, nameToFind);

			// check if the month was found 
			if (location < 0 ) { 
				IO.display(nameToFind + " was not found!");
			}

			// else if month is found
			else { 
				IO.display(nameToFind + ": " + "\n" + "Precipitation: " + precipitation[location] + "mm" + "\n% of Total: " + twoDigit.format(totalPercent[location]) + "%");
			} 

			for (int i = 0; i < months.length; i++) { // bubble sorting

				// loop through each element and compare to the next 
				for (int j = 0; j < months.length - 1; j++) {

					// compare my element to the next 
					if (precipitation[j+1] > precipitation[j]) {

						// swap the goal elements 
						double tempPrecipitation = precipitation[j+1]; // hold precipitation 
						precipitation[j+1] = precipitation[j];
						precipitation[j] = tempPrecipitation;

						// swap the name elements 
						String tempMonths = months[j+1]; // hold months
						months[j+1] = months[j];
						months[j] = tempMonths;

						// swap the percentages 
						double tempPercentages = totalPercent[j+1]; // holds percentage
						totalPercent[j+1] = totalPercent[j];
						totalPercent[j] = tempPercentages;

					} // end if statement

				}// end for j

			}// end for i 

			// code to display the information 
			list = "\tDescending Order\nMonth\tPrecipitation\t% of Total\n";
			list = list + "=============\t=============\t=============\n";

			// display my arrays and the average 
			for (int i = 0; i < months.length; i ++) {
				list = list + months[i] + "\t" + precipitation[i] + "\t" + twoDigit.format(totalPercent[i])+ "\n";

			}
			// display dialog box via method 
			RainfallStudy.displayText(list);

		} // end try 
		catch (FileNotFoundException error) { // if file name is not found 
			IO.display("File does not exist!");
		}
		catch (NumberFormatException error) { // if file is corrupted 
			IO.display("File is corrupted!");
		}

	} // end main

} // end class
