/**
 * Homework assignment 5
 * CS520 
 * @author Yin Deascentis
 *	Senator class
 */
public class Senator {
	//instance variables
	private String name, party, state;
	private int yearsInOffice;
	
	//constructor
	public Senator(String name) {
		this.name = name;
	}
	//getter for name
	public String getName() {
		return name;
	}
	//getter for party
	public String getParty () {
		return party;
	}
	//getter for state
	public String getState() {
		return state;
	}
	//getter for the yearsInOffice
	public int getYearsInOffice() {
		return yearsInOffice;	
	}
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	//setter for party
	public void setParty(String party) {
		this.party = party;
	}
	//setter for state
	public void setState(String state) {
		this.state = state;
	}
	//setter for yearsInOffice
	public void setYearsInOffice(int yearsInOffice) {
		this.yearsInOffice = yearsInOffice;
	}
	
	@Override
	public String toString() {
		return "Senator " + getName() + ", (" + getParty()  +") " +  "from " + getState() + " has been the senator for  " + getYearsInOffice() + " years. ";
	}

}// end of Senator class
