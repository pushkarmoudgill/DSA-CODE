package cpp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArray {
	public static void main(String [] args) {
	int a[]= {1,2,3,4};
	//System.out.print(a.length);
//	int b[]=new int[a.lengt/h];
//	int j=a.length;
// for(int i=0;i<a.length;i++) {
//	 b[j-1]=a[i];
//	 j--;
// }
	Collections.reverse(Arrays.asList(a));
	System.out.println(Arrays.asList(a));
// for(j=0;j<a.length;j++) {
//	 System.out.println(a[j]);
// }

}
}