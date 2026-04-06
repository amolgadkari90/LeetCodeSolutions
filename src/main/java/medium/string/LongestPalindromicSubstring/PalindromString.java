package medium.string.LongestPalindromicSubstring;


public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "";
		
		s = "12321";		
		boolean ifPalindrom = ifPalindrom(s);		
		System.out.println(s + " => "+ifPalindrom);
		
		s = "12215";		
		ifPalindrom = ifPalindrom(s);		
		System.out.println(s + " => "+ifPalindrom);
		
		s = "A man a plan a canal Panama";		
		ifPalindrom = ifPalindrom(s);		
		System.out.println(s + " => "+ifPalindrom);

	}
	
	//1. Reverse the string and equate -> reversing O(n) and equating O(n) = O(n2)
	//2. Two pointer -> L == right {L++, R--} else {return false}
	//

//	private static boolean ifPalindrom(String ss) {
//		
//		String s = ss.toLowerCase().replace(" ","");
//		
//		System.out.println(s);		
//		
//		int length = s.length();// O(n) space complexity 
//		int left = 0;
//		int right = length - 1;
//		
//		while (left < right) {	// O(n) time complexity -> if string is of 10 chars loop runs 5 times and 
//								//if String is of 100 char it will run for 50 times
//								//O is linearly increases with number of chars hence O(n)
//			if(s.charAt(left) !=  s.charAt(right)) {
//				return false;
//			}
//			else {
//				left++;
//				right--;
//			}			
//		}
//		
//		return true;
//	}
	
	
	private static boolean ifPalindrom(String ss) {
		
		int left = 0, right = ss.length()-1;
		while(left < right) {
			while(left < right && Character.isWhitespace(ss.charAt(left)))
				left++;
			while (left< right && Character.isWhitespace(ss.charAt(right)))
				right--;
			if( Character.toLowerCase(ss.charAt(left)) 
					!= Character.toLowerCase(ss.charAt(right))					
					)
				return false;
			left++;
			right--;				
		}
		
		return true;
		
	}

}
