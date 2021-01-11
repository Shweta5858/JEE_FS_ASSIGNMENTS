/**
 * Exercise 2: Create a class containing a method to create the mirror image of a String. 
   The method should return the two Strings separated with a pipe(|) symbol .
 * @author Shweta Keerti
 *
 */

import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String ");
    String str=sc.next();
    System.out.print(getImage(str,sc));
	}
	private static String getImage(String str,Scanner sc)
	{
		StringBuilder sb = new StringBuilder(str);
		StringBuilder rev=sb.reverse();
		rev=sb.append("|"+rev);
		return rev.toString();
		
	}

}