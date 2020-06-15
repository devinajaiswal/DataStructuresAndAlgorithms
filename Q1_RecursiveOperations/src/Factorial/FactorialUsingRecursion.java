package Factorial;

public class FactorialUsingRecursion {
	public static void main(String[] args){
        int n = 5;
        int result = factorial(n);
        System.out.println("The factorial of "+n+ " is : "+result);
    }
    
    public static int factorial(int n){
        int result;
        if(n == 0){
            result = 1;
            return result;
        }
        else if (n > 0){
            result = n*factorial(n-1);
            return result;
        }
        else
        	 return 0;
  
    }
}
