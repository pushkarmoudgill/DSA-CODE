package com.hashing;

import java.io.*;
import java.util.HashSet;
 
class Test {
    static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
 
            // checking for condition
            if (s.contains(temp)) {
                System.out.println(" ");
                return;
            }
            s.add(arr[i]);
        }
        System.out.println("No");
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int A[] = { 7, 5, 3, 6, 9, 2,9 };
        int n = 8;
        printpairs(A, n);
    }
}