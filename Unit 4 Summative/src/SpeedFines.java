import javax.swing.ImageIcon;

/**
 * 
 */

/**
 * @author Harman 
 * Date: June 2021 
 * Description: Convert speed to fine amount and display
 *
 */
/**
 * @author User
 *
 */
public class SpeedFines {
	/*
	 * Method to convert speeds to fine
	 */
	public static double convertSpeedToFine(int speed) {
		// declare and initialize variable for fines
		double fine = 0;
		
		if (speed >= 0 && speed <= 100) {  // speed from 0 to 100 is no fine
			fine = 0;
		}
		else if (speed > 100 && speed <= 120) {  // speed from 100 to 120 is a fine of 150.25
			fine = 150.25;
		}
		else if (speed > 120 && speed <= 150) {  // speed from 120 to 150 is a fine of 450.35
			fine = 450.35;
		}
		else if (speed > 150 && speed <= 200) {  // speed from 150 to 200 is is a fine 1234.99 
			fine = 1234.99;
		}
		else if (speed > 200) {  // speed above 200 is a fine of 10,000.00
			fine = 10000.00;
		}
		return fine;  // return variable for fines 
	}
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// declare variables for the speed and fines
		int speed = 0;
		double fine = 0;
		
		// prompt user for speed
		speed = IO.readInt("Please enter a speed");
		
		// check if speed is 0 or higher including 500 
		if (speed >= 0 && speed <= 500) {
			// calculate fine 
			fine = convertSpeedToFine(speed);
		// display the fine 
		IO.display("The fine is $" + fine);
		
		} // end while 
		else { // error message if speed i over 500
			IO.display("Speed must be from 0 to 500!!");
		}
		

	}

}
