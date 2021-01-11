/**
 * 8. Create a method to check if a number is a power of two or not.
 * @author Shweta Keerti
 *
 */
public class PowerOfTwo {
	
	public static void main (String[] args) {
		int num=8;
		if (Power(num))
			System.out.println(num+ " is power of two");
		else
			System.out.println(num+" is not a power of two");
			
	}
	
	public static boolean Power(int num) {
		return(num >0) &&((num&(num-1)) ==0);
	}
}
