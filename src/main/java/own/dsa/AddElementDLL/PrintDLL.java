package own.dsa.AddElementDLL;

public class PrintDLL {
	
	DLLNode temp = null;
	public void printForwardDLL(DLLNode head) {
		temp = head;
		while(temp != null) {
			System.out.print(temp.value + "<->");
			temp = temp.next;
		}
		System.out.println();
	}

	public void printReverseDLL(DLLNode tail) {
		temp = tail;
		while(temp != null) {
			System.out.print(temp.value + "<->");
			temp = temp.prev;
		}
		System.out.println();		
	}
}
