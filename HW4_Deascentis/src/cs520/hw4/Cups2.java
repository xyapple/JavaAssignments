
/**
 * CS520 Homework4 Part 2
 * Yin Deascentis
 */
package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Cups2 extends JFrame {
	/*
	 * instance variables
	 */
	// coordinates and cup width and height
	private int startX, startY, cupWidth, cupHeight;

	// the number of cups in the bottom row
	private int baseLength;

	// the spacing between adjacent cups
	private int cupSpacing;

	// constructor
	public Cups2() {
		startX = 100;
		startY = 300;
		cupWidth = 25;
		cupHeight = 40;
		baseLength = 7;
		cupSpacing = 6;
		setTitle("Deascentis");
	}

	public void paint(Graphics g) {

		int[] startArrayX = new int[] {startX, startX+cupWidth-5, startX+cupWidth, startX-5}; // set starting X array position with current X
		int[] startArrayY = new int[] {startY, startY, startY+cupHeight, startY+cupHeight}; // set starting Y array position with current Y
		
		int currentX = startX;
		int currentY = startY;
		
		int[] currentArrayX = startArrayX;
		int[] currentArrayY = startArrayY;
		
		// This is the row
		for (int row = 1; row <= baseLength; row++) {
			// reset each currentX with a new starting point for each row
			currentX = startX;
			// set the color
			if (row % 2 == 0) {
				g.setColor(Color.BLUE);
			} else {
				g.setColor(Color.RED);
			}
			// this is the column
			for (int col = 0; col <= baseLength - row; col++) {				
				// each starting point X is each starting point + the width of cup and space
				// between cups				
				currentX = currentX + cupWidth + cupSpacing;
				currentArrayX = new int[]{currentX, currentX+cupWidth-5, currentX+cupWidth, currentX-5};
				currentArrayY = new int[] {currentY, currentY, currentY+cupHeight, currentY+cupHeight};
				g.fillPolygon(currentArrayX, currentArrayY, 4);
			}
			// each column is reduce one cup
			currentY -= cupHeight;
			// on each row, each cup, staring place is the (cupWidth + cupSpacing)/2
			startX += (cupWidth + cupSpacing) / 2;
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cups2 app = new Cups2();
		app.setSize(550, 550);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
