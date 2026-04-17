package own.dsa.ReverseSLL;

public class ReverseSLL {
	
	static public class LinkNode{
		int value;
		LinkNode next;
		
		LinkNode(int value){
			this.value = value;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkNode headOdd = new LinkNode(1);
		LinkNode temp = headOdd;

		for (int i = 2; i <= 5; i++) {
		    temp.next = new LinkNode(i);
		    temp = temp.next;   
		}
		temp = headOdd;
		while(temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}			
		System.out.println();
		
		System.out.println("*************Odd reverse -> output **************");		
		
		LinkNode reverse = reverseLinkList(headOdd);
		LinkNode rev = reverse;
		while(rev != null) {
			System.out.print(rev.value + "->");
			rev = rev.next;
		}
		System.out.println();	
		
		LinkNode  headEven = new LinkNode(1);
		LinkNode tempEven = headEven;
		
		for (int i = 2; i <= 10; i++) {
			tempEven.next = new LinkNode(i);
			tempEven  = tempEven.next;			
		}
		tempEven = headEven;
		while(tempEven != null) {
			System.out.print(tempEven.value + "->");
			tempEven = tempEven.next;
		}
		System.out.println();
		
		System.out.println("*************Even reverse -> output**************");		
		
		reverse = reverseLinkList(headEven);
		rev = reverse;
		while(rev != null) {
			System.out.print(rev.value + "->");
			rev = rev.next;
		}
		
		System.out.println();	
		LinkNode headSingle = new LinkNode(1);
		temp = headSingle;
		while(temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}			
		System.out.println();
		
		System.out.println("*************Single reverse ->  output**************");		
		
		reverse = reverseLinkList(headSingle);
		rev = reverse;
		while(rev != null) {
			System.out.print(rev.value + "->");
			rev = rev.next;
		}
		
		System.out.println();	
		LinkNode headNull = null;
		temp = headNull;
		while(temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}			
		System.out.println();
		
		System.out.println("*************Null reverse ->  output**************");		
		
		reverse = reverseLinkList(headNull);
		rev = reverse;
		while(rev != null) {
			System.out.print(rev.value + "->");
			rev = rev.next;
		}
		
		

	}


	private static LinkNode reverseLinkList(LinkNode head) {
		
		LinkNode current = head;
		LinkNode prev = null;
		LinkNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next=prev;
			prev = current;
			current =next;
		}
		
		head = prev;
		
		return head;
	}	
	

}
