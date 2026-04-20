package own.dsa.DLL;

public class DeleteElementDLL {
	
	public DLLNode deleteMiddleElementDLL(DLLNode head,  int value){
		
		DLLNode current = head;
		DLLNode  fast = head.next;
		DLLNode slow = head.prev;
				
		while(current != null) {		
			fast =  current.next;
			slow = current.prev;
			if(current.value == value ) {		
				slow.next = fast;
				fast.prev = slow;	
				current.next = null;
				current.prev = null;
			}	
			current = fast;
		}
			
		return slow;
	}

}
