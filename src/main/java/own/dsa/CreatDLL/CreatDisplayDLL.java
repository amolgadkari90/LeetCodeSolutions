package own.dsa.CreatDLL;

public class CreatDisplayDLL {
	
	private static class DLLNode{
		int value;
		DLLNode prev;
		DLLNode next;		
		DLLNode(int value ){
			this.value = value;
			this.prev = null;
			this.next = null;
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLLNode head = new DLLNode(1);
		DLLNode tail = head;
		int k = 5;
		
		tail =  fillDLL(head, k);
		printDLL(head);	
		
		System.out.println("Print reverse");
		DLLNode temp = tail;
		while(temp != null) {
			
			System.out.print(temp.value + "<->");
			temp = temp.prev;
		}

	}

	private static void printDLL(DLLNode head) {
		// TODO Auto-generated method stub
		DLLNode temp = head;
		while(temp != null) {
			System.out.print(temp.value + "<->");
			temp = temp.next;
		}
		System.out.println();		
	}

	private static DLLNode fillDLL(DLLNode head, int k) {
		// TODO Auto-generated method stub
		
		DLLNode temp = head;
		DLLNode tail = null;
		
		
		for (int i = 2 ; i <= k ; i++) {			
			temp.next = new DLLNode(i);
			DLLNode prev = temp;
			temp = temp.next;
			temp.prev = prev;			
		}		
		tail = temp;
		return tail;
	}

}
