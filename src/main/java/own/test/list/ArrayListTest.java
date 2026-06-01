package own.test.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListTest {
	
	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		list.add(1);
		list.add(2);
		
		for(Integer i : list) {			
			System.out.print(i + "->");			
		}
		System.out.println();
		System.out.println("***Order maintained ***");
		list.add(10);
		list.add(5);
		
		for(Integer i : list) {
			System.out.print(i + "->");
		}
		System.out.println();		
		System.out.println("get - > "  + list.get(2));
		System.out.println("Contains -> " + list.contains(10) );
		list.stream().sorted().forEach(l -> System.out.print(l + "->"));
		System.out.println();
		for(Integer i: list) {
			System.out.print(i + "-> ");
		}
		System.out.println();
		list.sort(Comparator.naturalOrder());
		for(Integer i : list) {
			System.out.print(i + "-> ");
		}
		System.out.println();
		
		list.sort(Comparator.reverseOrder());
		for(Integer i :  list)
			System.out.print(i + " -> ");
		System.out.println();
	}

}
