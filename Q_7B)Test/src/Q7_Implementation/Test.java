package Q7_Implementation;

import java.io.*;
class Test {
   

   public static void main(String[] args)
   {
   
        
       String message= "Welcome Students to Class";
      double sum=0;
       for(int i=0;i<message.length();i++)
       {
           char a = message.charAt(i);
           int b =(int) a;
           sum=(double)sum+(b*Math.pow(31,message.length()-1-i));
       }

       System.out.print(sum);
   }

}
