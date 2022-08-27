public class Student {

	// Attributes
   String name;
   String id_no;
   int age;
   int grade;
   String address;
   String marks;
  
	
		// Methods 
	   public Student(String id_no, String name, int age, int grade, String address, String marks) {
	      this.name = name;
	      this.id_no = id_no;
	      this.age = age;
	      this.grade = grade;
	      this.address = address;
	      this.marks = marks;
	   }
	// method to get a student name
	   public String getName() {
	      return name;
	   }
		// method to get student ID
	   public String getID() {
	      return id_no;
	   }
	   // method to get student age
	   public int getAge() {
		     return age;
		}
		// method to get student address	
		public String getAddress() {
			return address;
		}
		// method to get student age
		  public int getGrade() {
			   return grade;
		}
		// method to get student address	
		public String getMarks() {
			return marks;
		}
	   
	//toString methods to display values 
   public String toString() {
      String output = "Name: " + name;
      output += "\nStudent ID: "+ id_no;
      output += "\nAge:" + age;
      output += "\nStudent Grade: " + grade;
      output += "\nStudent Address :" + address;
      output += "\nStudent Marks: " + marks;
   
      return output;
   }

}
