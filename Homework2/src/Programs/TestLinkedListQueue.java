package Programs;

public class TestLinkedListQueue {
   
	

    private class node{
        int data;
        node next;
        
    }
    
    node front = null;
    node rear = null;
    int size = 0;
    
    public void enqueue(int a){
        node temp = new node();
        temp.data = a;
        temp.next = null;
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
        System.out.println("Node with data "+a+" has been enqueued");
    }
    
    public boolean isEmpty(){
        if(size == 0)
            return true;
        else
            return false;
    }
    
    public void dequeue(){
         if(isEmpty()){
             System.out.println("Queue is empty");
             return;
         }
         node old = front;
         front = front.next;
         size--;
         System.out.println("Node with data "+old.data+" has been dequeued");
         
    }
    
    public void display(){
        node display = front;
        System.out.println("Queue is displayed below: ");
        
       while(display != null){
           System.out.println(display.data);
           display = display.next;
       }
       if(isEmpty())
           System.out.println("Queue is empty");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
    	TestLinkedListQueue queue  = new TestLinkedListQueue();
        
    	queue.enqueue(5);
    	queue.enqueue(1);
    	queue.display();
    	queue.dequeue();
    	queue.enqueue(90);
    	queue.display();
    	queue.dequeue();
    	queue.dequeue();
    	queue.display();
    	queue.enqueue(20);
    	queue.display();
    }
	
}
