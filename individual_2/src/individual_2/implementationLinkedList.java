package individual_2;

public class implementationLinkedList {
	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	    // 1. Inserting a Node at Any Given Position in a Singly Linked List
	    public void insertAtPos(int pos, int data) {
	        Node newNode = new Node(data);
	        if (pos == 1) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node curr = head;
	        for (int i = 0; i < pos - 2; i++) {
	            if (curr == null) {
	                return;
	            }
	            curr = curr.next;
	        }

	        if (curr == null) {
	            return;
	        }

	        newNode.next = curr.next;
	        curr.next = newNode;
	    }

	    // 2. Deleting a Node at Any Given Position in a Singly Linked List
	    public void deleteAtPosition(int pos) {
	        if (head == null) {
	            return;
	        }

	        if (pos == 1) {
	            head = head.next;
	            return;
	        }

	        Node curr = head;
	        for (int i = 0; i < pos - 2; i++) {
	            if (curr == null || curr.next == null) {
	                return;
	            }
	            curr = curr.next;
	        }

	        if (curr == null || curr.next == null) {
	            return;
	        }

	        curr.next = curr.next.next;
	    }

	    // 3. Deleting a Node After a Given Node in a Singly Linked List
	    public void deleteAfterNode(Node node) {
	        if (node == null || node.next == null) {
	            return;
	        }

	        node.next = node.next.next;
	    }

	    // 4. Searching a Node in a Singly Linked List
	    public boolean searchNode(int data) {
	        Node curr = head;
	        while (curr != null) {
	            if (curr.data == data) {
	                return true;
	            }
	            curr = curr.next;
	        }
	        return false;
	    }
	}

	class Stack {
	    private LinkedList linkedList;

	    // 5. Implementing a Stack Using Linked Lists
	    public Stack() {
	        linkedList = new LinkedList();
	    }

	    public void push(int data) {
	        linkedList.insertAtPos(1, data);
	    }

	    public Integer pop() {
	        if (linkedList.head == null) {
	            return null;
	        }

	        int data = linkedList.head.data;
	        linkedList.deleteAtPosition(1);
	        return data;
	    }

	    public Integer peek() {
	        if (linkedList.head == null) {
	            return null;
	        }
	        return linkedList.head.data;
	    }
	}
}
