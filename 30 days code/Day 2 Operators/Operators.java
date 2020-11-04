import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = tip(meal_cost, tip_percent);
        double tax = tax(meal_cost, tax_percent);
        long totalCost = totalCost(meal_cost, tip, tax);
        System.out.print(totalCost);
    }
    
    private static double tip(double meal_cost, int tip_percent){
        return meal_cost * tip_percent / 100;
    }
    
    private static double tax(double meal_cost, int tax_percent){
        return meal_cost * tax_percent / 100;
    }
    
    private static long totalCost(double meal_cost, double tip, double tax){
        return Math.round(meal_cost + tip + tax);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
