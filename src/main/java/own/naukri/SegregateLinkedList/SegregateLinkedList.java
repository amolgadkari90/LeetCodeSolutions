package own.naukri.SegregateLinkedList;

public class SegregateLinkedList {
	
	/****************************************************************

	 Following is the class structure of the Node class:

	 class Node {
	     public int data;
	     public Node next;

	     Node()
	     {
	         this.data = 0;
	         this.next = null;
	     }
	     Node(int data)
	     {
	         this.data = data;
	         this.next = null;
	     }
	     Node(int data, Node next)
	     {
	         this.data = data;
	         this.next = next;
	     }
	 }

	 *****************************************************************/
	static class Node{
		public int data;
	     public Node next;

	     Node()
	     {
	         this.data = 0;
	         this.next = null;
	     }
	     Node(int data)
	     {
	         this.data = data;
	         this.next = null;
	     }
	     Node(int data, Node next)
	     {
	         this.data = data;
	         this.next = next;
	     }
		
	}

	    public static Node segregateEvenOdd(Node head)
	    {
	        // Write Your Code Here.
	        /*
	        *0. initilize even LL
	        *1. initilize odd LL
	        *2. boolean ifOdd present
	        *3. boolean ifEven present
	        *4. temp = head
	        *5. loop N0 -> Nn
	        *6. if(temp.data/2 == 0)
	        *7. 
	        *
	        *2. check if()
	        */

	        Node current = head;
	        Node evenHead = null;
	        Node evenTail = null;

	        Node oddHead = null;
	        Node oddTail = null;

	        while(current != null){
	            if(current.data%2 == 0){
	                if(evenHead == null){
	                    evenHead = current;
	                    evenTail = current;
	                } else{
	                    evenTail.next = current;
	                    evenTail = current;
	                }                            
	            } else{
	                if(oddHead == null){
	                    oddHead = current;
	                    oddTail = current;
	                } else{
	                    oddTail.next = current;
	                    oddTail = current;
	                } 
	            }            
	            current = current.next;
	        }

	            if(evenHead == null ){
	                oddTail.next = null;
	                return oddHead;
	            }
	            if(oddHead == null){
	                evenTail.next = null;
	                return evenHead;
	            }

	            evenTail.next = oddHead;
	            oddTail.next = null;
	            
	            return evenHead;

	    }
	    


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6 -> 5 -> 3 -> 4 -> 7 -> 1 -> 2 
		int[] arr = { 6, 5 ,3 , 4 , 7 , 1 , 2};
		Node head = new Node(arr[0]);
		Node tail = head;
		 for(int i = 1; i < arr.length; i++) {
			 tail.next = new Node(arr[i]);
			 tail = tail.next;
		 }
		
		Node newHead = segregateEvenOdd(head);
		Node temp = newHead;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
			
		}

	}

}
