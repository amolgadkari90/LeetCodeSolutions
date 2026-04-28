package own.dsa.LRUCache;

import java.util.HashMap;
import java.util.Map;

public class LruCache {
	
	private static class Node{
		
		int key, value;
		Node prev, next;
		
		Node(int k, int v){
			this.key = k;
			this.value = v;
			this.prev = null;
			this.next = null;
		}		
	}
	
	private int capacity ;
	private Map<Integer, Node> map = new HashMap<>();
	private Node head, tail;
	
	
	//Get
	private int  get(int key){
		if(!map.containsKey(key)) {
			return -1;
		}
		
		Node node = map.get(key);
		
		
		
		
		
		
		
		
		
	}
	//Put
	private void put (int value) {
		
	}
	//InsertAtHead
	private void insertAtHead(Node node) {
		
	}
	
	//Remove
	
	private void remove(Node node) {
		
	}
	
	

}
