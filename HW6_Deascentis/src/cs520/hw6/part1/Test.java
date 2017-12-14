/**
 * 
 */
package cs520.hw6.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author yd
 *
 */
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
		LongTask taskA = new LongTask(sharedData, buffer, 'a');
		taskA.start();

		LongTask taskB = new LongTask(sharedData, buffer, 'b');
		taskB.start();

		LongTask taskC = new LongTask(sharedData, buffer, 'c');
		taskC.start();

		LongTask taskD = new LongTask(sharedData, buffer, 'd');
		taskD.start();

		LongTask taskE = new LongTask(sharedData, buffer, 'e');
		taskE.start();

		LongTask taskF = new LongTask(sharedData, buffer, 'f');
		taskF.start();

		LongTask taskG = new LongTask(sharedData, buffer, 'g');
		taskG.start();

		LongTask taskH = new LongTask(sharedData, buffer, 'h');
		taskH.start();

		LongTask taskI = new LongTask(sharedData, buffer, 'i');
		taskI.start();

		LongTask taskJ = new LongTask(sharedData, buffer, 'j');
		taskJ.start();

		LongTask taskK = new LongTask(sharedData, buffer, 'k');
		taskK.start();

		LongTask taskL = new LongTask(sharedData, buffer, 'l');
		taskL.start();

		LongTask taskM = new LongTask(sharedData, buffer, 'm');
		taskM.start();
		LongTask taskN = new LongTask(sharedData, buffer, 'n');
		taskN.start();
		LongTask taskO = new LongTask(sharedData, buffer, 'o');
		taskO.start();
		LongTask taskP = new LongTask(sharedData, buffer, 'p');
		taskP.start();
		LongTask taskQ = new LongTask(sharedData, buffer, 'q');
		taskQ.start();
		LongTask taskR = new LongTask(sharedData, buffer, 'r');
		taskR.start();
		LongTask taskS = new LongTask(sharedData, buffer, 's');
		taskS.start();
		LongTask taskT = new LongTask(sharedData, buffer, 't');
		taskT.start();
		LongTask taskU = new LongTask(sharedData, buffer, 'u');
		taskU.start();
		LongTask taskV = new LongTask(sharedData, buffer, 'v');
		taskV.start();
		LongTask taskW = new LongTask(sharedData, buffer, 'w');
		taskW.start();
		LongTask taskX = new LongTask(sharedData, buffer, 'x');
		taskX.start();
		LongTask taskY = new LongTask(sharedData, buffer, 'y');
		taskY.start();
		LongTask taskZ = new LongTask(sharedData, buffer, 'z');
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
