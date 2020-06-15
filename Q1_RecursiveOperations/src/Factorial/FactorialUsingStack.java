package Factorial;

public class FactorialUsingStack {
private static int n = 5 , factorial_result, top = -1;
    
    private static int stack[] = new int[n]; 
    
    public static void main(String[] args) {
       
        factorial_result = factorial(n);
        System.out.println("Factorial of "+n+" is: "+factorial_result);
        }
    
    public static int factorial(int num){
         
        if( num == 0 || num == 1){
            return 1;
        }
    
        else 
        return num*factorial(num-1);
        }
    
public static void push(int num){  
        
        stack[top+1] = num;
        }
}
