public class NewProject {
	// defining the variables and data types
	int ProjectID; 
	String ProjectName;
	int ProjectNumber;
	String BuildingType;
	String ProjectAddress;
	int ERFNumber; 
	Double FeeCharged;
	Double AmountPaid;
	String DeadLine;
	
	// New Project Attributes 
	public NewProject(int ProjectID, String ProjectName,int ProjectNumber, String BuildingType, String ProjectAddress,  int ERFNumber, Double FeeCharged, Double AmountPaid, String DeadLine){
		
	this.ProjectID = ProjectID;
	this.ProjectName = ProjectName;
	this.ProjectNumber = ProjectNumber;
	this.BuildingType = BuildingType;
	this.ProjectAddress = ProjectAddress;
	this.ERFNumber = ERFNumber;
	this.BuildingType = BuildingType;
	this.AmountPaid= AmountPaid;
	this.DeadLine = DeadLine;
	}
		//toString methods to display values 
	public String toString(String ProjectName) {
	String output = "Project Name: " + ProjectName;
	output += "\nProject ID:" + ProjectID;
	output += "\nProject Number: " + ProjectNumber;
	output += "\nBuilding Type:  " + BuildingType;
	output += "\nProject Number: " + ProjectAddress;
	output += "\nERF Number:" +ERFNumber;
	output += "\nFee Charged:  " + FeeCharged;
	output += "\nAmount Paid: " + AmountPaid;
	output += "\nDead Line: "+DeadLine;
	return output;
	
	}

}

