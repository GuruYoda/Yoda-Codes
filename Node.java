package q3Spring2005;

public class Node {
	
	String data;
	Node next;
	
	public Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void print() {
		System.out.println(this.data);
	}

}
