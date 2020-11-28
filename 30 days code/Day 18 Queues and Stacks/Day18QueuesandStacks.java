import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    
    private static Queue<Character> queue = new LinkedList<Character>();
    private static Stack<Character> stack = new Stack<Character>();
    
    private static char popCharacter() {
       return stack.pop();
    }

    private static char dequeueCharacter() {
        return queue.remove();
    }


    private static void pushCharacter(char ch) {
        queue.add(ch);
    }

    private static void enqueueCharacter(char ch) {
        stack.push(ch);
    }

    public static void main(String[] args) {