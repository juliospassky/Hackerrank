import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        for(int i = 1; i< n+1; i ++){
            System.out.println(createNodeStair(n, i));
        }
    }
    
    private static String createNodeStair(int n, int index){
        StringBuilder strBuilder = new StringBuilder();
        for(int i = 0; i< n; i ++){
           if(i < n - index)
               strBuilder.append(" ");
           else
               strBuilder.append("#");            
        }
        return strBuilder.toString(); 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
