/**
 * Exercise 4: Create a method that accepts a number and modifies it such that the each of the digit
   in the newly formed number is equal to the difference between two consecutive digits in the original number. 
 * @author Shweta Keerti
 *
 */

import java.util.Scanner;
import java.lang.Math; 
public class Exercise4 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the String ");
    String str=scanner.next();
    System.out.print(modifyNumber(str,scanner));
	}
	private static String modifyNumber(String str,Scanner scanner)
	{
		StringBuilder sb = new StringBuilder("");
		char []ch=str.toCharArray();
		int length=str.length();
		int a,b,diff;
		for(int i=0;i<length-1;i++)
		{
			a=(int)(ch[i]);
			b=(int)(ch[i+1]);
			diff=Math.abs(a-b);
			System.out.print(diff+" ");
			sb=sb.append(diff);
		}
		sb.append(ch[length-1]);
		return sb.toString();
	}

}

