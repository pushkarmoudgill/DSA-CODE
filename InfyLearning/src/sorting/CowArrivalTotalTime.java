package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CowArrivalTotalTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n=2;
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		Arrays.sort(arr, (a,b)->a[0]-b[0]);
		
		
	int currTime=0;
	for(int i=0;i<m;i++) {
		if(arr[i][0]>currTime) {
			currTime=0;
			currTime=currTime+arr[i][0]+arr[i][1];
		}
		else {
			currTime=currTime+arr[i][1];
		}
		
	}
	System.out.println(currTime);
}
}