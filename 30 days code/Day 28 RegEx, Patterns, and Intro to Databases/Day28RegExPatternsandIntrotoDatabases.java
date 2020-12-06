import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        List<String> userlist = new ArrayList<String>();
        
        while( i-- >0 ){
            String name = scan.next();
            String email = scan.next();
                       
            boolean isnamelength = Pattern.matches("\\w{1,20}", name);
            boolean isname = Pattern.matches("^[a-z]*$", name);            
                        
            boolean ismaillength = Pattern.matches("\\D{1,50}", email);
            boolean isgmail = email.endsWith("@gmail.com");
            
            if(isnamelength && isname && ismaillength && isgmail){
                userlist.add(name);
            }
        }
        
        String[] arr = userlist.toArray(new String[userlist.size()]);
        Arrays.sort(arr);
        for(int j = 0 ; j<userlist.size(); j++){
            System.out.println(arr[j]);
        }
    }
}
