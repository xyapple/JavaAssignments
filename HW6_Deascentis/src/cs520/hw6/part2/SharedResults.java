/**
 * CS 520 Homework 6 Part 2
 * Yin Deascentis
 */

package cs520.hw6.part2;

import java.util.ArrayList;


public class SharedResults {
	// A private instance variable – results (ArrayList of ResultsEntry type)
	private ArrayList<ResultsEntry> results = new ArrayList<ResultsEntry>();

	// A default constructor that initializes the above data structure.
	/*
	 * The getResult method with no arguments which returns the sum of the count
	 * entry values in the shared results data structure. Handle the synchronization
	 * issue with this method.
	 */

	public SharedResults() {
		super();

	}

	/*
	 * A void addToResults method which takes the given ResultsEntry argument and
	 * adds it to the end of the shared results. This method then prints to the
	 * console the name of the current thread, the entry it added, and the shared
	 * results data structure. Handle the synchronization issue with this method.
	 */
	public synchronized void addToResults(ResultsEntry el, int turn) {
		// Use the size of the data structure to determine if it is the calling thread’s
		// turn.
		int n = results.size();
		// System.out.println(n);
		while (turn != n) {

			try {
				System.out.println("Calling Thread's Turn " + turn + " , WhoseTurn " + n + ".....waite");
				wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			notifyAll();
		}

		results.add(el);
		System.out.println("Calling Thread's Turn " + turn + " , " + Thread.currentThread().getName() + " is adding "
				+ el.getTarget() + " Cumulative Results are " + results);

		// System.out.println(results);

	}

	public synchronized int getResult() {
		int sum = 0;
		for (ResultsEntry el : results) {
			sum = sum + el.getCount();
		}

		return sum;
	}

}// end of SharedResults
