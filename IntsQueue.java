//**********************************************************************
// File Name: IntsQueue.java	Author: Nadya Pena
// Purpose: 
//	This class defines the methods of a queue:
//		1) Enqueue method, which alerts when the queue is full
//		2) Dequeue method, which alerts when the queue is empty
//		3) Check for an empty queue
//		4) Check for a full queue
//	****5) Additional getter method for testing with QueueDriver*****
//**********************************************************************

public class IntsQueue{

	private int count = 0, front = -1, rear = -1;
	private int[] queue;
	private int size2;
	private int i;

	

	//Constructor to create a new empty queue
	public IntsQueue(int size)
	{
		size2 = size;
		queue = new int[size];
	}

	//Enqueue method, prints message if queue is full
	public void enqueue(int i) 
	{
		if(! isFull())
		{
			if (rear + 1 != size2)
			{
				rear = (rear+1) % queue.length;
				queue[rear] = i;
			}
			else
			{
				rear = -1;
				queue[rear+1] = i;
			}
		 	
		 	if(count == 0)
		 	{
		 		front = (front+1) % queue.length;
			}
			count++;
		}
		else 
		{
			System.out.println("Queue is full");
		}
	}

	//Dequeue method, prints message if queue is empty
	public int dequeue()
	{
		if (isEmpty()) 
		{
			System.out.println("Queue is empty");
			return -3200; //for now, this is a flag. Also, function must return int
						  //may be confused with dequeueing -3200 from queue
		}
		else
		{
			int value = queue[front];
			front = (front+1) % queue.length;
			count--;
			return value;
		}
	}

	//Checks if queue is empty
	public boolean isEmpty()
	{
		if (count == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	//Check if queue is full
	public boolean isFull()
	{
		if(count == size2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int getRear()
	{
		return rear;
	}
}