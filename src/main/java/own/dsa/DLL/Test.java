package own.dsa.DLL;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddElementDLL add = new AddElementDLL();
		DeleteElementDLL delete = new DeleteElementDLL();
				FillDLL fill = new FillDLL();
				PrintDLL print = new PrintDLL();
				DLLNode head = new DLLNode(1);
				
				//head.next = head;
				//head.prev = head;
				DLLNode tail = head;
				int k = 10;
				
				tail = fill.fillDLL(head, k);
				print.printForwardDLL(head);	
				print.printReverseDLL(tail);		
				
				int value = 555;
				int after = 5;
				tail = add.addElementInMiddleDLL(head, value, after);
				System.out.println("Added in the middle: " + tail);
				print.printReverseDLL(tail);		
				
				value = 11;
				head = add.addElementAtStartDLL(head, value);
				System.out.println("Added at the start: " + head);
				print.printForwardDLL(head);		
				
				value = 100;
				tail = add.addElementAtEndDLL(tail, value);
				System.out.println("Added at the end:: " + tail);
				print.printForwardDLL(head);		
				
				value = 555;
				tail = delete.deleteMiddleElementDLL(head, value);
				System.out.println("Deleted in middel " + tail);
				print.printReverseDLL(tail);

	}

}
