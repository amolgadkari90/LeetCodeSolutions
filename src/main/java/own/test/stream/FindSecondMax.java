package own.test.stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindSecondMax {
	
	/*
	 * Array arr = [46, 70, 58, 107, 91, 25, 42, 33, 84, 19]
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {46, 70, 58, 107, 91, 25, 42, 33, 84, 19};
		
		Integer secondMax = Arrays.stream(arr)
												.boxed()
												.distinct()
												.sorted((a,b) -> b - a  )
												.skip(1)
												.findFirst()
												.get();
		
		
		System.out.println("secondMax : " + secondMax);	
		
		
		

	}

}
