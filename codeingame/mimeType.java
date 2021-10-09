import java.util.*;
import java.io.*;
import java.math.*;
import java.util.HashMap;
import java.util.Map;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        Map<String, String> mimeType = new HashMap<>();

        for (int i = 0; i < N; i++)
            mimeType.put(in.next().toLowerCase(),in.next());

        in.nextLine();

        for (int i = 0; i < Q; i++) {
          
           String fileName = in.nextLine().toLowerCase();
           String[] parts = fileName.split("\\.");

           String fName = mimeType.get(parts.length > 0 ? parts[parts.length -1] : "");

           if(parts.length > 1)    
               System.out.println((fName == null || fileName.endsWith(".")) ? "UNKNOWN" : fName);
            else 
              System.out.println("UNKNOWN");
              
        }
    }
}