package own.dsa.AddElementDLL;

public class DLLNode {
	
	int value;
	DLLNode prev;
	DLLNode next;
	
	DLLNode(int value){
		this.value = value;
		prev = null;
		next = null;
	}
}
