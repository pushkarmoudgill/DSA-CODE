package cpp;

public class test1 {
	public static void main(String [] args) {
		String s="123";
		int i=Integer.parseInt(s);
		//System.out.println(s);
		//System.out.println(i);
		int k=0;
		//System.out.println(k+s.charAt(0));
		int n1=123;
		int a=0;
		int b=0;
		while(n1>9) {
		while(n1!=0){
		    int rem=n1%10;
		    a+=rem;
		    n1=n1/10;
		}
		//a=0;
		n1=a;
		a=0;
		 n1=n1*3;
		}
		//int b=n1*3;
		System.out.println(n1);
	}

}
