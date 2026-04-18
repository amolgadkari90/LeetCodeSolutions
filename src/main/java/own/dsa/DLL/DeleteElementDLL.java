package own.dsa.DLL;

public class DeleteElementDLL {
	
	public DLLNode deleteMiddleElementDLL(DLLNode head,  int value){
		
		DLLNode temp = head;
		DLLNode prev = null;
		boolean ifFound = false;
		
		while(temp != null) {		
			prev = temp.prev;
			if(temp.value == value ) {		
				ifFound = true;
				temp.prev.next = temp.next;
				temp.next.prev =temp.prev;
				temp = temp.prev;
				temp.prev = null;
				temp.next = null;					
			}			
			temp = temp.next;
		}
		
		if(!ifFound) {
			System.out.println("Element not found");
		}		
		return prev;
	}

}
