package cpp;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestRefuge {
	public static void  find(int[] arr) {
		Arrays.sort(arr);

		int a1=0;
		int a=0;

		for(int i=1;i<arr.length+1;i++) {
	int b=0;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					a++;
					b++;
					break;
				}
				
			}
			
			if(b==0) {
				a1=i;
				break;
			}
			else if(a==arr.length) {
				a1=arr.length+1;
			}
			
		}
		System.out.println(a1);
	}
	
	
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//		int arr[]= {1,2,4};
			find(arr);
		
		}
	}
