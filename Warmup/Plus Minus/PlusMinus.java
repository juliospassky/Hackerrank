import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int count = arr.length;
        
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        
        for (int i = 0; i < count; i++){
            if(arr[i] > 0)
                positive += 1;
            else if(arr[i] < 0)
                negative += 1;
            else
                zeros += 1;            
        }
        
        System.out.println(String.format("%.6f", (float)positive/count));    
        System.out.println(String.format("%.6f", (float)negative/count));
        System.out.println(String.format("%.6f", (float)zeros/count));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
