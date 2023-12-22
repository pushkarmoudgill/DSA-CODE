package Contest;

import java.util.Arrays;
import java.util.Scanner;

public class newMatrix {
	public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int r=sc.nextInt();
	int c=sc.nextInt();
	int[][] arr=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	int k=n*m;
int[][] temp=new int [r][c];
int row=0;int col=0;
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		temp[row][col]=arr[i][j];
		col++;
		if(col==c) {
			col=0;row++;
		}
	}
}
for(int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		System.out.print(temp[i][j]+" ");
		}
	System.out.println();
}

	
}
}