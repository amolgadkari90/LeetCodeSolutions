package own.dsa.AddElementSLL;


public class AddElementSLL{
	
	
	private static class LinkNode{
		int value;
		LinkNode next;
		
		LinkNode(int value){
			this.value = value;
			this.next = null;			
		}		
	}
	
	public static void main(String[] args) {
		
		//LinkNode temp = null;
		LinkNode headOdd = new LinkNode(1);
		LinkNode headEven = new LinkNode(1);
		
		headOdd = fillLinkList(headOdd, 5);		
		printLinkList(headOdd);
		
		headEven = fillLinkList(headEven, 10);		
		printLinkList(headEven);
		
		int addValue =555;
		int after = 3;
		LinkNode updated = addElementInMiddle(headOdd, addValue , after);
		printLinkList(updated);
		
		addValue =666;
		after = 10;
		updated = addElementInMiddle(headEven, addValue , after);
		printLinkList(updated);
				
		
	}
	
	private static LinkNode addElementInMiddle(LinkNode head,int add, int after) {
		// TODO Auto-generated method stub
		LinkNode temp = head;
		boolean ifFound = false;
		while(temp != null ) {
			//System.out.println(temp.value);
			if(temp.value == after){
				//System.out.println("Found");
				
				LinkNode next = temp.next;
				temp.next = new LinkNode (add);
				temp.next.next = next;	
				ifFound = true;
				return head;
			}		
			temp = temp.next;
		}
		if(!ifFound)
			System.out.println(after + " value not found");		
		return head;
	}

	private static void printLinkList(LinkNode head) {
		LinkNode temp = head;		
		
		while(temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;	
		}
		System.out.println();		
	}
	
	private static LinkNode fillLinkList(LinkNode head , int k) {
		LinkNode temp = head;
		for(int i = 2; i <= k; i++) {
			temp.next = new LinkNode(i);
			temp = temp.next;
		}			
		return head;
	}

}
