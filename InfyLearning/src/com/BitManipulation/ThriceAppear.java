package com.BitManipulation;

import java.util.HashMap;
import java.util.Map;

public class ThriceAppear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int arr[]= {2,2,2,4};
              
              HashMap<Integer, Integer> hashMap = new HashMap<>();
              
              
              
              for(int i=0;i<arr.length;i++) {
            	  if (hashMap.containsKey(arr[i])) {
            		  hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
                  } else {
                	  hashMap.put(arr[i], 1);
                  }
              }
              
              
              for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                  Integer key = entry.getKey();
                  Integer value = entry.getValue();
                  
                  if (value!=3) {
                      System.out.println("Key: " + key + ", Value: " + value);

                  }
//                  System.out.println("Key: " + key + ", Value: " + value);
              }
	}

}
