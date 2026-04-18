package own.dsa.DLL;

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
