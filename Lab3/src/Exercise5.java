/**
 * Exercise 5: Write a Java program that displays the number of characters, lines and words in a text? 
 *@author Shweta Keerti
 *
 */


public class Exercise5 {

	public static void main(String[] args) {
		
    String str="  My learning\\capgemini.com "; 
    String []words=str.split("[ ,.]+");
    String []lines=str.split("[\r\n]");
    
    System.out.println("Numbers of characters = "+str.length());
    System.out.println("Number of lines = "+lines.length);
    System.out.println("Number of words = "+words.length);
	}

}