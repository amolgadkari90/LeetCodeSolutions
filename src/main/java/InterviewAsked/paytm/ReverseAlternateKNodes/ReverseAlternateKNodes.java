package InterviewAsked.paytm.ReverseAlternateKNodes;

public class ReverseAlternateKNodes {
	
	static class LinkNode{		
		int value;
		LinkNode next;	
		LinkNode(int value){
			this.value = value;
			this.next = null;
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Linked list: 5 6 7 8 9 10 11 12
		//K: 3 
		
		LinkNode head = new LinkNode(5);
		head.next = new LinkNode(6);
		head.next.next = new LinkNode(7);
		head.next.next.next = new LinkNode(8);
		head.next.next.next.next = new LinkNode(9);
		head.next.next.next.next.next  = new LinkNode(10);
		head.next.next.next.next.next.next  = new LinkNode(11);
		head.next.next.next.next.next.next.next = new LinkNode(12);
		LinkNode temp = head;
		while(temp != null ) {System.out.print(temp.value + "->"); temp = temp.next;}
		System.out.println();
		
		int k = 3;
		
		LinkNode result = reverseAlternate(head , k);
		LinkNode temp1 = result;
		while(temp1 != null) {System.out.print(temp1.value + "->"); temp1 = temp1.next;}

	}
	
	
	private static LinkNode reverseAlternate(LinkNode head, int k) {

	    if (head == null || k <= 1) return head;

	    LinkNode current = head;
	    LinkNode prevTail = null;
	    LinkNode newHead = null;

	    boolean reverse = true;

	    while (current != null) {

	        int count = 0;
	        LinkNode segmentHead = current;
	        LinkNode prev = null;

	        if (reverse) {
	            // reverse k nodes
	            while (current != null && count < k) {
	                LinkNode next = current.next;
	                current.next = prev;
	                prev = current;
	                current = next;
	                count++;
	            }

	            if (newHead == null) newHead = prev;

	            if (prevTail != null) {
	                prevTail.next = prev;
	            }

	            prevTail = segmentHead;

	            // critical connection fix
	            prevTail.next = current;

	        } else {
	            // skip k nodes
	            while (current != null && count < k) {
	                prevTail = current;
	                current = current.next;
	                count++;
	            }
	        }

	        reverse = !reverse;
	    }

	    return newHead;
	}
	
	
}// class ends here

//	private static LinkNode reverseAlternate(LinkNode head, int k) throws Exception {
//		// TODO Auto-generated method stub
//		
//		if(head == null || k <= 0)
//			throw new Exception("Invalid inputs");		
//		
//		LinkNode result = new LinkNode(0);
//		Stack<Integer> stack = new Stack<>();
//		int length = 0;
//		LinkNode  temp = head;
//		while(temp != null ) length++;
//		temp = head;
//		for(int i = 0; i < length && temp.next != null; i++) {
//			int count = 1;
//			while(count > k && temp.next != null ) {
//				stack.push(temp.value);
//				temp = temp.next;
//				count++;
//				length --;
//			}
//			LinkNode resultTemp = result;
//			if(count == k) {
//				while (stack.empty()) {
//					resultTemp.value= stack.pop();
//					resultTemp = resultTemp.next;				
//				}
//				while(count > 1 && temp != null) {
//					resultTemp.value = temp.value;
//					resultTemp = resultTemp.next;
//					length --;
//					temp = temp.next;				
//					count --;					
//				}
//			}else {
//					if(length < k) {
//						while(stack.empty())
//							result.value = stack.pop();
//						length--;
//					}	
//					
//				}		
//				
//		}
//		return result;		
//	}


