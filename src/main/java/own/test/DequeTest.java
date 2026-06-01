package own.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DequeTest {
	
	static Deque<Integer> dq = new ArrayDeque<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dq.add(10);
		dq.add(30);
		dq.add(20);
		System.out.println("***Insertion order maintained***");
		for(Integer i: dq)
			System.out.print(i + " -> ");
		System.out.println();
		
		System.out.println("***Remove all***");
		dq.clear();
		System.out.println("Dq is empty = " + dq.isEmpty());
		System.out.println("********");
				
		System.out.println("***Like stack***");
		for(int i = 1; i <= 10; i++)		
			dq.push(i);
		while(!dq.isEmpty())
			System.out.print(dq.pop() + " -> "); // pop from rare side 
		System.out.println();
		
		System.out.println("***Check is dq empty***");
		System.out.println("Dq is empty = " + dq.isEmpty());
		
		System.out.println("***Like queue***");
		for(int i = 1; i <= 10; i++)
			dq.addLast(i);
		while(!dq.isEmpty())
			System.out.print(dq.removeFirst()+ " -> "); // remove from front/head side
		
		dq.clear();
		

		
		System.out.println();
		
		int[] arr = {50, 20, 30, 10, 40};
		
		for(int num : arr) {
			dq.add(num);
		}
		
		while(!dq.isEmpty())
			System.out.print(dq.removeFirst() + " -> ");
		
		dq.clear();
		System.out.println();
		
		System.out.println("*****************");
		List<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		
		Deque<Integer> dq1 = new ArrayDeque<>(list);
		
		Set<Integer> set =  new TreeSet<>(dq1);
		//list1.sort(Comparator.naturalOrder());
		for(Integer i: set)
			System.out.print( i + " -> ");
		
		
		
		
		
		
		
		

	}

}
