package own.dsa.AddElementDLL;

public class FillDLL {
	
	
	DLLNode temp = null;
	public DLLNode fillDLL(DLLNode head, int k) {
		
		temp = head;
		for(int i = 2;  i <= k ; i++) {
			temp.next = new DLLNode(i);
			DLLNode prev = temp;
			temp = temp.next;
			temp.prev = prev;
		}		
		return temp;
	}

}
