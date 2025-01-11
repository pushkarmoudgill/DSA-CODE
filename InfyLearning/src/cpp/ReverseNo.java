package cpp;

public class ReverseNo {
	public static void main(String [] args) {
		int n=371;
		int sum=0;
		while(n>0) {
			
			int r=n%10;
			 sum =(int) (sum+Math.pow(r, 3));
			 
			 n/=10;
			
		}
		
		System.out.println(sum);
	}

}
