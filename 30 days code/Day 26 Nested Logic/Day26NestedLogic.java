import java.io.*;
import java.util.*;

public class Solution {
    
    private static int Mysolution(int day, int month, int year,
    int dayExpected, int monthExpected, int yearExpected)
    {        
        if(year < yearExpected)  
            return 0; 
            
        if(year > yearExpected)   
            return 10000;
            
        if(month > monthExpected)
            return 500 * (month - monthExpected);
            
        if(day > dayExpected)
            return 15 * (day - dayExpected);
            
        return 0;  
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();

        int dayExpected = scan.nextInt();
        int monthExpected = scan.nextInt();
        int yearExpected = scan.nextInt();
        
        int fine = Mysolution(day, month, year, dayExpected, monthExpected, yearExpected);
        
         System.out.println(fine);
    }
}
