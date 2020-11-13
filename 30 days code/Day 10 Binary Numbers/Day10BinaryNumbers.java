import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    private static void MySolution(int n) {
        String bin = Integer.toBinaryString(n);
        int maxIs = 0;

        for (int i = 0; i < bin.length(); i++) {
            int localIs = 0;
            for (int j = i; j < bin.length(); j++) {
                if(bin.charAt(j) == '0')
                    break;
                else {
                    localIs+=1;
                    if(localIs > maxIs){
                        maxIs = localIs;
                    }
                }
            }
        }
        System.out.print(maxIs);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        
        MySolution(n);
    }
}
