package circularqueue;

public class CircularQueue {

	int front;
	int rear;
	int maxsize;
	int []queue;
	int count=0;
	public CircularQueue(int size)
	{
		this.maxsize=size;
		this.rear=-1;
		this.front=0;
		this.queue=new int[maxsize];
	}
	
	public void enque(int data) {
		if(count==maxsize)
		{
			System.out.println("Queue is full cannot proced");
			return;
		}
		
		rear=(rear+1)%maxsize;
		queue[rear]=data;
		count++;
		
	}
	
	public int deque() 
	{
		if(count==0) 
		{
			System.out.println("empty");
		}
		int data=queue[front];
		front=(front+1)%maxsize;
		count--;
		return data;
	}
	public int peek()
	{
		return queue[front];
	}
	public static void main(String[] args) {
		
		CircularQueue q= new CircularQueue(5);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		

		System.out.println("Removed :"+q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		q.enque(70);
		
		//q.enque(50);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		System.out.println(q.peek());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
	}

}
