package Contest;

import java.util.Arrays;
import java.util.Scanner;

public class rotate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}

	int[] temp=new int[n];
	int k=0;
	for (int i = d; i < n; i++) {
        temp[k] = arr[i];
        k++;
    }
 
   
    for (int i = 0; i < d; i++) {
        temp[k] = arr[i];
        k++;
    }
 
    
    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }
    
      System.out.println(Arrays.toString(arr).replace("[", "")
		        .replace("]", "")
		        .replace(",", " "));
   
}
 
}

