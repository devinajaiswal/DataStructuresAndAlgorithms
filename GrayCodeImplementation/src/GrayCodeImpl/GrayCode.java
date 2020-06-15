package GrayCodeImpl;

import java.util.ArrayList;

public class GrayCode {
	static void generateGrayCode(int n){
        if (n<=0)
            return;
        
        ArrayList<String> array = new ArrayList<String> ();
        
        //starting with 1 bit pattern
        array.add("0");
        array.add("1");
        
        int i,j;
        
        for(i=2; i< (1<<n); i = i<<1){
            //reverse list
            for (j = i-1 ; j >= 0 ; j--)  
                array.add(array.get(j)); 
            
            //appending 0 to first list
            for (j = 0 ; j < i ; j++) 
                array.set(j, "0" + array.get(j));
            
            //appending 1 to 2nd list
            for (j = i ; j < 2*i ; j++)  
                array.set(j, "1" + array.get(j));
           
        }
        //printing final array
        for (i = 0 ; i < array.size() ; i++ )  
            System.out.println(array.get(i));
    }
    
    public static void main(String[] args){
        generateGrayCode(4);
    }  
}
