package q3Spring2005;

public class LinkedList {
	
	private Node head;
	private int size =0;
	
	public LinkedList() {
	}
	
	public void insert(String data) {
		if(size == 0) {
			head = new Node(data, null);
		}
		else {
			head.next = new Node(data, null);
		}
		
		size++;
	}
	
	public void insertFirst(String data) {
		if(size == 0) {
			head = new Node(data, null);
		}
		else {
			Node c = new Node(null,null);
			c = head;
			head = new Node(data,null);
			head.next = c;
		}
		size++;
	}
	
	public void print() {
		Node c = new Node(null , null);
		c = head;
		while(c.next != null) {
			System.out.print(c.data + " ");
			c = c.next;
		}
		System.out.print(c.data);
	}
	
	public static void main(String[] args) {
		LinkedList e = new LinkedList();
		e.insertFirst("Glass");
		e.insertFirst("Stone");
		e.insertFirst("Wood");
		e.insertFirst("Steel");
		e.print();
	}

}
