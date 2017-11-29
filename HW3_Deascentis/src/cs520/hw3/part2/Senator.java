/*
 * CS520 Homework3 part2
 * Yin Deascentis
 */
package cs520.hw3.part2;

public class Senator {
	//instance variables
	private String name, party, state;
	private int yearsInOffice;
	
	//constructor
	public Senator (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getYearsInOffice() {
		return yearsInOffice;
	}

	public void setYearsInOffice(int yearsInOffice) {
		 if (yearsInOffice < 0) 
		        throw new IllegalArgumentException("Years in office cannot be negative.");
			this.yearsInOffice = yearsInOffice;
		
	}

	@Override
	public String toString() {
		return "Senator " + getName() + ", (" + getParty()  +") " +  "from " + getState() + " has been the senator for  " + getYearsInOffice() + " years. ";
	}
	

}
