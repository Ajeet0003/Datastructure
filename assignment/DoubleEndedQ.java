package assignment;

import java.util.Scanner;

//DS Assignment 6 With menu driven approach create and test DQ.

public class DoubleEndedQ {
	private int[] array;
	private int front, rear;

	public DoubleEndedQ() {
		array = new int[10];
		front = -1;
		rear = -1;
	}

	public void enqueueToRear(int item) throws OverFlowException {
		if (rear == array.length - 1)
			throw new OverFlowException();
		front = 0;
		array[++rear] = item;
	}

	public void enqueueToFront(int item) throws OverFlowException {
		if (rear == array.length - 1)
			throw new OverFlowException();
		if (front == -1) {
			front = rear = 0;
			array[front] = item;
			return;
		}
		int temp = rear;
		for (int i = rear; i >= 0; i--)
			array[i + 1] = array[i];
		rear = temp + 1;
		front = 0;
		array[front] = item;
	}

	public int dequeueFromFront() throws UnderFlowException {
		if (front == -1)
			throw new UnderFlowException();
		else {
			int item = array[front];
			for (int i = front; i < rear; i++)
				array[i] = array[i + 1];
			rear--;
			if (rear == -1)
				front = -1;
			return item;
		}
	}

	public int dequeueFromRear() throws UnderFlowException {
		if (front == -1)
			throw new UnderFlowException();
		else {
			int item = array[rear];
			rear--;
			if (rear == -1)
				front = -1;
			return item;
		}
	}

	public void show() {
		for (int i = front; i <= rear; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		DoubleEndedQ DQ = new DoubleEndedQ();
		Scanner sc = new Scanner(System.in);
		int option=0, item;
		char ch='n';
		do {
		System.out.println( "For performing operation enter following number" );
		System.out.println("Enter 1 for insert item  from front");
		System.out.println("Enter 2 for insert item  from rear");
		System.out.println("Enter 3 for delete item  from front");
		System.out.println("Enter 4 for delete item  from rear");
		System.out.println("Enter 5 for print q");
		System.out.println("Enter 0 for exit");
		
		System.out.print( "Enter your choice: " );
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
		System.out.print( "Enter item to insert: ");
		item = sc.nextInt();
	try {
		DQ.enqueueToFront(item);
	} 
	catch (OverFlowException e) {
		System.out.println(e);
	}
	break;
	case 2:
		System.out.print( "Enter item to insert: ");
		item = sc.nextInt();
	try {
		DQ.enqueueToRear(item);
	} 
	catch (OverFlowException e) {
		System.out.println(e);
	}
	break;
	case 3:
	try {
		DQ.dequeueFromFront();
	} 
	catch (UnderFlowException e) {
		System.out.println(e);
	}
	break;
	case 4:
	try {
		DQ.dequeueFromRear();
	} 
	catch (UnderFlowException e) {
		System.out.println(e);
	}
	break;
	case 5:
		DQ.show();
	break;
	case 0:
		System.exit(0);
	break;
	default:
		System.out.println( "Invalid option!" );
	break;
	}
		System.out.println();
		System.out.print( "Do you want to continue? " );
		ch = sc.next().charAt(0);
	} 
	while ( ch == 'y' || ch == 'Y' );
		
	}
	}