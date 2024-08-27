package cpp;

import java.util.Arrays;

public class SortZeroOneTwo {
	public static void main(String [] args) {
		int nums[]= {2,0,2,1,1,0};
		
		//solve without using two pointer
		
		int [] arr=new int [3];


        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[0]++;

            }
            if(nums[i]==1){
                arr[1]++;
                
            }
            if(nums[i]==2){
                arr[2]++;
                
            }
        }
    
  int start=0;
    for(int i=0;i<3;i++){
        int num=arr[i];


        
        for(int j=start;j<start+num;j++){
                nums[j]=i;
            
        }
        start=start+num;

    }
System.out.print(Arrays.toString(nums));
	}

}
