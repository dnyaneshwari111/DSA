//package queue;
//
//public class Queue {
//	
//	private int front;
//	private int rear;
//	int[]queue;
//	private int maxSize;
//	
//	public Queue(int size)
//	{
//		this.maxSize=size;
//		this.front=0;
//		this.rear=-1;
//		this.queue=new int[maxSize];
//	}
//	
//	public void enque(int data)
//	{
//		if(rear==maxSize-1) 
//		{
//			System.out.println("Queue full cannot process anymore");
//			return;
//		}
//		rear=rear+1;
//		queue[rear]=data;
//	}
//	
//	public int peek()
//	{
//		return queue[front];
//	}
//
//	
//	public int deque() 
//	{
//		if(front>rear)
//		{
//			System.out.println("Queue is empty");
//			return -1;
//		}
//		
//		int data=queue[front];
//		front++;
//		return data;
//	}
//		
//
//	public static void main(String[] args)
//	{
//		Queue queue=new Queue(5);
//		
//		queue.enque(10);
//		queue.enque(20);
//		queue.enque(30);
//		queue.enque(40);
//		queue.enque(50);
//		
//		System.out.print("Added : ");
//		System.out.println(queue.deque());
//		System.out.print("Added : ");
//		System.out.println(queue.deque());
//		System.out.println("Front element :"+queue.peek());
//		System.out.print("Added : ");
//		System.out.println(queue.deque());
//		System.out.print("Added : ");
//		System.out.println(queue.deque());
//		System.out.print("Added : ");
//		System.out.println(queue.deque());
//		queue.enque(80);
//		System.out.println(queue.deque());
//		
//	}
//
//}
