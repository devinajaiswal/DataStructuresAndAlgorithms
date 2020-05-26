package QueueImplementation;

import java.util.Stack;

public class QueueUsingLinkedList {

	
	  public class QNode{
		 Person data;
		  QNode next; 
	  }
	  
	  QNode front=null;
	  QNode rear=null;
	  int size=0;
	  
	  public void enqueue(Person data) {
	  
	  QNode temp= new QNode();
	  temp.data=data;
	  temp.next=null;
	  if(isEmpty()){
          front = temp;
          rear = temp;
          size++;
      }
      else{
          rear.next = temp;
          rear = temp;
          size++;
      }
	  
	  System.out.println("Node with person data "+data+" has been enqueued");
	  }
	   
	  public boolean isEmpty(){
	        if(size == 0)
	            return true;
	        else
	            return false;
	    }  
	  
	    public void dequeue(){
	         if(isEmpty()){
	             System.out.println("No items in Queue");
	             return;
	         }
	         QNode old = front;
	         front = front.next;
	         size--;
	         System.out.println("Node with person data "+ old.data+" has been dequeued");
	         
	    }
	    public void display(){
	        QNode display = front;
	        System.out.println("Displaying queue");
	        
	       while(display != null){
	           System.out.println("Person data is "+display.data);
	           display = display.next;
	       }
	       if(isEmpty())
	           System.out.println("Queue is empty");
	    }
	 
	    void reverseQueue() {
	    	QNode before = null;
	    	QNode tmp = front;
	    	while (tmp != null) {
	    	    QNode next = tmp.next;
	    	    tmp.next = before;
	    	    before = tmp;
	    	    tmp = next;
	    	}
	    	front = before;
	    	
	    	while(before != null){
		           System.out.println("Person data is "+before.data);
		           before = before.next;
		       }
	    	
	    }
	 
	
}
