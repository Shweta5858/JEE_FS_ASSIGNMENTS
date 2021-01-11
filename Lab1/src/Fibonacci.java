/**
 * 3. The Fibonacci sequence is defined by the following rule. 
   The first 2 values in the sequence are 1, 1. 
   Every subsequent value is the sum of the 2 values preceding it. 
   Write a Java program that uses both recursive and non-recursive
   functions to print the nth value of the Fibonacci sequence?
 * @author Shweta Keerti
 *
 */
   
public class Fibonacci {
	
public static void main(String[] args) {
	int n=6;
	System.out.println("\nThis is Fibonacci series using non recursive function : "+ FibNonRecursive(n));
	System.out.println("Fibonacci series using recursive function : "+  FibRecursive(n));
	
}

public static int FibNonRecursive(int n) {       // Non recursive function
 int n1=1,n2=1,n3,i,count=6;    
 System.out.print(n1+" "+n2);
    
 for(i=2;i<count;i++)  
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3; 
 }    
 return n;
}

public static int FibRecursive(int n) {       // Recursive function
	if (n<=1)
		return n;
	else 
		return FibRecursive(n-1)+FibRecursive(n-2);
}
}

