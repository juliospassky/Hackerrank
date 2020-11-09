import java.io.*;
import java.util.*;

public class Solution {

    private static void mySolution(String s){
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(isOdd(i))
                odd.append(s.charAt(i));                
            else
                even.append(s.charAt(i));
        }
        
        System.out.println(even.toString() + " " + odd.toString());
    }


    private static boolean isOdd(int n){
        return n % 2 == 1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = 0; i<n;i++){
            mySolution(scan.next());
        }
    }
}
