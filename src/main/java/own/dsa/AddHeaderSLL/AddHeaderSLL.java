package own.dsa.AddHeaderSLL;

public class AddHeaderSLL {
	
	private static class LinkNode{
		
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
		int k = 5;
		headOdd = fillSLL(headOdd, k);
		prientSLL(headOdd);
		
		int val = 555;
		
		System.out.println("Updated headOdd");
		LinkNode updated = addHeaderNodeSLL(headOdd, val);
		prientSLL(updated);
		
		LinkNode headEven = new LinkNode(1);
		k = 10;
		headEven = fillSLL(headEven, k);
		prientSLL(headEven);
		
		val = 666;
		System.out.println("Updated headEven");
		 updated = addHeaderNodeSLL(headEven, val);
		prientSLL(updated);
	}
	
	private static LinkNode addHeaderNodeSLL(LinkNode head, int val) {
		// TODO Auto-generated method stub
		
		LinkNode newHead = new LinkNode (val);		
		newHead.next =head;			
		return newHead;
	}

	private static void prientSLL(LinkNode head) {
		// TODO Auto-generated method stub
		
		LinkNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}		
		System.out.println();		
	}

	private static LinkNode fillSLL(LinkNode head, int k){
		
		LinkNode temp = head;
		for(int i = 2; i <=k; i++) {
			temp.next = new LinkNode(i);
			temp = temp.next;			
		}		
		return head;		
	}

}
