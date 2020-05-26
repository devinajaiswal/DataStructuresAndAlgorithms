package QueueArrayImpl;

public class QueueArrayImplementation {

	int front,rear,size;
	Person data;
	Person array[];
	int capacity;
	
	public QueueArrayImplementation(int capacity) {
		 this.capacity=capacity;
		 front=this.size=0;
		 rear=capacity-1;
		 array= new Person [this.capacity];
		 }
boolean isFull(QueueArrayImplementation queue) 
    {  return (queue.size == queue.capacity); 
    } 
 boolean isEmpty(QueueArrayImplementation queue) 
    {  return (queue.size == 0); } 
	
	 void enqueue(Person data) 
	    { 
	        if (isFull(this)) 
	            return; 
	        this.rear = (this.rear + 1)%this.capacity; 
	        this.array[this.rear] = data; 
	        this.size = this.size + 1; 
	        System.out.println(data+ " enqueued to queue"); 
	    }
	
	 void dequeue() {
		 if (isEmpty(this)) 
	            System.out.println("Queue is empty");
	           
	        Person data = this.array[this.front]; 
	        this.front = (this.front + 1)%this.capacity; 
	        this.size = this.size - 1; 
	        System.out.println("Person data with values "+data+ " has been dequeued");
		
		 
	 }
	  void front() 
	    { 
	        if (isEmpty(this)) 
	        	System.out.println("Queue is empty");
	         
	        else 
	        	System.out.println("Front is: "+this.array[this.front]);
	       
	    } 
	  void rear() 
	    { 
	        if (isEmpty(this)) 
	        	System.out.println("Queue is empty"); 
	        else
	        	System.out.println("Rear is "+this.array[this.rear]);
	  
	
	    }
	  
	  void reverseQueue() {
		  
		  System.out.println("Queue Reversal");
		  for(int i=this.rear;i>=this.front;i--) {
			 
			  System.out.println(this.array[i]);
		  }
	  }
	 
	
}
