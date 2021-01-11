/**
*  Create a method which accepts a String and replaces all the consonants 
   in the String with the next alphabet. 
   Note: Consonant refers to all alphabets excluding vowels
*  @author Shweta Keerti
*/

import java.util.*;
public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();
		System.out.println("Resultant string "+ResString(str));	
	}
	private static String ResString(String str) {
		String vowels ="aeiouAEIOU";
		int length = str.length();
		String str1="";
		char[]stringArray = str.toCharArray();
		for(int i=0;i<length;i++) {
			if(vowels.contains(stringArray[i]+"")) {
				str1+=stringArray[i]+"";
			}
			else {
				char ch =stringArray[i];
				if(ch=='z') {
					ch='a';
				}
				else if(ch=='Z') {
					ch='A';
				}
				else {
					ch++;
				}
				str1+=ch+"";
			}
		}
		return str1;
	}
}