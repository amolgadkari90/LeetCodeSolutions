package medium.reverseinteger;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int x = 0;
		int result = 0; 
		
		x = -10;
		result = reverse(x);
		System.out.println("Orignal number = "+ x + " ,reversed = "+ result);
		
		x = 123;
		result = reverse(x);
		System.out.println("Orignal number = "+ x + " ,reversed = "+ result);
		
		x = -123;
		result = reverse(x);
		System.out.println("Orignal number = "+ x + " ,reversed = "+ result);
		
		x = 120;
		result = reverse(x);
		System.out.println("Orignal number = "+ x + " ,reversed = "+ result);
		
		

	}

	private static int reverse(int x) {
		
		if (x % 10 == x )
			return x;
		int result = 0;
		
		while (x != 0) {
			
			int   digit = x % 10;
			x /= 10;
			
			if ( result > Integer.MAX_VALUE / 10 || 
					(result == Integer.MAX_VALUE/10 && digit > 7))
				return 0;
			if (result < Integer.MIN_VALUE/10 || 
					(result == Integer.MIN_VALUE/10 && digit < -8))
				return 0;
			
			result = result * 10 + digit;		
			
		}
		
		return result;
		
	}

}
