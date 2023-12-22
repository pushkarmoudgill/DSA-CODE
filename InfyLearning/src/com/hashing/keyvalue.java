package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class keyvalue {
	public static void main(String[] args)
    {
        int A[] = { 7, 5, 3, 6, 9, 2,9 };
        //int n = 8;
      //  printpairs(A, n);
       // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int i=0;i<A.length;i++) {
//        	if(map.containsKey(A[i])) {
//        		map.put(A[i],map.get(A[i])+1);
//        	}else {
        	List<Integer> list=new ArrayList<>();
        	list.add(1);
        	map.put(A[i],list);
//        	}
        }
       map.get(9).add(10);
       System.out.println(map.get(9));
        for (Entry<Integer, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
          }
        
    }
}



