import java.io.*;
import java.util.*;

public class Solution {

    private static void validatePrimeNumbers(int n){
        if(isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not prime"); 
    }
    
    private static boolean isPrime(int n){
        if(n < 2)
            return false;        
 
        for(int i = 2; i < n/2 + 1; i++)
            if(n % i == 0)                
                return false;
                        
        return true;
    }
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
                
        for(int i = 0; i < n; i ++){
            validatePrimeNumbers(scan.nextInt());           
        }
    }
}