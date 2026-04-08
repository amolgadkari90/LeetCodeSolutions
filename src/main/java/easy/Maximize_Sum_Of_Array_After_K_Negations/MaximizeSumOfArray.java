package easy.Maximize_Sum_Of_Array_After_K_Negations;

import java.util.Arrays;

public class MaximizeSumOfArray {

	public static void main(String[] args) {
		
		int [] nums = {4, 2, 3};
		int k = 1;
		int maxSum = largestSumAfterKNegations(nums , k);
		System.out.println(maxSum); // 5
		
		
		int [] nums1 = {3,-1,0,2};
		k = 3;
		maxSum = largestSumAfterKNegations(nums1  , k);
		System.out.println(maxSum); // 6
		
		int [] nums2 = {2,-3,-1,5,-4};
		k = 2;
		maxSum = largestSumAfterKNegations(nums2  , k);
		System.out.println(maxSum); // 13
		
		int [] nums3 = {5,6,9,-3,3};
		k = 2;
		maxSum = largestSumAfterKNegations(nums3  , k);
		System.out.println(maxSum); // 20
		
		int [] nums4 = {-4,-2,-3};
		k = 4;
		 maxSum = largestSumAfterKNegations(nums4  , k);
		System.out.println(maxSum); // 5
		
		
		

	}
	
	public static int largestSumAfterKNegations(int[] nums, int k) {
		
		Arrays.sort(nums);
		//Arrays.stream(nums).forEach(n -> System.out.println(n));
		
		
		for(int i = 0 ; i < nums.length && k > 0 ; i++) {
			if(nums[i] < 0) {
				nums[i] *= -1;
				k--;
			} else break;
		}
		
		int maxSum = 0;
		int min = Integer.MAX_VALUE;		
		for(int n  = 0; n < nums.length; n++ ) {
			maxSum += nums[n];	
			min = Math.min(min , nums[n]);
			
		}
			
		
		
//		if(k%2 > 0 && i < nums.length-1 ) {   //if k odd and array is not finished
//			if(prev > nums[i] )
//				nums[i] *=-1;
//			
//		}
		
		if( k%2 == 1) {
			maxSum -= (2 * min);
		}

		
		return maxSum;
        
    }

}
