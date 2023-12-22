package cpp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
     static int R=5;
     static int C=5;

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
     if (R < 3 || C < 3){
        System.out.println("Not possible");
        System.exit(0);
    }
     System.out.println(arr.size());
 
    // Here loop runs (R-2)*(C-2)
    // times considering different
    // top left cells of hour glasses.
    int max_sum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.size()-2; i++)
    {
        for (int j = 0; j <arr.get(i).size()-2; j++)
        {
            // Considering mat[i][j] as top
            // left cell of hour glass.
            int sum=0;
             sum = arr.get(i).get(j) + arr.get(i).get(j + 1) +
                       arr.get(i).get(j + 2)
                       +arr.get(i + 1).get(j + 1)+
                      arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1)+arr.get(i + 2).get(j + 2);
 
            // If previous sum is less than
            // current sum then update
            // new sum in max_sum
            max_sum = Math.max(max_sum, sum);
        }
    }
    return max_sum;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
