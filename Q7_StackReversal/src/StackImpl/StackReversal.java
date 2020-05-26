package StackImpl;

import java.util.Stack;

public class StackReversal {

	
	String array[]= new String [6];
	int top;
	public StackReversal() {
		// TODO Auto-generated constructor stub
		top=-1;
	}
	
	public void push(String s) {
		if(top>=5) 
			System.out.println("Stack Overflow");
		else
			array[++top]=s;
		System.out.println("String \""+s+"\" pushed into the stack");
		
		
	}
	
	public String pop() {
	 if(top<0) 
		 return "Stack Underflow";
		 else
		 {
		    String words=array[top--];
		    return words;
		    
		 }
	 
	}
	
	public boolean isEmpty() {
		
		return (top<0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackReversal stack = new StackReversal();
        StackReversal tempStack = new StackReversal();
        String sentence = "It was the best of time";
        String stringArray[] = sentence.split("\\s");
       
        
        System.out.println("------------------------------Pushing words into the Stack--------------------------------------");
        for(int i=0;i<stringArray.length;i++){
        	stack.push(stringArray[i]);
            }
        
        System.out.println("------------------------------Pushing words into temporary Stack--------------------------------");
        while(!stack.isEmpty()){
            String words =  stack.pop();
            tempStack.push(words);
                      
            }
        
        System.out.println("------------------------------Popping words in the same order-----------------------------------");
        while(!tempStack.isEmpty()){ 
            String f = (String) tempStack.pop();
            System.out.println(f);

        }       
    
    
		
	}

}
