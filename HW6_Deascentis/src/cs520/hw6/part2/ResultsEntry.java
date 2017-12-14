/**
 * CS 520 Homework 6 Part 2
 * Yin Deascentis
 */

package cs520.hw6.part2;

public class ResultsEntry {
	
	//instance variable 
	private int count;
	private char target;
	
	//constructor
	public ResultsEntry(int count, char target) {
		this.count = count;
		this.target = target;
	}
	
	//getter getCount
	public int getCount() {
		return count;
	}
	
	//getter getTarget
	public char getTarget() {
		return target;
	}
	
	//Public toString method that returns a string in the format <target,count>
	@Override
	public String toString() {
		return "<" + target + ", " + count + ">";
	}
	

	

}
