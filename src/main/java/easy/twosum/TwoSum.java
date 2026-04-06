package easy.twosum;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {2,7,11,15}; 
		int target = 9;
		int[] result = twoSum(nums, target);
		Arrays.stream(result).forEach(x -> System.out.print(x + " , ")); // 0, 1
		System.out.println();
		
		int [] nums1 = {3,2,4}; 
		target = 6;
		result = twoSum(nums1, target);
		Arrays.stream(result).forEach(x -> System.out.print(x + " , ")); // 1, 2
		System.out.println();
		
		int [] nums2 = {3,3}; 
		target = 6;
		result = twoSum(nums2, target);		
		Arrays.stream(result).forEach(x -> System.out.print(x + " , ")); // 0, 1
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};


                }
            }
            
        }
        return new int[] {};
        
    }

}
