/**
*  Create a method that accepts a String and checks if it is a positive string. 
   A string is considered a positive string, if on moving from left to right each character
   in the String comes after the previous characters in the Alphabetical order.
   For Example: ANT is a positive String (Since T comes after N and N comes after A). 
   The method should return true if the entered string is positive.
*  @author Shweta Keerti
*  
*/


import java.util.*;
public class Exercise6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		if(checkString(str)) {
			System.out.println(str+" is positive string");
		}
		else {
			System.out.println(str+" is not a positive string");
		}
		
	}
	private static boolean checkString(String str) {
		int length = str.length();
		char [] array = str.toCharArray();
		char beforeChar=array[0];
		for(int i=0;i<length;i++) {
			if(array[i]<beforeChar) {
				return false;
			}
			beforeChar = array[i];
		}
		return true;
	}
}