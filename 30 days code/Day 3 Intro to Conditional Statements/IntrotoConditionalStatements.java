import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    private static String mySolution(int n){
        if (isOdd(n))
            return "Weird";   
        if(n > 1 && n <6)
            return "Not Weird";    
        if(n > 5 && n < 21)
            return "Weird";
        return "Not Weird";
    }
    
    private static boolean isOdd(int n){
        int count = 0;
        for (int i = 1; i < n/2 + 1; i++){
            if(n % i == 0){
                count++;
                if(count > 1)
                    return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        System.out.print(mySolution(N));
    }
}
