package stack;

//import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Arrays;

public class StackUsingArray {

	private int top=0;
	private int maxSize;
	private int[]stack;
	
	public StackUsingArray(int size) {
		this.maxSize=size;
		stack=new int[maxSize];
		top=-1;
	}
	
	public void push(int data) 
	{
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		stack[++top]=data;
	}
		
	public void pop()
	{
		if(isEmpty()) {
			System.out.println("stack underflow");
			return;
		}
		System.out.println("Removed :"+stack[top--]);
		
	}
	
	public void peek()
	{
		if(top==-1) 
		{
			System.out.println("cannot peek stack is empty");
			return ;
		}
		System.out.println(stack[top]);
	}
	
	public boolean isFull() 
	{
		return top==maxSize;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public static void main(String[] args) {
		StackUsingArray stack= new StackUsingArray(5);
		stack.push(10);
		System.out.print("added: ");
		stack.peek();
		
		stack.push(20);
		System.out.print("added: ");
		stack.peek();
		
		stack.push(30);
		System.out.print("added: ");
		stack.peek();
		
		stack.push(40);
		System.out.print("added: ");
		stack.peek();
		
		stack.push(50);
		System.out.print("added: ");
		stack.peek();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		
		
		
		
		

	}

}
