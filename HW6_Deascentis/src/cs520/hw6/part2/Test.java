/**
 * CS 520 Homework 6 Part 2
 * Yin Deascentis
 */
package cs520.hw6.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String page = "http://norvig.com/big.txt";

		URL urlObject = null;
		URLConnection urlConnectionObject = null;

		try {
			try {
				urlObject = new URL(page);
				urlConnectionObject = urlObject.openConnection();
				// Get the Content Size
				int contentSize = urlConnectionObject.getContentLength();
				System.out.printf("Input Data length: %d\n", contentSize);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// read the data
		StringBuffer buffer = new StringBuffer();
		String inputLine;
		try {
			InputStreamReader inputStream = new InputStreamReader(urlObject.openStream());
			BufferedReader reader = new BufferedReader(inputStream);
			while ((inputLine = reader.readLine()) != null) {
				buffer.append(inputLine + "\n");

			}
			for (int i = 0; i < buffer.length(); i++) {
				char c = buffer.charAt(i);
				buffer.setCharAt(i, Character.toLowerCase(c));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		// Create the SharedResults object and assign it to a variable.
		SharedResults sharedData = new SharedResults();

		// Create 26 LongTask objects using an array of size 26.
		LongTask taskA = new LongTask(sharedData, buffer, 'a', 0);
		taskA.start();

		LongTask taskB = new LongTask(sharedData, buffer, 'b', 1);
		taskB.start();

		LongTask taskC = new LongTask(sharedData, buffer, 'c', 2);
		taskC.start();

		LongTask taskD = new LongTask(sharedData, buffer, 'd', 3);
		taskD.start();

		LongTask taskE = new LongTask(sharedData, buffer, 'e', 4);
		taskE.start();

		LongTask taskF = new LongTask(sharedData, buffer, 'f', 5);
		taskF.start();

		LongTask taskG = new LongTask(sharedData, buffer, 'g', 6);
		taskG.start();

		LongTask taskH = new LongTask(sharedData, buffer, 'h', 7);
		taskH.start();

		LongTask taskI = new LongTask(sharedData, buffer, 'i', 8);
		taskI.start();

		LongTask taskJ = new LongTask(sharedData, buffer, 'j', 9);
		taskJ.start();

		LongTask taskK = new LongTask(sharedData, buffer, 'k', 10);
		taskK.start();

		LongTask taskL = new LongTask(sharedData, buffer, 'l', 11);
		taskL.start();

		LongTask taskM = new LongTask(sharedData, buffer, 'm', 12);
		taskM.start();
		LongTask taskN = new LongTask(sharedData, buffer, 'n', 13);
		taskN.start();
		LongTask taskO = new LongTask(sharedData, buffer, 'o', 14);
		taskO.start();
		LongTask taskP = new LongTask(sharedData, buffer, 'p', 15);
		taskP.start();
		LongTask taskQ = new LongTask(sharedData, buffer, 'q', 16);
		taskQ.start();
		LongTask taskR = new LongTask(sharedData, buffer, 'r', 17);
		taskR.start();
		LongTask taskS = new LongTask(sharedData, buffer, 's', 18);
		taskS.start();
		LongTask taskT = new LongTask(sharedData, buffer, 't', 19);
		taskT.start();
		LongTask taskU = new LongTask(sharedData, buffer, 'u', 20);
		taskU.start();
		LongTask taskV = new LongTask(sharedData, buffer, 'v', 21);
		taskV.start();
		LongTask taskW = new LongTask(sharedData, buffer, 'w', 22);
		taskW.start();
		LongTask taskX = new LongTask(sharedData, buffer, 'x', 23);
		taskX.start();
		LongTask taskY = new LongTask(sharedData, buffer, 'y', 24);
		taskY.start();
		LongTask taskZ = new LongTask(sharedData, buffer, 'z', 25);
		taskZ.start();

		try {
			taskA.join();
			taskB.join();
			taskC.join();
			taskD.join();
			taskE.join();
			taskF.join();
			taskG.join();
			taskH.join();
			taskI.join();
			taskJ.join();
			taskK.join();
			taskL.join();
			taskM.join();
			taskN.join();
			taskO.join();
			taskP.join();
			taskQ.join();
			taskR.join();
			taskS.join();
			taskT.join();
			taskU.join();
			taskV.join();
			taskW.join();
			taskX.join();
			taskY.join();
			taskZ.join();

		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		System.out.println("Alphabet Count = " + sharedData.getResult());

	}

}
