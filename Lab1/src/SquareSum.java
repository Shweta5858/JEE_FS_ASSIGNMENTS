/**
 * 6. Create a class with a method to find the difference between the
  sum of the squares and the square of the sum of the first n natural numbers.
 * @author Shweta Keerti
 *
 */
public class SquareSum {

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Sum of squares : "+ Square(num));
		System.out.println("Square of the sum: "+ Sum1(num));
		System.out.println("Difference between sum of squares and square of sum : "+Difference(num));
	}
	
	public static int Square(int num) {
    int square=0;
    int sum = 0;
    int count=0;
	while (count<= 5) {
    square = (count * count);
    sum = sum + square;
    count++;
}
  return sum;
}
	
	public static int Sum1(int num) {
		int sum0 = 0;
		int sum2=0;
		for(int i=0;i<=num;i++) {
			sum0+=i;
		}
		sum2=sum0*sum0;
		return sum2;
	}
	
	public static int Difference(int num) {
		int diff=0;
		diff=Square(num)-Sum1(num);
		return diff;
	}
}
