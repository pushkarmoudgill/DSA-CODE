package cpp;

import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
  public static void main(String[] args) {

   // System.out.println("Hello World");
   
   Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr =new int[n];
for(int i=0;i<n;i++ ){
  arr[i]=sc.nextInt();
}
//System.out.println(Arrays.toString(arr));
for(int i=0;i<n;i++){
  int num=arr[i];
  arr[i]=Math.abs(num*num);
}
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)
        .replace("[", "")
        .replace("]", "")
        .replace(",", " "));

  }
}