package easy.PartitionArrayIntoThreePartsWithEqualSum;

import java.util.Arrays;

public class PartitionArrayIntoThreeEqualSumParts {

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		int [] arr = {0,2,1,-6,6,-7,9,1,2,0,1};
		boolean ifEqual = canThreePartsEqualSum(arr);
		System.out.println(ifEqual); //true
		System.out.println(System.nanoTime() - start);
		
		start = System.nanoTime();
		int [] arr1 = {0,2,1,-6,6,7,9,-1,2,0,1};
		 ifEqual = canThreePartsEqualSum(arr1);
		System.out.println(ifEqual); //false
		System.out.println(System.nanoTime() - start);
		
		start = System.nanoTime();
		int [] arr2 = {3,3,6,5,-2,2,5,1,-9,4};
		 ifEqual = canThreePartsEqualSum(arr2);
		System.out.println(ifEqual); //true		
		System.out.println(System.nanoTime() - start);
		
		start = System.nanoTime();
		int [] arr3 = {0, 0, 0, 0};
		 ifEqual = canThreePartsEqualSum(arr3);
		System.out.println(ifEqual); //false
		System.out.println(System.nanoTime() - start);
		
//		int [] arr4 = {3,-3,0};
//		 ifEqual = canThreePartsEqualSum(arr4);
//		System.out.println(ifEqual); //false

	}
	
    public static boolean canThreePartsEqualSum(int[] arr) {
    	
    	//int total = Arrays.stream(arr).sum(); // in LeetCode speed is 5ms
    	int total = 0;
    	// this improved the time complexity  speed from 5ms to 1ms
    	for(int i = 0; i < arr.length; i++) 
    		total += arr[i];
    	if (total%3 != 0)
    		return false;
    	
    	int target = total/3;
    	int currentSum = 0;
    	int count = 0;    	
    	
    for(int i = 0; i < arr.length-1; i++) {    	
    		
    	currentSum += arr[i];    	
    	if(currentSum ==  target) {    		
    		currentSum = 0;
    		count ++;    		
    	}    		
    	if(count == 2)
    		return true; // this is to take care of [0,0,0,0] -> true
    }    	    	
    	return count == 3?  true: false;
        
    }

}
