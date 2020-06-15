package countBinaryImplementation;

import java.util.Scanner;

public class countBinary {


	public static void main(String args[]){
        System.out.println("Enter the length");
        Scanner in = new Scanner(System.in);
        int len = Integer.parseInt(in.next());
        int temp = countStringBinary(len);
        
        if(temp ==1)
            System.out.println("Please enter valid length");
        else
            System.out.println("The number of binary strings of length "+len+" that do not have two consecutive 1x`'s : "+countStringBinary(len));
    }
    
    public static int countStringBinary(int n){
        int val = 0;
        if(n ==0)
            return 1;
        if(n ==1)
            return 2;
        else if(n > 1)
            val = countStringBinary(n-1)+countStringBinary(n-2);
        return val;                
    }

}
