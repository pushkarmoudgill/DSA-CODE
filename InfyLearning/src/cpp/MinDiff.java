package cpp;

public class MinDiff {
	public static void main(String [] args) {
		int a[]={1,2,3};
		int b[]= {2,1,3};
		
		int min =Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<b.length;j++) {
				int c1=a[i];
				int c2=b[j];
				int diff=Math.abs(c1-c2);
				
				sum+=diff;
			}
		min=Math.min(min, sum);
		}
		System.out.println(min);
		
	}
}	
