// Defining class Secretary
public class Secretary {
	
	//data types and variables
	String name;
	int age;
	String duties;
	String address;
	String gender;
	String years;
	
	//Secretary constructor with methods
	public Secretary(String name, int age, String duties, String address, String gender, String years) 
	{
		// generated constructor attributes
		this.name = name;
		this.age = age;
		this.duties = duties;
		this.address = address;
		this.gender = gender;
		this.years = years;
	}
	//Method to get a name
		public String getName() 
		{
	      return name;
	    }
		//Method to get age
	   public int getAge()
	   {
	      return age;
	   }
	   //method to get Duties
	   public String getDuty() 
		{
	      return duties;
	    }
		//method to get address
	   public String getAddress()
	   {
	      return address;
	   }
	   //Method to get gender
	   public String geGender() 
		{
	      return gender;
	    }
		//Method to get years
	   public String getYears()
	   {
	      return years;
	   }
	   
			//toString methods to display values 
			public String toString() {
			String output = "Name: " + name;
			output += "\nAge:" + age;
			output += "\nDuty:  " + duties;
			output += "\nAddress: " + address;
			output += "\nGender: " + gender;
			output += "\nYears of Service: " + years;
			return output;	
			}
}
