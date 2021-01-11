/**
*  Write a Java program that reads a line of integers and then displays each integer and the 
   sum of all integers. (Use String Tokenizer class)?
*  @author Shweta Keerti
*/
import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		System.out.println("Sum Of Integers:"+Sum(str));
	}
	private static int Sum(String str1) {
		String []str2=str1.split(" ");
		int length = str2.length;
		int sum=0;
		for(int i=0;i<length;i++) {
			sum+=Integer.parseInt(str2[i]);
		}
		return sum;
	}
	
}
