import java.io.*;
import java.util.*;

public class Solution {
    
    private static String queue = "";
    private static String stack = "";
    
    private static char popCharacter() {
        char popedChar = stack.charAt(stack.length() - 1);
        stack = stack.substring(0, stack.length()-1);
        return popedChar;
    }

    private static char dequeueCharacter() {
        char dequeuedChar = queue.charAt(0);
        queue = queue.substring(1, queue.length());
        return dequeuedChar;
    }


    private static void pushCharacter(char ch) {
        queue += ch;
    }

    private static void enqueueCharacter(char ch) {
        stack += ch;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}