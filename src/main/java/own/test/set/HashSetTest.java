package own.test.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;

public class HashSetTest {
	
	static Set<Integer> set = new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		set.add(10);
		set.add(50);
		set.add(100);
		set.add(1);
		
		//Does not maintain insertion order 
		//Not sorted
		for(Integer i :  set) {
			System.out.print(i + " -> ");
		}
		System.out.println();
		System.out.println("***********");
		set.add(10); 
		//10 is duplicate it's not allowed 
		//No compilation error it just ignores 	10
		for(Integer i :  set) {
			System.out.print(i + " -> ");
		}
		System.out.println();
		System.out.println("***********");
		set.stream().sorted().forEach(s -> System.out.print(s + " -> "));		
		
		//set.sort(Comparator.reverseOrder());// XX Error
		//Correct way to sort Set 
		List<Integer> list = new ArrayList<>(set);
		
		list.sort(Comparator.reverseOrder());
		
		
		
		
		
		
		
	}
}
