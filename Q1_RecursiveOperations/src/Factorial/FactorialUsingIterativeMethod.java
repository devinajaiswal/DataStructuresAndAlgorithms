package Factorial;

public class FactorialUsingIterativeMethod {
	
	static int factorial(int n) {
		int res=1;
		
		for(int i=2;i<=n;i++) {
			res=res*i;
		
		}
		return res;
	}
	
	
	public static void main(String[] args){
;
    int number=5;
        System.out.print("Factorial of "+number+ " is : "+ factorial(number));
    }
    



}
