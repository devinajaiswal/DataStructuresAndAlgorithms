package StackImplementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub


		
		Scanner s= new Scanner(new File("input.txt"));
		 List<Person> personList = new ArrayList<>();
	   
	        
	        while(s.hasNextLine())
	        {   
	            String line = s.nextLine();
	            line.split(",");
	            Person p;
	            p = new Person(Integer.parseInt((line.split(",")[0])),line.split(",")[1],line.split(",")[2],line.split(",")[3]);
	            personList.add(p);
	             
	        }
		
	//System.out.println(personList);  
	
	        
	        MyStack stack1= new MyStack();
	        MyStack stack2 = new MyStack();
	        MyStack stack3= new MyStack();
	        
	        
	System.out.println("---------------------Pushing 5 elements into the stack1----------------------");
	
	for (int i=0;i<=4;i++) {
		Person data= personList.get(i);
		stack1.push(data);
		
	}
	stack1.display();
	System.out.println("---------------------Popping 4 elements from the stack1----------------------");
	stack1.pop();
	stack1.pop();
	stack1.pop();
	stack1.pop();
	
	stack1.display();
	
    
System.out.println("---------------------Pushing all the elements into the stack2----------------------");

for (int i=0;i<=9;i++) {
	Person data= personList.get(i);
	stack2.push(data);
}

stack2.display();



System.out.println("---------------------Popping all the elements from the stack2----------------------");
	stack2.pop();
	stack2.pop();
	stack2.pop();
	stack2.pop();
	stack2.pop();
	stack2.pop();
	stack2.pop();
	stack2.pop();
	stack2.pop();
	stack2.pop();
	
	stack2.display();

	System.out.println("---------------------Pushing all the elements into the stack3----------------------");

	for (int i=0;i<=9;i++) {
		Person data= personList.get(i);
		stack3.push(data);
//		System.out.println("Hey");
	}

	stack3.display();
	
	System.out.println("---------------------Reversing stack3----------------------");
	stack3.reverse();
	stack3.display();
	}

	
	
}
