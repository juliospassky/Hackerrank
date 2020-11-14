import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static void MySolution(String[][] arr) {
        HashSet<String> myHash = new HashSet<>();
        String aux = "";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                aux = arr[i][j] + " " + arr[i][j + 1] + " " + arr[i][j + 2] + " ";
                aux += arr[i + 1][j + 1] + " ";
                aux += arr[i + 2][j] + " " + arr[i + 2][j + 1] + " " + arr[i + 2][j + 2];

                myHash.add(aux);
            }
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (String s : myHash) {
            String[] parts = s.split(" ");
            for (String part : parts) {
                sum += Integer.parseInt(part);
            }
            if (sum > max)
                max = sum;
            sum = 0;
        }
        
        System.out.print(max);
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] arr = new String[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                arr[i][j] = arrRowItems[j];
            }
        }
        scanner.close();
        
        MySolution(arr);
    }
}
