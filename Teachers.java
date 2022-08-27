// defining class Teacher
public class Teachers {
	
	// //data types and variables
	String name;
	int age;
	String duties;
	String address;
	String gender;
	String years;
	
	////TEACHER constructor of a class Teacher
	public Teachers(String name, int age, String duties, String address, String gender, String years) {
		// generated constructor attributes
		this.name = name;
		this.age = age;
		this.duties = duties;
		this.address = address;
		this.gender = gender;
		this.years = years;
	}
	
	// method to get a name
			public String getName() 
			{
		      return name;
		    }
			//method to get age
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
		   //method to get gender
		   public String geGender() 
			{
		      return gender;
		    }
			//method to get years
		   public String getYears()
		   {
		      return years;
		   }
	
	//toString methods to display values 
	public String toString() {
		String output = "Name: " + name;
		output += "\nAge:" + age;
		output += "\ndDuty:" + duties;
		output += "\nAddress:" + address;
		output += "\nGender:" + gender;
		output += "\nYears:" + years;
		return output;
		
		}
}
