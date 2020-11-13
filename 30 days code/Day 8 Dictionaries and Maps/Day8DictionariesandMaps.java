//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> friendsMap = new HashMap();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            friendsMap.put(name, phone);
        }
        
        while(in.hasNext()){
            String s = in.next();
            // Write code here
           System.out.println(friendsMap.containsKey(s) ? s +"="+friendsMap.get(s) : "Not found");
        }
        in.close();
    }
}