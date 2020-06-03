package HuffmanCoding;
import java.util.PriorityQueue; 
import java.util.Scanner; 
import java.util.Comparator;
import java.util.Map; 
import java.util.*;

class Huffman { 
	  
	 public static class Node implements Comparable<Node> { 
	        char character; 
	        int frequency; 
	        Node left; 
	        Node right; 
	        
	        @Override
	        public int compareTo(Node t) {
	            return this.frequency - t.frequency;
	        }
	    }
	    
	    public static void printCode(Node root, String sent){ 
	        if (root.left == null && root.right == null) { 
	            System.out.println(root.character + ":" + sent); 
	            return; 
	        } 
	        printCode(root.left, sent + "0"); 
	        printCode(root.right, sent + "1");   
	    
	    }
	    
	    public static void main(String[] args){
	        String input = "There are sunny days, rainy days, and windy days";
	        int temp = 0;
	        char[] arr = input.toCharArray();
	        PriorityQueue<Node> q = new PriorityQueue<Node>(arr.length);
	        HashMap<Character,Integer> huffman = new HashMap<>();
	        System.out.println(arr);
	        for (char c : arr) { 
	            if(!huffman.containsKey(c))
	                huffman.put(c,1);
	            else{
	                temp = huffman.get(c);
	                huffman.replace(c, temp+1);
	            }      
	        }
	        for(char c: huffman.keySet()){
	            Node n = new Node();
	            n.character = c;
	            n.frequency = huffman.get(c);
	            n.left = null;
	            n.right = null;
	            q.add(n);
	        }
	    
	        Node root = new Node();
	        
	        while(q.size() > 1){
	            Node min1 = q.peek();
	            q.poll();
	            Node min2 = q.peek();
	            q.poll();
	            Node tempnode = new Node();
	            tempnode.frequency = min1.frequency+min2.frequency;
	            tempnode.left = min1;
	            tempnode.right = min2;
	            root = tempnode;
	            q.add(tempnode);
	        }
	        
	        printCode(root,"");
	    }
	 
}
