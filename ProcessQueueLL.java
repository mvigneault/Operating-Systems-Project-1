//This class implements a queue class using a linked list. 

public class ProcessQueueLL{

	//declaration of variables.
	private int n; //keeps track of the length of the list
	private Node front; //front of the list
	private Node tail; //the end or tail of the list

	//contructor that allow the creation of a queue using a linked list
	public ProcessQueueLL() {	
		int n = 0;
		front = null;
		tail = null;	
	}

	/* This method check if the queue is empty or not. If the array length is 0
	(which means that the array is empty), it returns null. otherwise, if the queue is
	not empty, it returns the front element.*/

	public Node front(){
		if(n == 0) {
			return null;
		}
		else{
			return front;
		}
	}

	/* This method removes an element at the front of the Queue. First, it checks if the 
	Queue is not empty by using int n. If it is empty then return null because you can't
	remove something when the Queue is empty. If the Queue is not empty, it uses temp and 
	set it equal to the front. Then, it set the actual front equal to the next element in
	the Queue. After that, it set the next element of temp equal to null and substract 1
	from the length of the Queue. the last thing it does after doing all that is returning
	temp (the element that was at the front before we move the front).*/

	public Node dequeue(){
		if(n == 0) {
			return null;
		}
		Node temp = front; 
		front = front.getNext();
		temp.setNext(null);
		n--;
		return temp; 
	}

	/* This method adds a Node at the back of the Queue. First, it checks
	if the tail is equal to null. If it is, it sets the front and the tail equal to 
	the new Node/element and add 1 to the length of the Queue. If the tail is not 
	equal to null, then set the next element after the tail equal to the new element. 
	after that, set the tail to the new element in the Queue and add 1 to the length
	of the queue.*/ 	

	public void enqueue(Node x){
		if (tail == null){
			front = x;
			tail = x; 
			n++;	
		}
		else{	
		tail.setNext(x);
		tail = tail.getNext();
		n++;
		}	
	}

	/* This method checks if the Queue if empty using n. If n = 0, then it is
	empty and will return true. otherwise, it will returns false. */ 

	public boolean isEmpty(){
		return n == 0;
	}

	/*This method is just a printing the keys inside the queue to allow us
	to use the test class.
	This method was given by parker.*/

	public void printQueue() {
        	System.out.println(n + " elements");
        	Node temp = front;
        	while (temp != null) {
            		System.out.println("ID: " + temp.getID());
            		System.out.println("Memory: " + temp.getMemory());
            		System.out.println("CPU: " + temp.getCPU());
            		System.out.println("Memory Location: " + temp.getMemoryLocation());
            		System.out.println("Priority: " + temp.getPriority());
            		System.out.println("Program Counter: " + temp.getProgramCounter());
            		System.out.println("Status: " + temp.getStatus());
            		System.out.println("Status Registers: " + temp.getStatusRegisters());
            		System.out.println();
            		temp = temp.getNext();
        	}
    	}
}
