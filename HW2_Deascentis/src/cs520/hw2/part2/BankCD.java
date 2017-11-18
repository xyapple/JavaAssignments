package cs520.hw2.part2;
import java.text.*;

public class BankCD {
	//instance variables
	private String bankName;
	private int initialDeposit, numberOfYears;
	private double rate;
	
	//constructor 
	public BankCD(String bankName) {
		this.bankName = bankName;
	}
	// Mutator Method set the initialDeposit
	public void setInitialDeposit(int initialDeposit) {
		 this.initialDeposit = initialDeposit;
	}
	//Mutator Method set the numberOfyears
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	//Mutator Method set the rate
	public void setRate(double rate) {
		this.rate = rate;
	}
	//Mutator Method get the value of initialDeposit
	public int getInitialDeposit() {
		return initialDeposit;
	}
	//Accessor Method get the value of numberOfyears
	public int getNumberOfYears() {
		return numberOfYears;
	}
	//Accessor Method get the value of rate
	public double getRate() {
		return rate;
	}
	//Accessor Method get the bank name
	public String getBankName() {
		return bankName;
	}
	//Accessor Method get final value of rate
	public double getFinalValue() {
	  double finalValue = initialDeposit * Math.pow((1+rate*0.01), numberOfYears);
		return finalValue;
	}
	
	public void printCDDetails() {
		//format dollar sign
		NumberFormat dollarSign = NumberFormat.getCurrencyInstance();
				
		//format the percent sign
		DecimalFormat df = new DecimalFormat("#,##0.00 '%'");
//		String bankName = this.bankName;
//		int numberOfYears = getNumberOfYears();
		System.out.println("Bank"+ getBankName() +" "+getNumberOfYears() +"-year " + " CD "+ 
				dollarSign.format(getInitialDeposit()) + " at " + 
				df.format(getRate()) + " rate " + " is " + " worth "+
				dollarSign.format(getFinalValue()));
	}
}












