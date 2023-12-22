package Contest;

import java.util.Scanner;
import java.util.Stack;

public class FindTriangle {
	public static void solve(long[] arr,int n) {
		 int[] lmax=new int [n];
		 int[] rmax=new int [n];
		 
			Stack<Integer> stack =new Stack<Integer>();
lmax[0]=0;
stack.add(0);
for(int i=1;i<arr.length;i++) {
	while(!stack.isEmpty()&&arr[i]>=arr[stack.peek()]) {
		stack.pop();
	}
	if(!stack.isEmpty()) {
		lmax[i]=stack.peek()+1;
	}
	else {
		lmax[i]=0;
	}
	stack.add(i);
}

Stack<Integer> stack1 =new Stack<Integer>();
rmax[n-1]=n-1;
stack1.add(n-1);
for(int i=arr.length-2;i>=0;i--) {
while(!stack1.isEmpty()&&arr[i]>arr[stack1.peek()]) {
stack1.pop();
}
if(!stack1.isEmpty()) {
rmax[i]=stack1.peek()-1;
}
else {
rmax[i]=n-1;
}
stack1.add(i);
}
int[] lmin=new int [n];
int[] rmin=new int [n];
Stack<Integer> stack2 =new Stack<Integer>();
rmin[n-1]=n-1;
stack2.add(n-1);
for(int i=arr.length-2;i>=0;i--) {
while(!stack2.isEmpty()&&arr[i]<arr[stack2.peek()]) {
stack2.pop();
}
if(!stack2.isEmpty()) {
rmin[i]=stack2.peek()-1;
}
else {
rmin[i]=n-1;
}
stack2.add(i);
}

Stack<Integer> stack3 =new Stack<Integer>();
lmin[0]=0;
stack3.add(0);
for(int i=1;i<arr.length;i++) {
	while(!stack3.isEmpty()&&arr[i]<=arr[stack3.peek()]) {
		stack3.pop();
	}
	if(!stack3.isEmpty()) {
		lmin[i]=stack3.peek()+1;
	}
	else {
		lmin[i]=0;
	}
	stack3.add(i);
}

//System.out.println(Arrays.toString(lmin));
int ans=0;
for(int i=0;i<n;i++) {
	ans+=arr[i]*(((i-lmax[i]+1)*(rmax[i]-i+1))-((i-lmin[i]+1)*(rmin[i]-i+1)));
}
System.out.println(ans);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	
	int n=sc.nextInt();
	long[] arr=new long [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextLong();
	}
	solve(arr,n);
}
}
