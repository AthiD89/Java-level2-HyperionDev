// Architect class
public class Architect {
	// defining the variables and data types
	String ArchitectName;
	int ArchitectNumber;
	String ArchitectAddress;
	String ArchitectEmail;
	
	// Architecter attributes
	public Architect(String ArchitectName, int ArchitectNumber, String ArchitectEmail, String ArchitectAddress){
		
	this.ArchitectName = ArchitectName;
	this.ArchitectNumber = ArchitectNumber;
	this.ArchitectAddress = ArchitectAddress;
	this.ArchitectEmail = ArchitectEmail;
	}
		//toString methods to display values 
	public String toString(String ArchitectEmail) {
	String output = "Name: " + ArchitectName;
	output += "\nCell Number:" + ArchitectNumber;
	output += "\nEmail:  " + ArchitectEmail;
	output += "\nAddress: " + ArchitectAddress;
	return output;
	
	}

}
