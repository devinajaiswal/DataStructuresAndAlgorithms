package StackImplementation;

public class MyStack {

	private class SNode{
		Person data;
		SNode link;
	}
	
	SNode top;
	public MyStack() {
		// TODO Auto-generated constructor stub
		this.top=null;
	}
	
	public void push(Person data) {
		
		SNode tmp= new SNode();
		
		if (tmp == null) { 
            System.out.print("\nHeap Overflow"); 
            System.exit(0);
        }
		
		tmp.data=data;
		tmp.link=top;
		top=tmp;
		
		
		
	}
	public boolean isEmpty() {
		return top==null;
	}
	
	public Person peek() {
		if(!isEmpty()) {
			return top.data;
		}
		else
		{
		     System.out.println("Stack is empty"); 
	            return null; 
		}
			
	}
	
public Person pop() {
	if(top==null) {
		System.out.println("Stack Underflow");
	
	}
	SNode tp=top;
	top=top.link;
	return tp.data;
}
public void reverse() 
{ 
    SNode previous, current, successor; 
    current = previous = this.top; 
    current = current.link; 
    previous.link = null; 
    while (current != null) { 

        successor = current.link; 
        current.link = previous; 
        previous = current; 
        current = successor; 
    } 
    this.top = previous; 
}
	
public void display() {
	if(top == null) {
		System.out.println("Stack Underflow");
	
	}
	else {
		SNode temp=top;
		while (temp !=null) {
			System.out.println(temp.data);
			temp=temp.link;
		}
	}
	
}
	
	
	
	
}
