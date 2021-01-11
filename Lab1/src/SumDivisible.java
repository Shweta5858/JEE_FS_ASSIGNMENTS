/**
 * 5. Create a class with a method which can calculate the 
   sum of first n natural numbers which are divisible by 3 or 5.
 * @author Shweta Keerti
 *
 */

public class SumDivisible {

	public static void main(String[] args){
		int num=6;
		System.out.println("Sum of numbers divisible by 3 or 5 : "+ Sum1(num));
		}
	
	
	public static int Sum1(int num) {
	int sum = 0;
	for(int i=0;i<=num;i++) {
	if((i % 3 == 0) || (i % 5 ==0 ) )
		sum+=i;
	}
	return sum;
	}
}

