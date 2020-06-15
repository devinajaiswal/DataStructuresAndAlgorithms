package FibonacciSequence;

public class FibonacciUsingRecursion {
	  public static void main(String [] args){
		    int num = 5;
		    System.out.println("Fibonacci of "+num+" is: "+fibo(num));
		    }
		    
		    public static int fibo(int n){
		        if( n <= 1)
		            return n;
		        else 
		            return fibo(n-1)+fibo(n-2);
		    }
}
