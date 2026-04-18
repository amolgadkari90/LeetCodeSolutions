package own.dsa.DLL;

public class AddElementDLL {

	public DLLNode addElementAtEndDLL(DLLNode tail, int value) {
		// TODO Auto-generated method stub
		DLLNode newTail = new DLLNode (value);
		tail.next= newTail;
		newTail.prev = tail;			
		return newTail;
	}

	public DLLNode addElementAtStartDLL(DLLNode head, int value) {
		// TODO Auto-generated method stub
		DLLNode node = new DLLNode(value);
		head.prev = node;
		node.next = head;
		return node;
	}

	public DLLNode addElementInMiddleDLL(DLLNode head, int value, int after) {
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
