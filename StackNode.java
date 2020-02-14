package q3Fall2009;

public class StackNode {
	
	String data;
	StackNode next;
	
	public StackNode(String data , StackNode next) {
		this.data = data;
		this.next = next;
	}
	
	public String getData() {
		return this.data;
	}
	
	public StackNode getNext() {
		return next;
	}

}
