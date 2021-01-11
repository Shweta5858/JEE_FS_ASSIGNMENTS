/**
 * 7. Create a method to check if a number is an increasing number.
 * @author Shweta Keerti
 *
 */
public class CheckNumber {

	public static void main(String[] args) {
		int num=1232;
		boolean flag=false;
		int currentdigit=0;
		currentdigit=num % 10;
		num=num/10;
		while (num>0) {
			if(currentdigit<=num%10) {
				flag=true;
				break;
			}
			currentdigit=num%10;
			num=num/10;
		}
		if(flag) {
			System.out.println("Digits are not increasing");
		}
		else {
			System.out.println("Digits are increasing");
		}

	}

}
