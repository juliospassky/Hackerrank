import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int swaps = 0;
        int aux = 0;
        // Write Your Code Here
        for(int i = 0; i< n; i++){
            for(int j = i; j< n; j++){                
                if(a[i] > a[j]){
                    swaps++;
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;                    
                }
            }    
        }
        System.out.println("Array is sorted in "+ swaps +" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);


    }
}