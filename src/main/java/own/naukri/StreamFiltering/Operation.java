package own.naukri.StreamFiltering;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Operation {
	
	class Result{
		Integer rollNumber;
		String name;
		
		Result(Integer rn, String name){			
			this.rollNumber = rn;
			this.name = name;			
		}

		@Override
		public String toString() {
			return "RollNumber = " + this.rollNumber + " Name = " + this.name;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation op = new Operation();
		
		//Student st = new Student();
		List <Student> sList = new ArrayList<>();
		
		//fill the list
		
		sList.add(new Student (1, "Amit", "Kadam"));
		sList.add(new Student (30, "Rohit", "Sharma"));
		sList.add(new Student (99, "Rajan", "Joshi"));
		sList.add(new Student (100, "Kumar", "Mehta"));
		sList.add(new Student (50, "Virat", "Kohali"));
		sList.add(new Student (49, "Hardik", "Pandya"));
		sList.add(new Student (10, "Sachin", "Tendulkar"));
		sList.add(new Student (51, "Mahi", "Dhoni"));
		
		//Test
		//sList.stream().forEach(st -> System.out.println(st));
		
		List<Result> resList  = sList.stream().filter(st -> st.rollNumber > 50)
								.map(s -> op.new Result(s.rollNumber, (s.firstName + " " + s.lastName)))
								.collect(Collectors.toList());
		
		resList.stream().forEach(rl -> System.out.println(rl));		
	
	}

}
