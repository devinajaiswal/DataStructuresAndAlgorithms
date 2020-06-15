package FibonacciSequence;

public class FibonacciUsingIterativeMethod {
	public static void main(String [] args){
        int number = 5;
        int fiboSeries[] = new int[number+1];
        
        for(int i = 0 ; i <= number ; i++){
            if (i < 2){
                fiboSeries[i] = i;
            }
            else{
            fiboSeries[i] = fiboSeries[i-1]+ fiboSeries[i-2];
            }
            
        }
        System.out.println("Fibonacci series for input "+number+" is ");
        for(int i = 0 ; i <=number ; ++i){
            System.out.print(fiboSeries[i]+" ");
        }
        System.out.println();
        System.out.println("Value of fibo("+number+") is: "+(fiboSeries[number-1]+fiboSeries[number-2])); 
    }
}
