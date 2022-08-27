import java.util.Scanner;

//

public class Recursion {
	static Scanner keyboard = new Scanner(System.in);
	//reversing a string
	public static String getReverser(String in, int i)
	{
		if (i < 0)
			return "";
		else
			return in.charAt(i) + getReverser(in, i-1);
	}
	
	public static void main(String[] args) {
		
		int index = 0;
		//Take user input
		System.out.println("Enter a String");
		String input = keyboard.nextLine();
		//print reversed string
		System.out.println(getReverser(input, input.length()-1));
										
	 }
   
}
