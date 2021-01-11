/**
 * 1. Create a method to find the sum of cubes of n digit number. 
 * @author Shweta Keerti
 *
 */

public class SumOfCubes {
	
	
		public static void main(String[] args){
		    int num = 5;
		    System.out.println("Sum of cubes :"+Cubes(num) );
		}
		
		public static int Cubes(int num) {
			int sum=0;
			for(int i=1;i<=num;i++)
			sum+=i*i*i;
			return sum;
		}
}