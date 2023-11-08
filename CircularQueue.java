package core;

public class CircularQueue implements ICircularQueue {
	private int front;
	private int rear;
	private String[] arr;
	int size = 0;

	public CircularQueue(int size) {
		this.size = size;
		front = rear = -1;
		arr = new String[size];
	}

	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	public boolean isFull() {
		return (rear + 1) % size == front;
	}

	@Override
	public boolean add(String element) {
		// TODO Auto-generated method stub
		if (isFull()) {
			System.out.println("queue is full!!!");
			return false;
		} else if (isEmpty()) {
			front = rear = 0;
			arr[rear] = element;
			return true;
		} else {
			rear = (rear + 1) % size;
			arr[rear] = element;
			return true;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			return 0;
		}else if(isFull()) {
			return size;
		}
		else if (front == rear) {
			
			return 1;
		} else {
			int siz = rear > front ? rear - front : front - rear;
			return ++siz;
		}
	}

	@Override
	public String remove() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("queue is empty!!!");
			return null;
		} else if (front == rear) {
			String element = arr[front];
			front = rear = -1;
			return element;
		} else {
			String element = arr[front];
			front = (front + 1) % size;
			return element;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("queue is empty!!!");
			return null;
		}
		else {String element=" Circular Queue : [ ";
			for(int i=front;i<=rear;i=(i+1)%size) {
				element=element.concat(arr[i]+",");
				if(i==rear) {
					break;
				}
			
			}
			element=element.concat(" ]");
			return element;
			
		}
	}

}
