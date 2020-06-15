package TowerOfHanoi;

import java.util.Arrays;

public class TowerOfHanoiUsingStack {

	 int[] stack = new int[5];
		int top = -1;
		int popnum = 0;
		public void push(int number)
		{
			top++;
			stack[top] = number;
		}
		public int pop()
		{
			if(isEmpty()) 
			{
				System.out.println("Stack is empty. Cannot pop elements");
			}
			else 
			{
				popnum= stack[top];
				top--;
			}
			return popnum;
		}
		public void display()
		{
	        	System.out.println(Arrays.toString(stack));
		}
		public boolean isEmpty()
		{
			return (top == -1);
		}
		public boolean isFull()
		{
			return (top == 4);
		}
		public int peek()
		{
			return stack[top-1];
		}
	
}
