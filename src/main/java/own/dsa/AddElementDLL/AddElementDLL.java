package own.dsa.AddElementDLL;

public class AddElementDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		FillDLL fill = new FillDLL();
		PrintDLL print = new PrintDLL();
		DLLNode head = new DLLNode(1);
		//head.next = head;
		//head.prev = head;
		DLLNode tail = head;
		int k = 10;
		
		tail = fill.fillDLL(head, k);
		print.printForwardDLL(head);	
		print.printReverseDLL(tail);		
		
		int value = 555;
		int after = 5;
		tail = addElementInMiddleDLL(head, value, after);
		System.out.println("Added in the middle: " + tail);
		print.printReverseDLL(tail);		
		
		value = 11;
		head = addElementAtStartDLL(head, value);
		System.out.println("Added at the start: " + head);
		print.printForwardDLL(head);		
		
		value = 100;
		tail = addElementAtEndDLL(tail, value);
		System.out.println("Added at the end: " + tail);
		print.printForwardDLL(head);		

	}

	private static DLLNode addElementAtEndDLL(DLLNode tail, int value) {
		// TODO Auto-generated method stub
		DLLNode newTail = new DLLNode (value);
		tail.next= newTail;
		newTail.prev = tail;			
		return newTail;
	}

	private static DLLNode addElementAtStartDLL(DLLNode head, int value) {
		// TODO Auto-generated method stub
		DLLNode node = new DLLNode(value);
		head.prev = node;
		node.next = head;
		return node;
	}

	private static DLLNode addElementInMiddleDLL(DLLNode head, int value, int after) {
		// TODO Auto-generated method stub
		DLLNode pointer = head;
		DLLNode tail = null;
		while(pointer !=null) {
			if(pointer.value == after) {
				DLLNode node  = new DLLNode(value);
				node.prev = pointer;
				node.next = pointer.next;
				pointer.next.prev = node;
				pointer.next =node;		
			}
			if (pointer.next == null)
				tail = pointer;
			pointer = pointer.next;
		}
		return tail;
	}

}
