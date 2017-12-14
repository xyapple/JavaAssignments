
package cs520.hw6.part1;

/**
 * @author yd
 *
 */
public class LongTask extends Thread {

	/**
	 * @param args
	 * 
	 */

	private SharedResults sharedData;
	private StringBuffer inputData;
	private char target;

	// Constructor
	public LongTask(SharedResults sharedData, StringBuffer inputData, char target) {
		super();
		this.sharedData = sharedData;
		this.inputData = inputData;
		this.target = target;

		setName("Thread_ " + target);
	}

	/*
	 * In the run method, use a loop to go over char chacacter in the inputData and
	 * count the number of occurrences of target. After the loop is done, create a
	 * ResultsEntry object with this count and the target character, and invoke the
	 * addToResults method of the shared results object.
	 */

	public void run() {

		System.out.println("Thread Thread_" + target + " running");
		int count = 0;
		for (int i = 0; i < inputData.length(); i++) {
			if (inputData.charAt(i) == target) {
				count++;
			}

		}

		ResultsEntry resultsOfRun = new ResultsEntry(count, target);
		sharedData.addToResults(resultsOfRun);

	}

}// end of LongTask
