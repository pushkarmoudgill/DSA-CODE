package cpp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result1 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code 
    int add=0;
    int minus=0;
    int zero=0;
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)>0){
            add++;
        }
        else if(arr.get(i)<0){
            minus++;
        }
        else if(arr.get(i)==0){
            zero++;
        }
    }
    float n1=add/arr.size();
    float n2=minus/arr.size();
    float n3=zero/arr.size();
System.out.println(n1);
System.out.println(n2);
System.out.println(n3);

    }

}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result1.plusMinus(arr);

        bufferedReader.close();
    }
}

