package cpp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int d=54;
		int temp =0;
		for(int a=0;a<d;a++) {
			temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	}
		System.out.println(Arrays.toString(arr));
		
//		List<Integer> arr=new ArrayList<>();
//		arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);
//		int d=2;
//		int temp=0;
//		for(int a=0;a<d;a++) {
//			temp=arr.get(0);
//			for(int i=0;i<arr.size()-1;i++) {
//				//arr.set(i,arr.get(i+1));
//				arr.set(i, arr.get(i+1));
//			}
//}
//		arr.set(arr.size()-1,temp);
//		System.out.println(arr);
	}
}
