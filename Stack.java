package q3Fall2009;

public class Stack {
	
	private StackNode head;
	private int size=0;
	
	public void push(String data) {
		if(size == 0) {
			head = new StackNode(data, null);
		}
		else {
			StackNode c = new StackNode(null , null);
			c= head;
			head = new StackNode(data, null);
			head.next = c;
		}
		size++;
	}
	
	public String pop() {
		StackNode c = new StackNode(null , null);
		c = head;
		head = c.next;
		size--;
		return head.data;
	}
	
	public void print() {
		StackNode c = new StackNode(null , null);
		c = head;
		while(c.next != null) {
			System.out.print(c.data + " ");
			c = c.next;
		}
		System.out.println(c.data);
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("Fortran");
		s.push("Pascal");
		s.print();
		s.push("C++");
		s.push("Java");
		s.print();
		System.out.println("3 Pop -> " + s.pop() + ", " + s.pop() + ", " + s.pop());
		s.print();
		System.out.println("Size: " + s.size());
	}

}
