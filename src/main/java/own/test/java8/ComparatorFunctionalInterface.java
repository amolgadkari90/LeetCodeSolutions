package own.test.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Legacy way 
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(1);
		list.add(6);
		
		Collections.sort(list);
		
		list.stream().forEach(l -> System.out.print(l + " ->"));
		System.out.println();
		
		// Descending order sorting 
		
		Collections.sort(list, (a, b) -> b-a);
		list.stream().forEach(l ->  System.out.print(l + " ->"));
		
		System.out.println();
		
		Set<Integer> s = new TreeSet<>();
		s.add(5);
		s.add(1);
		s.add(2);
		s.add(4);
		s.add(3);
		System.out.println("Before desc ordering");
		s.stream().forEach(ss -> System.out.print(ss + " ->"));
		System.out.println();
		Set<Integer> ds = new TreeSet<>((a,b) -> b-a );
		ds.add(5);
		ds.add(1);
		ds.add(2);
		ds.add(4);
		ds.add(3);
		
		System.out.println("After desc ordering");
		ds.stream().forEach(dss -> System.out.print(dss + " ->"));
		System.out.println();
		
		
		
		
		
		}
	

	
	
	
	
	

}
