package medium.string.longestsubstring;

public class LongestSubstring {

	public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabc")); 	// 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));  	// 1
        System.out.println(lengthOfLongestSubstring("pwwkew")); 	// 3        
        System.out.println(lengthOfLongestSubstring(""));       	// 0		
        System.out.println(lengthOfLongestSubstring("abba")); 	// 2

	}
	
	 public static int lengthOfLongestSubstring(String s) {

	        int [] lastSeen = new int[128];
	        int left = 0;
	        int maxLength = 0;
	        
	        for(int right = 0 ; right < s.length(); right++){
	            //take char
	            char c = s.charAt(right);

	            //update left

	            left = Math.max(left, lastSeen[c]);

	            // update maxLength

	            maxLength = Math.max(maxLength, right - left +1);

	            //update lastSeen
	            lastSeen[c] = right +1;
	        }
	    return maxLength;       
	        
	    }

}
