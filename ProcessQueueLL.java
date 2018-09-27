public class ProcessQueue {
	private int n;
	private int f; 
	private int e; 

	public ProcessQueue {
		n = 0;
		f = null;
		e = null;
	}

	public Process frontProcess() {
		if (n == 0){
			return null;
		}

		else {
			return f;
		}
	}

	public Process deleteProcess() {
		Process tempPointer = f;
		f = f.getNext();
		tempPointer.setNext(null);
		n--;
		return tempPointer;
	}

	public void addProcess() {
		if (isEmpty()){
			f = x;
			e = x;
		}

		else{
			e.setNext(n);
			e = x;
		}

		n++;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public void printProcesses() {
		System.out.println(n);
		Node tempPointer = f;
		while (temp != null) {
			System.out.println(tempPointer.getKey());
			tempPointer = tempPointer.getNext();
		}
	}
}