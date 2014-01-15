//**********************************************************************
// File Name: QueueDriver.java	Author: Nadya Pena
// Description: 
//	This driver is meant to test the following:
//			1) The enqueue method for only one integer
//			2) The enqueue method for several integers
//			3) The enqueue method for when queue is full
//			4) The dequeue method for one integer
//			5) The dequeue method for several integers
//			6) The dequeue method for when the queue is empty
//**********************************************************************
import java.util.Arrays;

public class QueueDriver{
	
	public static void main(String[] args){

		//Declarations, size of queue and ints array is set
		int size=6; 
		int[] ints;
		ints = new int[size];

		//Constructor that creates int objects to be passed into queue
		IntsQueue queue = new IntsQueue(size);

		//Test cases 
		ints[0] = 5;
		ints[1] = 66;
		ints[2] = 32;
		ints[3]	= 1000;
		ints[4]	= 255;
		ints[5] = 9000;
		
		//1) Enqueue method for only one integer
		queue.enqueue(ints[0]);
		System.out.println("The element added to queue is: " + ints[0]);
		System.out.println("The index of rear is:" + queue.getRear());
		
		//2) Enqueue method for several integers
		for (int i=1; i<ints.length; i++)
		{
			queue.enqueue(ints[i]);
			System.out.println("The element added to queue is: " + ints[i]);
			System.out.println("The index of rear is:" + queue.getRear());
		}

		//3) Enqueue method for when queue is full
		System.out.println();
		int newElem = 788;
		queue.enqueue(newElem);
		System.out.println(newElem + " was not added to queue");
		System.out.println("The index of rear is:" + queue.getRear());

		//4) Dequeue method for one integer
		System.out.println();
		System.out.println(queue.dequeue() + " was dequeued");

		//5) Dequeue method for several integers
		System.out.println();
		for (int i=1; i<ints.length; i++)
		{
			queue.dequeue();
			System.out.println(ints[i] + " was dequeued");
			//System.out.println("The index of rear is:" + queue.getRear());
		}

		//6) Dequeue method for when queue is empty 
		queue.dequeue();
	}
}