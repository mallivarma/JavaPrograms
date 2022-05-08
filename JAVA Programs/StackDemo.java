package com.pailee.practice.p1;


class Stack{
	
	
	int [] stack = new int[5];///Fixed length
	
	int data=0;
	
	void push(int value) {
		
		stack[data] = value;
		data++;
		
	}
	void show() {
		
		for(int i:stack) {
			System.out.println(i);
		}
	}
	
	void pop() {	
		data--;
		stack[data]= 0;
	}
	
}

class DStack{
	
	int capacity = 2;
	
	int [] stack = new int[capacity];//Dynamic
	
	int data=0;
	
	void push(int value) {
		
		if(data==capacity)
			expand();
			
		stack[data] = value;
		data++;
		
	}
	private void expand() {
		int length = data;
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity = capacity*2;
		
	}
	void show() {
		
		for(int i:stack) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
	
	void pop() {	
		data--;
		stack[data]= 0;
		shrink();
	}
	private void shrink() {
		
		int length = data;
		if(length<=(capacity/2)/2)//half and 3/4
			capacity = capacity/2;
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
	}
	
}


public class StackDemo {
	
	public static void main(String[] args) {
		
		DStack s = new DStack();
		s.push(10);
		s.push(11);
		s.push(13);
		s.push(14);
		s.push(15);
		s.show();
		s.pop();
		s.show();
		
	}

}
