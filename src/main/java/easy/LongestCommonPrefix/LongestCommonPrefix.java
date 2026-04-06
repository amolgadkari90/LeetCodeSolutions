package easy.LongestCommonPrefix;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String [] strs = {"flower","flow","flight"};		
		String [] strs1 = {"dog","racecar","car"};
		
		String longestCommonPrefix = longestCommonPrefix(strs);
		System.out.println("longestCommonPrefix "+  longestCommonPrefix);
		
		longestCommonPrefix = longestCommonPrefix(strs1);
		System.out.println("longestCommonPrefix "+  longestCommonPrefix);		

	}
	
	public static String longestCommonPrefix(String[] strs) {
		StringBuilder prefix = new StringBuilder ();
		String first = strs[0];
		
		//int index = 0; 
		for(int i = 1; i < strs.length; i++) {
			int j = 0;
			while(first.length()< j &&  strs[i+1].length() < j) {
				if(first.charAt(j)== strs[i].charAt(j)) {
					//index++;
					prefix.append(first.charAt(j));
					j++;					
				}
				else {					
									
					break;					
				}			
				
			}
		}
		
		return prefix.toString();
        
    }

}
