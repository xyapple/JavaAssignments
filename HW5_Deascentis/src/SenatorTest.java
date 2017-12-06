/**
 * Homework assignment 5
 * CS520 
 * @author Yin Deascentis
 * SenatorTest class
 */
//import LinkedList class
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class SenatorTest {
	
	public static void main(String[] args) {
		// Declare and initialize an empty Queue 
		Queue<Senator> senatorQueue = new LinkedList<Senator>();
		// Declare and initialize an empty HashMap
		HashMap<String, Senator> senatorMap = new HashMap<String, Senator>();
		
		//BuffedReader to read the file
		String fileName = "data.txt";
		// fileReader
		FileReader fr = null;
		try {
			 fr = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String line;
		Senator senator;
		try {
		
			// read one line at a time until end of file
			line = br.readLine();
			while (line != null) {
				//use the processInputData method to process the data
				senator = processInputData(line);
				//System.out.println(senator);
				//Add each Senator into the senatorQueue
				senatorQueue.add(senator);
				//Insert senator into the senatorMap using the
				//senator’s name as the key
				senatorMap.put(senator.getName(), senator);
				
				line = br.readLine();
			}
			
			//Iterate over the senatorQueue and display each element to the console.
			System.out.println("======= Iterating over the senator Queue =======");
			Iterator<Senator> queueIt = senatorQueue.iterator();
			while(queueIt.hasNext()) {			
				System.out.println( (Senator) queueIt.next());
			}
			System.out.println("\n ======= Iterating over the senator Map ========");
			// Access all the keys in the senatorMap
			Set<String> nameKeys = senatorMap.keySet();
			
			// Iterate over keys in the map by getting the key
			Iterator<String> mapIt = nameKeys.iterator();
			while (mapIt.hasNext())
			{	//get the senator name through the map iterator
				String name = mapIt.next();
				//print out the senator by key
				System.out.println(senatorMap.get(name));
			}	

		} catch (NumberFormatException e) {
			System.out.println("-99");
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
		

	}// end of main method
	
	//Private method with return type Senator
	private static Senator processInputData(String data) {
		//use StringTokenizer comma as the delimiter
		StringTokenizer token = new StringTokenizer(data, ",");	
		//Create a Senator object and assign to the local variable
		Senator currentSenator = null;
		int yearsInOffice = 0;
		String name, party, state;
		try{
		//use tokoenizer to get the data
		name = token.nextToken();
		try {
			yearsInOffice = Integer.parseInt(token.nextToken());
		}catch(NumberFormatException e) {
			System.out.println("-99");
		}
		
		party = token.nextToken();
		state = token.nextToken();
		
		currentSenator = new Senator(name);
		currentSenator.setYearsInOffice(yearsInOffice);
		currentSenator.setParty(party);
		currentSenator.setState(state);
		
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return currentSenator;
	}

}//end of Test class
