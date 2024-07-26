package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collision {
	
	public static void main(String [] agrs) {
		int[] arr= {10,2,-5};
		
		int j=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<0&&arr[i-1]>0||arr[i]>0&&arr[i-1]<0) {
				if(Math.abs(arr[i])>Math.abs(arr[i-1])) {
					arr[i-1]=0;
				}
				else if(Math.abs(arr[i])<Math.abs(arr[i-1])) {
					arr[i]=arr[i-1];
					arr[i-1]=0;
				}
				else {
					arr[i]=0;
					arr[i-1]=0;
				}
			}
		}
		//int n=0;
		
		List <Integer> list =new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				list.add(arr[i]);
			}
		}
System.out.println(list);		
		
		
		//System.out.println(Arrays.toString(arr));
		
		
	}
	

}
