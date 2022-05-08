package com.pailee.practice.p1;



class Queue{
	
	int size;
	int front;
	int rear;
	int queue[] = new int[5];

	public void enqueue(int data) {
		
		queue[rear] = data;
		size = size+1;
		rear = rear+1;
	}
	
	public int dequeue() {
	
		int data = queue[front];
		
		size = size-1;
		front = front+1;
		
		return data;
	}

	public void show() {
		System.out.print(" Elements :");
		for(int i=0;i<size;i++) {
			System.out.print(" "+queue[front+i] );
			
		}
	}
	
}

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.show();
		q.dequeue();
		q.show();

	}

}
