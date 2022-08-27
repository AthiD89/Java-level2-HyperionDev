//import packages
// defining the Main class
public class School {
	// defining the main method
	public static void main (String[] args) {
		
		//the class objects secretary and teacher
		Secretary secretary = new Secretary("Athi", 23, "clerck", "Khayelitsha Cape town 7784", "Female", "4 years");
		Teachers teacher = new Teachers("Nikita", 25, "Lecture", "96 Moodust Walk Cape Town", "Female", "6 years" );
		
		//the class objects of students
		Student students = new Student("89576","Nandi", 17, 11, "76 Mjodo street", "92");
		Student sally = new Student("1765","Josh", 15, 8, "4th Avenue Khwezi Park", "38");
	    	Student sipho = new Student("8745","Sizwe", 17 , 11,"Nojilana  Street", "71");
	    	Student rajesh = new Student("3414","Kim", 19, 12,"Cape Town 144", "83");
		
		//output of the attributes
		System.out.println("SECRETARY INFORMATION\n");
		System.out.println(secretary.toString() + "\n");
		
		// print out teachers information
		System.out.println("TEACHER'S INFORMATION \n");
		System.out.println(teacher.toString() + "\n");
		
		//print out students information
		System.out.println("STUDENT'S INFORMATIOn \n");
		System.out.println(students.toString() + "\n");
		System.out.println(sally.toString() + "\n");
		System.out.println(sipho.toString() + "\n");
		System.out.println(rajesh.toString() + "\n");
	}
}