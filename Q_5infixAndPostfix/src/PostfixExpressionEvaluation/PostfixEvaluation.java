package PostfixExpressionEvaluation;

public class PostfixEvaluation {
   
	 int top = -1;
	    double val;
	    double a , b;
	    String evaluateStack[];
	    String stack[];
	    public double PostfixEvaluation_Impl(String exp){
	        evaluateStack = exp.split("\\s");
	        stack = new String[evaluateStack.length];
	        for (int i = 0 ; i < evaluateStack.length;i++ ){
	            if(isOperator(evaluateStack[i])){
	                
	                a = Double.parseDouble(pop());
	                b = Double.parseDouble(pop());
	             
	                switch(evaluateStack[i]){
	                    case "*":
	                        push(String.valueOf(b*a));
	                        break;
	                    case "/":
	                        push(String.valueOf(b/a));
	                        break;
	                    case "+":
	                        push(String.valueOf(b+a));
	                        break;
	                    case "-":
	                        push(String.valueOf(b-a));
	                        break;
	                }
	            }
	            else{
	             
	                push(evaluateStack[i]);  
	            }    
	                        
	        }
	        val = Double.parseDouble(pop());
	        return val;
	    } 
	    
	    public boolean isOperator(String sym){
	        int temp = 0;
	        if(temp == sym.compareTo("^")  || temp == sym.compareTo("*") || temp == sym.compareTo("/") || temp == sym.compareTo("+") || temp == sym.compareTo("-"))
	            return true;
	        return false;    
	    }
	    
	    public void push(String x){
	        top++;
	        stack[top] = x;  
	        
	    }
	    
	    public String pop(){
	        String y = stack[top];
	        top--;
	        return y;
	    }
	    
	    public boolean isEmpty(){
	       // return (top == -1); 
	       if(top == -1){
	         return true;
	     }
	     return false; 
	    }
	     
	    
	}


