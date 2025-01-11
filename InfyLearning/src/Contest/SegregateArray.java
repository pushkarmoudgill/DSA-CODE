package Contest;

import java.util.Arrays;

public class SegregateArray {
	
	public static void main(String [] args) {
		int [] arr= {13, 100, 21, 20};
		
		
		int [] ans=new int [arr.length];
		
		System.out.println(Arrays.toString(ans));

		
		int l=-1;
		int r=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				
				l++;
				ans[l]=arr[i];
				if(l>0) {
					if(ans[l-1]>ans[l]) {
						int temp =ans[l];
						ans[l]=ans[l-1];
						ans[l-1]=temp;
					}
				}
			}
			
			else {
				r--;
				ans[r]=arr[i];
				
				if(r<arr.length-1) {
					if(ans[r]>ans[r+1]) {
						int temp1=ans[r];
						ans[r]=ans[r+1];
						ans[r+1]=temp1;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
