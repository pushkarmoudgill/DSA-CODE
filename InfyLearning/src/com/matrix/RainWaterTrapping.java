package com.matrix;

import java .util.*;
public class RainWaterTrapping{
    public static int traprainwater(int height[]){
        int n = height.length;
        //calculate leftmaxboundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);

        }
        //calculate rightmaxboundary array
        int rightMax [] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int trapwater = 0;
        //loop
        for(int i=0;i<n;i++){
           // water level = mim(left max bound,right max bound)
           int waterlevel = Math.min(leftMax[i],rightMax[i]);
           //trapwater = waterlevel-height[i]
           trapwater += waterlevel - height[i];
        }
        return trapwater;

    }
    public static void main (String [] args){
        int height [] = {4,2,0,6,3,2,5};
        System.out.println(traprainwater(height));
    }
}
