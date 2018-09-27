public class Process {
	private String definition;
	private Process next; 
	private int id; 

	public Process(String definition, int id) {
		this.definition = definition; 
		this.id = id; 
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getDefinition() {
		return definition;
	}

	public void setId(int id) {
		this.id = id; 
	}

	public int getId() {
		return id;
	}

	public void getKey() {
		return id%10000;
	}

	public void setNext(Process x) {
		next = x;
	}

	public Process getNext() {
		return next; 
	}


}