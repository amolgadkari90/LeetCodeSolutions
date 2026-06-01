package own.test.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LInkedHashSetTest {
	
	static Set<Integer> lhs = new LinkedHashSet();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	lhs.add(10);
	lhs.add(100);
	lhs.add(20);
	
	
	//Insertion order [10, 100, 20]
	for(Integer i :  lhs)
		System.out.print(i + " -> "); // 10 -> 100 -> 20 -> 
	System.out.println();
	
	
	System.out.println("****Uniquness***");
	//no duplicates 
	lhs.add(100);
	//Insertion order [10, 100, 20, 100]
	//no Duplicates
		for(Integer i :  lhs)
			System.out.print(i + " -> "); // 10 -> 100 -> 20 -> 		
	System.out.println();
	
	
	System.out.println("****sorting***");
	// Sorting 
	List<Integer>  list =  new ArrayList<>(lhs);	
	list.sort(Comparator.naturalOrder());	
	for(Integer i: list)
		System.out.print(i + " -> ");
	System.out.println();
	
	System.out.println("****sorting using tree set***");
	lhs.add(5);
	lhs.add(25);
	for(Integer i: lhs)
		System.out.print(i + " -> ");
	System.out.println();	
	Set<Integer> ts = new TreeSet<>(lhs);
	for(Integer i : ts)
		System.out.print(i + " -> ");

	}

}
