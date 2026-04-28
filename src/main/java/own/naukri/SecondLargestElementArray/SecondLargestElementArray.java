package own.naukri.SecondLargestElementArray;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {2, 4, 5, 6, 8};
		 System.out.println(secondLargest(arr));	
		 
		 int [] arr1 = {100, -2, 4, 5, 6, 8};
		 System.out.println(secondLargest(arr1));	

	}
	
	public static  int secondLargest(int[] arr) {
		
//		OptionalInt max = Arrays.stream(arr).max();
//		System.out.println(max);
		int max = 0;
		int secondMax = 0;
		for(int i = 0; i < arr.length; i++) {			
			if(max < arr[i]) {
				secondMax = max;
				max = arr[i];				
			}			
		}
		
		return secondMax;
	}

}
