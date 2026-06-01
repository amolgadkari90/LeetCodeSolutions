package own.naukri.CycleDetection;

public class CycleDetectionSSL {
	
	static public class Node{
		int data;
		Node next;
		
		Node(){
			this.data = 0;
			this.next = null;
		}
		
		Node(int data){
			this.data = data;
			this.next = null;
		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1,2,3
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = head.next;
		
		boolean result = ifCycle(head);
		System.out.println(result);

	}

	private static boolean ifCycle(Node head) {
		// TODO Auto-generated method stub
		
		if(head == null || head.next == null) return false;
		
		//Node current = head;
		Node fast = head;
		Node slow = head;
		
		while(fast != null &&  fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return true;
			}			
		}		
		return false;
	}
}
