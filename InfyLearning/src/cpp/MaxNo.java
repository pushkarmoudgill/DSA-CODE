package cpp;

public class MaxNo {
public static void main(String[] args) {
	int arr[]= {11,2,7,3,4};
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		int temp=arr[i];
		max=Math.max(max, temp);
	}
	System.out.println(max);
}
}
