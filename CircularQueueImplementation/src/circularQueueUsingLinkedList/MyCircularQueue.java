package circularQueueUsingLinkedList;

public class MyCircularQueue {

	// Structure of a Node  
	static class Node  
	{  
	    int data;  
	     Node  link;  
	} 
	    
	static class Queue  
	{  
	     Node  front,  rear;  
	} 
	    
	// Function to create Circular queue  
	static void enQueue(Queue  q, int value)  
	{  
	     Node  temp = new Node();  
	    temp .data = value;  
	    if (q .front ==  null)  
	        q .front = temp;  
	    else
	        q .rear .link = temp;  
	    
	    q .rear = temp;  
	    q .rear .link = q .front;  
	}  
	    
	// Function to delete element from Circular Queue  
	static  int deQueue(Queue  q)  
	{  
	    if (q .front ==  null)  
	    {  
	        System.out.printf ("Queue is empty");  
	        return Integer.MIN_VALUE;  
	    }  
	    
	    // If this is the last node to be deleted  
	    int value; // Value to be dequeued  
	    if (q .front == q .rear)  
	    {  
	        value = q .front .data;  
	        q .front =  null;  
	        q .rear =  null;  
	    }  
	    else  // There are more than one nodes  
	    {  
	         Node  temp = q .front;  
	        value = temp .data;  
	        q .front = q .front .link;  
	        q .rear .link= q .front;  
	    }  
	    
	    return value ;  
	}  
	    
	// Function displaying the elements of Circular Queue  
	static void displayQueue( Queue  q)  
	{  
	     Node  temp = q .front;  
	   
	    while (temp .link != q .front)  
	    {  
	        System.out.println(temp .data);  
	        temp = temp .link;  
	    }  
	    System.out.println( temp .data);  
	}  
	    
	/*  Driver of the program  */
	public static void main(String args[]) 
	{  
	    // Create a queue and initialize front and rear  
	    Queue  q = new Queue();  
	    q .front = q .rear =  null;  
	    
	    System.out.println("--------------------Enqueue all the input data--------------------");
	    // Inserting elements in Circular Queue  
	    enQueue(q, 21);  
	    enQueue(q, 18);  
	    enQueue(q, 38);  
	    enQueue(q, 3);  
	    enQueue(q, 9);  
	    enQueue(q, 82);  
	    enQueue(q, 10);  
	    enQueue(q, 31); 
	    enQueue(q, 25);
	    enQueue(q, 29);
	    // Display elements present in Circular Queue  
	    displayQueue(q);  
	    System.out.println("--------------------Dequeue three elements--------------------");
	    // Deleting elements from Circular Queue  
	    System.out.println(deQueue(q));  
	    System.out.println(deQueue(q));  
	    System.out.println(deQueue(q)); 
	    System.out.println("--------------------Circular queue after the dequeue of three elements--------------------");
	    displayQueue(q); 
	    // Remaining elements in Circular Queue  

	    
	    
	    enQueue(q, 56);  
	    enQueue(q, 100);  
	    
	    System.out.println("--------------------Circular queue after the enqueue of two elements--------------------");
	    displayQueue(q); 
	   
	    System.out.println("--------------------Dequeue all the elements--------------------");
	    System.out.printf("\nDeleted value = %d", deQueue(q));  
	    System.out.printf("\nDeleted value = %d", deQueue(q));  
	    System.out.printf("\nDeleted value = %d", deQueue(q)); 
	    System.out.printf("\nDeleted value = %d", deQueue(q));  
	    System.out.printf("\nDeleted value = %d", deQueue(q));  
	    System.out.printf("\nDeleted value = %d", deQueue(q)); 
	    System.out.printf("\nDeleted value = %d", deQueue(q));  
	    System.out.printf("\nDeleted value = %d", deQueue(q));  
	    System.out.printf("\nDeleted value = %d", deQueue(q)); 
	    
	
	    
	}  
	     
	   

}
