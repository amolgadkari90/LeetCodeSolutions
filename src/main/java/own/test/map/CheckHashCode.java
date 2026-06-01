package own.test.map;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;

public class CheckHashCode {
	
	static class Employee{
		int id;
		String name;
		
		Employee(int id, String name){
			
			this.id = id;
			this.name = name;
		}
		
//		@Override
//		public int hashCode() {
//			// TODO Auto-generated method stub
//			return Objects.hash(id);
//		}
		
//		@Override
//		public boolean equals(Object obj) {
//			// TODO Auto-generated method stub
//			//if the objects are same 
//			if(this == obj) return true;
//			
//			//if Objects is not instance of Employee
//			if(! (obj instanceof Employee) ) return false;
//			
//			Employee e = (Employee) obj;
//			
//			return this.id == e.id;
//		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Id: " + id + " Name: " + name;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Map <Integer, String>map = new HashMap<>();
	
	map.put(1, "Amol");	
	map.put(10, "Amit");
	map.put(100, "Ram");
	System.out.println("hashCode for key 10 = "+Integer.hashCode(10));
	map.put(10, "Sham");
	
	
	System.out.println(map);
	
	Set<Integer> keySet = map.keySet();
	
	//	
	keySet.stream().forEach(k ->  System.out.print(Integer.hashCode(k) + " -> "));
	
	System.out.println();
	
	
	
	Map <Employee, String>mapString = new HashMap<>();
	
	
	Employee e1 = new Employee(1, "Amol");
	System.out.println("e1 hashCode = "+e1.hashCode());
	//System.out.println("e1 reference = "+ e1);
	System.out.println("bucket1 " + ((16 - 1) & e1.hashCode()));
	mapString.put(e1, "Engineer");
	
	Employee e2 = new Employee(2, "Amit");
	System.out.println("e2 hashCode = "+e2.hashCode());
	//System.out.println("e2 reference = "+ e2);
	System.out.println("bucket2 " + ((16 - 1) & e2.hashCode()));
	mapString.put(e2, "DevOps");
	
	Employee e3 = new Employee(3, "Rohit");
	System.out.println("e3 hashCode = "+e3.hashCode());
	//System.out.println("e3 reference = "+ e3);
	System.out.println("bucket3 " + ((16 - 1) & e3.hashCode()));
	mapString.put(e3, "Testing");
	
	Employee e4 = new Employee(1, "Amol");
	System.out.println("e4 hashCode = "+e4.hashCode());
	//System.out.println("e4 reference = " + e4);
	System.out.println("bucket4 " + ((16 - 1) & e4.hashCode()));
	System.out.println("Map size before adding same object: "+ mapString.size());	
	mapString.put(e4, "Manager");
	System.out.println("Map size after adding same object: "+mapString.size());	
	
//	System.out.println("if (e1 == e4) " + (e1 == e4));
//	System.out.println(System.identityHashCode(e1));
//	System.out.println(System.identityHashCode(e4));	
	System.out.println(mapString);

	


	}
	
	

}
