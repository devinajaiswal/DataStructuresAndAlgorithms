package QueueImplementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Test {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		List<Person> listOfPersons = new ArrayList();
		
		Scanner s= new Scanner(new File("input.txt"));
		 ArrayList<Person> persons = new ArrayList<>();
	        int cnt=0;
	        
	        while(s.hasNextLine())
	        {   
	            String line = s.nextLine();
	            line.split(",");
	            Person p;
	            p = new Person(Integer.parseInt((line.split(",")[0])),line.split(",")[1],line.split(",")[2],line.split(",")[3]);
	            listOfPersons.add(p);
	             
	        }
		
		QueueUsingLinkedList q1= new QueueUsingLinkedList();
		QueueUsingLinkedList q2= new QueueUsingLinkedList();
		QueueUsingLinkedList q3= new QueueUsingLinkedList();
		//Enqueue 3 elements in the queue
		q1.enqueue(listOfPersons.get(0));
		q1.enqueue(listOfPersons.get(1));
        q1.enqueue(listOfPersons.get(2));	
        System.out.println("-----------------------------------------------------------------------");
	//Dequeue 2 elements from the queue
        q1.dequeue();
        q1.dequeue();
    //Enqueue all elements in the queue
        q2.enqueue(listOfPersons.get(0));
        q2.enqueue(listOfPersons.get(1));
        q2.enqueue(listOfPersons.get(2));
        q2.enqueue(listOfPersons.get(3));
        q2.enqueue(listOfPersons.get(4));
        
        q2.enqueue(listOfPersons.get(5));
        q2.enqueue(listOfPersons.get(6));
        q2.enqueue(listOfPersons.get(7));
        q2.enqueue(listOfPersons.get(8));
        q2.enqueue(listOfPersons.get(9));
        System.out.println("-----------------------------------------------------------------------");
      //Dequeue all the elements from the second queue
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        System.out.println("-----------------------------------------------------------------------");
        q3.enqueue(listOfPersons.get(0));
        q3.enqueue(listOfPersons.get(1));
        q3.enqueue(listOfPersons.get(2));
        q3.enqueue(listOfPersons.get(3));
        q3.enqueue(listOfPersons.get(4));
        
        q3.enqueue(listOfPersons.get(5));
        q3.enqueue(listOfPersons.get(6));
        q3.enqueue(listOfPersons.get(7));
        q3.enqueue(listOfPersons.get(8));
        q3.enqueue(listOfPersons.get(9));
        System.out.println("-----------------------------------------------------------------------");
       //Reverse order of queue
        
        q3.reverseQueue();
        System.out.println("-----------------------------------------------------------------------");
        //Displaying queue
        System.out.println("-----------------Displaying Queue 1------------------");
        q1.display();
	
        

      
        
	}

}
