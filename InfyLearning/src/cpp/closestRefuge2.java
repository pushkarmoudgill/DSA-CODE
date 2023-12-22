package cpp;

import java.util.Scanner;

public class closestRefuge2 {
	public static int  find(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
		//	int length=arr.length;
			if(Math.abs(arr[i])<=arr.length) {
				int a=Math.abs(arr[i]);
				arr[a-1]=-Math.abs(arr[a-1]);
				
			}
		}
		int x=arr.length+1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				x= i+1;
				break;
			}
		}
		
		return x;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//	int arr[]= {1,2,3};
			int res=find(arr);
		System.out.println(res);
		}
	
}
