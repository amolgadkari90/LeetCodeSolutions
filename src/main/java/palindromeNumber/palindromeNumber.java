package palindromeNumber;


public class palindromeNumber {

	public static void main(String[] args) {
		int n = 0;
		
		boolean isPalindrome = isPalindrome(n);
		System.out.println("Number: " + n + " isPalindrome " + isPalindrome);

	}
	
	
	    public static boolean isPalindrome(int x) {
	    	
	    	    	
	    	if (x < 0 || (x % 10 == 0 && x != 0)) {
	    			System.out.println("Exception");
	            return false;
	        }

	        int reversedHalf = 0;

	        while (x > reversedHalf) {
	            reversedHalf = reversedHalf * 10 + x % 10;
	            x /= 10;
	            //System.out.printf("reversedHalf: %d , x : %d \n", reversedHalf, x );
	        }

	        return x == reversedHalf || x == reversedHalf / 10;
	    }
	

}
