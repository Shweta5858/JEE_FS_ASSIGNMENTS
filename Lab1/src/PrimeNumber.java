/**
 * 4. Write a Java program that prompts the user for an integer 
  and then prints out all the prime numbers up to that Integer?
 * @author Shweta Keerti
 *
 */
public class PrimeNumber {
  
	public static void main(String[] args) {
		int n=10;
		for(int i=2;i<n;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if (count==0) {
				System.out.println(" "+i);
			}
		}
	}
}
