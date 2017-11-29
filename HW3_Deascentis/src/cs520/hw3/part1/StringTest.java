/*
 * String Part One Homework 3
 * CS 520
 * Yin Deascentis
 */
package cs520.hw3.part1;

import javax.swing.JOptionPane;

public class StringTest {
	private static String name, city;
	private static int age;

	public static void main(String[] args) {
		try {
			
		//store user input String as userInput;
		String userInput = JOptionPane.showInputDialog("Enter data using the format Name,Age,City");
		
		//Trim the user's input
		userInput = userInput.trim();
		System.out.println(userInput);
		
		//find the comma in the input using the indexOf method
		int findFirstComma = userInput.indexOf(",");
		
		//use the findFirstComma substring to get the name
		name = userInput.substring(0, findFirstComma);
				
		//display the position of first comma 
		System.out.println("First comma position: " + findFirstComma);
		//display the the name and the length of the name
		System.out.println("Name is: " + name + ";"+"The length of the name is: "+ name.length());

		
		//index of second comma 
		int findSecondComma = userInput.lastIndexOf(",");
		//use the findSecondComma substring to get the age
		age = Integer.parseInt(userInput.substring((findFirstComma + 1), findSecondComma));	
		
		//make sure age cannot be a negative number.
		if(age < 0) {
			 throw new IllegalArgumentException("Age cannot be Negative Numbers!"); 
		}
		//display the position of second comma
		System.out.println("Second comma position: " + findSecondComma);
		//display the age 
		System.out.println("Age is: " + age);
		//display the age in 10 years
		System.out.println("You will be " + (age + 10) + " in 10 years from now: ");
		//get the city
		city = userInput.substring(findSecondComma+1);
		//display the city
		System.out.println("User input the city is: " + city + "," + " Length: "+ city.length());
		
		} catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, " Please enter Name,Age,City.");
			e.printStackTrace();
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, " Age must be a Integer.");
			e.printStackTrace();
                  
		}catch(IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, " Please enter all 3 values (Name, Age, City) ");
			e.printStackTrace();
                    
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "Aage cannot be negative number.");
		    System.out.println(e.getMessage());
		}
	}

	

}
