/**
 * 3.  Create a method which accepts an integer array, 
   the array and returns the resulting array in sorted order
 * @author Shweta Keerti
 *
 */
import java.util.Arrays;

public class ReverseNumber {

	public static void main(String[] args) {
		int a[]= {2,5,1,4};
		getSort(a);
		}
	

	public static int getSort(int a[]) {
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		return 0;
	}
}