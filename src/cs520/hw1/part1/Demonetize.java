package cs520.hw1.part1;
/**
 * 
 * @author Yin Deascentis
 * CS520 Homework 1 
 *
 */
//message dialog
import javax.swing.*;

//create a class name Demonetize
public class Demonetize {

	public static void main(String[] args) {
		
		//store user input String as input;
		String input1 = JOptionPane.showInputDialog("Enter # of Old 1000's: ");

		//convert input1 from String to integer
		int thousands = Integer.parseInt(input1);
	
		//store user input String as input;
		String input2 = JOptionPane.showInputDialog("Enter # of Old 500's: ");
		System.out.println("Old 1000 notes = " + input1+ " , "+"Old 500 notes = " + input2);
		
		//convert input2 from String to integer		
		int fiveHundreds = Integer.parseInt(input2);
		int totalRequest = thousands*1000 + fiveHundreds*500;
		
		System.out.println("Requested Conversion Amount = "+totalRequest);
		
		//Declare the integer variables 
	
		int newTwoThousands, newFiveHundreds, remainingAmount;
		
		newTwoThousands = totalRequest/2000;
		remainingAmount = totalRequest - newTwoThousands*2000;
		System.out.println("New 2000 notes= "+newTwoThousands +" , " +"Remaining Amount= "+remainingAmount);
		
		newFiveHundreds = remainingAmount / 500;
		System.out.println("New 500 notes= "+newFiveHundreds);
		
		//message dialog to show the summary
		JOptionPane.showMessageDialog(null, "Requested Amount (" + totalRequest + ") "
				+ "\nNew 2000's (" + newTwoThousands + ")" 
				+ "\nNew 500's (" + newFiveHundreds + ")");
		
	}

}
