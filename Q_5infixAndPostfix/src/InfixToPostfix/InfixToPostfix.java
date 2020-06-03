package InfixToPostfix;

import java.util.Arrays;

public class InfixToPostfix {
	 private static int top = -1;
	    private static String stack[]  = new String[20];
	    
	    public static void main(String[] args) {
	        // TODO code application logic here
	        String infixExpression = " ( 4 + 8 ) * ( 6 - 5 ) / ( ( 3 - 2 ) * ( 2 + 2 ) )";
	        
	        
	        String array[] = infixExpression.split(" ");
	        String postfixExpression = "";
	        
	        System.out.println(Arrays.toString(array));
	        
	        
	        
	        for(int i = 0; i < array.length; i++){
	            if(!isOperator(array[i]) && !isClosingParenthesis(array[i]) && !isOpeningParenthesis(array[i])){
	             postfixExpression = postfixExpression+array[i];
	            }
	            
	            else if(isOperator(array[i])){
	                
	                if(isEmpty()){
	                    push(array[i]);    
	                }
	                else if(isOpeningParenthesis(stack[top])){
	                    push(array[i]);
	                }
	                else if(precedence(stack[top]) >= precedence(array[i])){
	                postfixExpression = postfixExpression + pop();
	                push(array[i]); 
	               }   
	            }
	            else if(isOpeningParenthesis(array[i])){
	                push(array[i]);
	            }
	            
	            else if(isClosingParenthesis(array[i])){
	                String temp = "";
	                int c = 0;
	                temp = pop();
	                while(!isOpeningParenthesis(temp)){
	                    postfixExpression = postfixExpression + temp;
	                    temp = pop();
	                }       
	            }
	            
	        }
	        if(!isEmpty()){
	        while( top != -1)
	            postfixExpression = postfixExpression+pop();
	        }
	        System.out.println(postfixExpression);
	           
	        
	    }
	    
	    public static int precedence(String a){
	        int temp = 0;
	        switch (a){
	            case "+" :
	                //return 1;
	                temp = 1;
	            case "-" :
	                temp = 1;
	            case "*" :
	                temp = 2;
	            case "/" :
	                temp = 2; 
	            case "^" :
	                temp = 3;   
	        }
	        return temp;
	    }
	    public static boolean isEmpty(){
	        if(top == -1)
	            return true;
	        return false;
	    }
	    public static String pop(){
	        String topitem = stack[top];
	        top--;
	        return topitem;
	    }
	    public static void push(String s){
	        top++;
	        stack[top] = s;
	    }
	    public static boolean isClosingParenthesis(String s){
	        int temp = 0;
	        if(temp == s.compareTo(")"))
	            return true;
	        return false;
	    }
	    public static boolean isOpeningParenthesis(String s){
	        int temp = 0;
	        if(temp == s.compareTo("("))
	            return true;
	        return false;
	    }
	    public static boolean isOperator(String s){
	        int temp = 0;
	        if( temp == s.compareTo("+") || temp == s.compareTo("*") || temp == s.compareTo("/") || temp == s.compareTo("-") || temp == s.compareTo("^") )
	            return true;
	        return false;
	    }

}
