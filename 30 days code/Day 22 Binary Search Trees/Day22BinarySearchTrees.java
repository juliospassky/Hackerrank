import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	public static int getHeight(Node root){
       int heightleft = 0;
       int heightright = 0;
       
       if(root.left != null){
           heightleft += getHeight(root.left) + 1;
       }
       
       if(root.right != null){
           heightright += getHeight(root.right) + 1;
       }
       
       return heightleft > heightright ? heightleft : heightright;
    }
    
    

    public static Node insert(Node root,int data){