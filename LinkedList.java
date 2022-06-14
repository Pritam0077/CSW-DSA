
public class LinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	static Node head;

	static void addFirst(int d) {
		Node nn = new Node(d);
		if (head == null) {
			head = nn;
		} else {
			nn.next = head;
			head = nn;
		}
	}

	static void addLast(int d) {

		Node nn = new Node(d);
		Node curr = head;
		if (head == null) {
			head = nn;
		} else {
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = nn;
		}

	}

	static void deleteNode(int position) {

		if (head == null)
			return;

		Node temp = head;

		if (position == 0) {
			head = temp.next;
			return;
		}

		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.next;

		if (temp == null || temp.next == null)
			return;

		Node next = temp.next.next;

		temp.next = next;
	}

	static void printing() {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print(temp.data);
		System.out.println();
	}

	static void add_position(int d, int i) {
		Node nn = new Node(d);
		int c = 1;
		if (head == null) {
			head = nn;
		} else {
			Node temp = head;
			while (c < i - 1) {
				temp = temp.next;
				c++;
			}
			nn.next = temp.next;
			temp.next = nn;
		}
	}

	public static void main(String[] args) {

		addFirst(1);
		addLast(2);
		printing();
		add_position(5, 2);
		printing();
		addFirst(2);
		addFirst(3);
		addFirst(4);
		addFirst(6);
		add_position(10, 5);
		printing();
		deleteNode(5);
		printing();
	}

}
