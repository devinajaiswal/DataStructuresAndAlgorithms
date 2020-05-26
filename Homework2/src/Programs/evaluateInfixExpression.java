package Programs;
import java.util.Stack;
public class evaluateInfixExpression {
   
	
	 public int evaluateExressions(String expression){
	        
	        Stack<Integer> operands = new Stack<>();

	        
	        Stack<Character> operations = new Stack<>();
	        for(int i=0; i<expression.length();i++) {
	            char character = expression.charAt(i);
	           
	            if(Character.isDigit(character)){
	                
	                int num = 0;
	                while (Character.isDigit(character)) {
	                    num = num*10 + (character-'0');
	                    i++;
	                    if(i < expression.length())
	                        character = expression.charAt(i);
	                    else
	                        break;
	                }
	                i--;
	              
	                operands.push(num);
	            }else if(character=='('){
	                
	                operations.push(character);
	            }
	        
	            else if(character==')') {
	                while(operations.peek()!='('){
	                    int output = calculate(operands, operations);
	                   
	                    operands.push(output);
	                }
	                operations.pop();
	            }
	            
	            else if(isOperator(character)){
	            
	                while(!operations.isEmpty() && precedence(character)<=precedence(operations.peek())){
	                    int output = calculate(operands, operations);
	                  
	                    operands.push(output);
	                }
	               
	                operations.push(character);
	            }
	        }
	 

	        while(!operations.isEmpty()){
	            int output = calculate(operands, operations);
	     
	            operands.push(output);
	        }
	        return operands.pop();
	    }

	    static int precedence(char c){
	        switch (c){
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	            case '^':
	                return 3;
	        }
	        return -1;
	    }

	    public int calculate(Stack<Integer> numbers, Stack<Character> operations) {
	        int a = numbers.pop();
	        int b = numbers.pop();
	        char operation = operations.pop();
	        switch (operation) {
	            case '+':
	                return a + b;
	            case '-':
	                return b - a;
	            case '*':
	                return a * b;
	            case '/':
	                if (a == 0)
	                    throw new
	                            UnsupportedOperationException("Number cannot be divided by zero.");
	                return b / a;
	        }
	        return 0;
	    }

	    public boolean isOperator(char c){
	        return (c=='+'||c=='-'||c=='/'||c=='*'||c=='^');
	    }

	    public static void main(String[] args) {
	        String expression1 = "4+8*6-5/3-2*2+2";
	        String expression2 = "(1+3+((4/2)*(8*4)))";
	        String expression3 = "(4+8)*(6-5)/((3-2)*(2+2))"; 
	        String expression4 = "A*B/C+(D+E-(F*(G/H)))"; // gives an exception 
	        evaluateInfixExpression i = new evaluateInfixExpression();
	        System.out.println("4+8*6-5/3-2*2+2  =  "+i.evaluateExressions(expression1));
	        System.out.println("(1+3+((4/2)*(8*4)))  =  "+i.evaluateExressions(expression2));
	        System.out.println("(4+8)*(6-5)/((3-2)*(2+2))  = "+i.evaluateExressions(expression3));
	       
	    } 
		 
		 
		 
	 
	
}
