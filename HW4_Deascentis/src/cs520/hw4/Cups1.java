/**
 * CS520 Homework4 Part1
 * Yin Deascentis
 */
package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Cups1 extends JFrame {
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
	public Cups1() {
		startX = 100;
		startY = 300;
		cupWidth = 25;
		cupHeight = 40;
		baseLength = 7;
		cupSpacing = 6;
		setTitle("Deascentis");
	}

	public void paint(Graphics g) {

		int currentX = startX; // set starting X position with current X
		int currentY = startY; // set starting Y position with current Y
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

				g.fillRect(currentX, currentY, cupWidth, cupHeight);
				// each starting point X is each starting point + the width of cup and space
				// between cups
				currentX = currentX + cupWidth + cupSpacing;
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
		Cups1 app = new Cups1();
		app.setSize(550, 550);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
