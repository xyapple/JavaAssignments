/*
 * CS520 Homework3 part2
 * 
 * Yin Deascentis
 */
package cs520.hw3.part2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		// file Name
		String fileName = "data.txt";
		// fileReader
		FileReader fr = null;
		//check the file to see if it is exits
		try {
			fr = new FileReader(fileName);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		//use buffer reader
		BufferedReader br = new BufferedReader(fr);
		try {

			String line;
			// read one line at a time until end of file
			line = br.readLine();
			while (line != null) {
				//use the processInputData method to process the data
				processInputData(line);
				line = br.readLine();
			}

		} catch (NumberFormatException e) {
			System.out.println("Years in Office must be a number. ");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if(br != null) {
					br.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void processInputData(String data) {

		StringTokenizer token = new StringTokenizer(data, ",");
		//use tokoenizer to get the data
		String name = token.nextToken();
		int yearsInOffice = Integer.parseInt(token.nextToken());
		String party = token.nextToken();
		String state = token.nextToken();
		
		// create a new object		
		Senator currentSenator = new Senator(name);
		currentSenator.setYearsInOffice(yearsInOffice);
		currentSenator.setParty(party);
		currentSenator.setState(state);
		System.out.println(currentSenator.toString());

	}

}
