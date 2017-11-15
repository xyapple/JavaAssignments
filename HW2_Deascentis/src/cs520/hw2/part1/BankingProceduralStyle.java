package cs520.hw2.part1;

import java.text.*;

public class BankingProceduralStyle {
	public static void main(String[] args) {
		
		double BankA = investedCD("A", 3, 5000, 4); //Invoke investedCD method
		double BankB = investedCD("B", 4, 5000, 3); //Invoke investedCD method
		
		double differenceCD; //instance variable
		
		//format dollar sign
		NumberFormat dollarSign = NumberFormat.getCurrencyInstance(); 
		
		//check to see the difference between BankA and BankB
		//if BankA final value is more then BankB final value
		if(BankA > BankB) {
			differenceCD = BankA - BankB;
			System.out.println("Bank A's CD Exceeds Bank B's CD by " + dollarSign.format(differenceCD));
			//if BankA final value is equal the BankB final value
		} else if(BankA == BankB) {
			System.out.println("Bank A's CD is equal to Bank B's CD. ");
			//if BankA final value is smaller than the BankB final value 
		} else {
			differenceCD = BankB - BankA;
			System.out.println("Bank B's CD Exceeds Bank A's CD by " + dollarSign.format(differenceCD));
		}
		
	}
	
	private static double investedCD(String bankName, int year, 
			int initialDeposit, double interestRate) {
		
		//FinalValue = InitialDeposit * (1 + r)^t
		double finalValue = initialDeposit * Math.pow((1+interestRate*0.01), year);
		
		//format dollar sign
		NumberFormat dollarSign = NumberFormat.getCurrencyInstance();
		
		//format the percent sign
		DecimalFormat df = new DecimalFormat("#,##0.00 '%'");
		
		//make sure print output format as homework requirement
		System.out.println("Bank"+bankName+" "+year+"-year " + " CD "+ 
							dollarSign.format(initialDeposit) + " at " + 
							df.format(interestRate) + " rate " + " is " + " worth "+
							dollarSign.format(finalValue));
		return finalValue;
			
		
	}

}
