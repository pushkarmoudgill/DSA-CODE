package com.opps1;

class ArrayTest {
    
    public static int calculateSumOfEvenNumbers(int[] numbers){
        //Implement your code here and change the return value accordingly
    	int hold=0;
        for(int i=0;i<numbers.length;i++) {
        	if(numbers[i]%2==0) {
        		//int hold=0;
        		hold+=numbers[i];
        	}
        }
        return hold;
    }
    
	public static void main(String[] args) {
		int[] numbers = {68,79,86,99,23,2,41,100};
		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
	}
}