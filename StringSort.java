/**
 * 2. Create a method that can accept an array of String objects and sort in alphabetical order.
   The elements in the left half should be completely in upper case and the elements in the 
   right half should be completely in lower case. Return the resulting array.
   Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE.
 * @author Shweta Keerti
 *
 */
import java.util.Arrays;
public class StringSort {

	
		public static String SortString(String a[]) {
			Arrays.sort(a);
			String[] str=new String[a.length];
			if(a.length%2==0) {
				for(int i=0;i<a.length/2;i++) {
					str[i]=(a[i].toUpperCase());
				}
				for(int i=a.length/2;i<a.length;i++) {
					str[i]=(a[i].toLowerCase());
				}
			}
			else {
				for(int i=0;i<a.length/2;i++) {
					str[i]=(a[i].toUpperCase());
				}
				for(int i=a.length/2;i<a.length;i++) {
					str[i]=(a[i].toLowerCase());
			}
		}
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]);
			}
			return null;
	}
		public static void main(String[] args) {
			String[] a={"University","Road"};
			SortString(a);
		}
}
