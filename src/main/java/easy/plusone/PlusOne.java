package easy.plusone;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 9, 9};
		int[] plusOne = plusOne(arr);
		
		Arrays.stream(plusOne).forEach( i -> System.out.print(i));

	}
	
	public static  int [] plusOne(int[] digits) {
		
		 for (int i = digits.length - 1; i >= 0; i--) {

		        if (digits[i] < 9) {
		            digits[i]++;
		            return digits;
		        }

		        digits[i] = 0;
		    }

		    int[] result = new int[digits.length + 1];
		    result[0] = 1;

		    return result;
    }

}
