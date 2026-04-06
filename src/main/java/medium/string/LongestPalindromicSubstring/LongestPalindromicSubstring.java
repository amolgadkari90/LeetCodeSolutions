package medium.string.LongestPalindromicSubstring;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		String str ="";
		String longestPalindrome = "";
		
		
		str = "abba";
		longestPalindrome = longestPalindrome(str);
		System.out.println(longestPalindrome); //abba
		
		longestPalindrome = longestPalindrome1(str);
		System.out.println(longestPalindrome); //abba
	
		str = "abac";
		longestPalindrome = longestPalindrome(str);
		System.out.println(longestPalindrome); //aba
		
		longestPalindrome = longestPalindrome1(str);
		System.out.println(longestPalindrome); //aba
		
		str = "abcbc";
		longestPalindrome = longestPalindrome(str);
		System.out.println(longestPalindrome); //bcb
		
		longestPalindrome = longestPalindrome1(str);
		System.out.println(longestPalindrome); //bcb
		
		str = "babad";
		longestPalindrome = longestPalindrome(str);
		System.out.println(longestPalindrome); //bab
		
		longestPalindrome = longestPalindrome1(str);
		System.out.println(longestPalindrome); //bab
		
		
		str = "cbbd";
		longestPalindrome = longestPalindrome(str);
		System.out.println(longestPalindrome); //bb
		
		
		longestPalindrome = longestPalindrome1(str);
		System.out.println(longestPalindrome); //bb
		

	}
	
	public static String longestPalindrome(String s) {
        //initilize start and end pointers
        int start = 0;
        int end = s.length();
        // run loop till both start == end 
        while (start < end){
            //Get subString 
            String subString = s.substring(start, end);
            if (subString.equals(new StringBuilder(subString).reverse().toString()) && subString.length() > 1){
            		return subString;            	
            } 
            if (start+1 < end ) {
            		end--;
            } else {
            		start ++;
            		end = s.length();
            } 
        }   
        return s.substring(start);
    }
	
	
	public static String longestPalindrome1(String s) {
if (s == null || s.length() < 1) return "";
        
        int start = 0, maxLen = 1;        
        
        for (int i = 0; i < s.length(); i++) {
                 // Odd length palindromes (single center): "aba"
        	
            int len1 = expand(s, i, i);
            
           
            // Even length palindromes (dual center): "abba"
            int len2 = expand(s, i, i + 1);
            
            int len = Math.max(len1, len2);
            
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;  // Calculate left boundary
            }
        }
        
        return s.substring(start, start + maxLen);
    }
	
	private static int expand(String s, int left, int right) {
        // Expand outward while characters match and within bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;  // Length of palindrome found
    }
	

}
