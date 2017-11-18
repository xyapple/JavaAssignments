package cs520.hw2.part2;

import java.text.NumberFormat;

public class BankingObjectStyle {
	public static void main(String[] args) {
		
		//create two new instances from BankCD
		BankCD bank1CD = new BankCD("A");
		BankCD bank2CD = new BankCD("B");
		
		//set the initial deposit
		bank1CD.setInitialDeposit(5000);
		//set the number of the years
		bank1CD.setNumberOfYears(3);
		//set the rate
		bank1CD.setRate(4);
		//call the printCDDetails() method from class bankCD		
		bank1CD.printCDDetails();
		
		//set the initial deposit
		bank2CD.setInitialDeposit(5000);
		//set the number of the years
		bank2CD.setNumberOfYears(4);
		//set the rate
		bank2CD.setRate(3);
		//call the printCDDetails() method from class bankCD		
		bank2CD.printCDDetails();
		
		
		//get the final value of banks
		double bank1FinalV = bank1CD.getFinalValue();
		//get the final value of banks
		double bank2FinalV = bank2CD.getFinalValue();
		
		double differenceCD; //instance variable
		//format dollar sign
		NumberFormat dollarSign = NumberFormat.getCurrencyInstance(); 
				
		if(bank1FinalV > bank2FinalV) {
			//if bank1 final value is larger than bank2
			differenceCD =  bank1FinalV - bank2FinalV;
			System.out.println("Bank"+ bank1CD.getBankName() +"'s CD Exceeds Bank" + bank2CD.getBankName()+ "'s CD by " + dollarSign.format(differenceCD));

		} else if(bank1FinalV == bank2FinalV) {
			//if bank1 final value is equal to bank2
			System.out.println("Bank" + bank1CD.getBankName() + "'s CD is equal to Bank" + bank2CD.getBankName()+ "'s CD. ");
		} else {
			//if bank2 final value is larger than bank1
			differenceCD = bank2FinalV - bank1FinalV;
			System.out.println("Bank"+ bank2CD.getBankName() +"'s CD Exceeds Bank" + bank1CD.getBankName()+ "'s CD by " + dollarSign.format(differenceCD));
		
		}
	
		
	}

}
