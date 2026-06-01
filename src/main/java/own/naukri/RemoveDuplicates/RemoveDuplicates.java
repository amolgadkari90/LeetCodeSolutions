package own.naukri.RemoveDuplicates;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "baabbsbbahsahbahshhbhsjjjj";
		System.out.println(removeConsecutiveDuplicates( s));
		System.out.println("********");
		System.out.println(efficientRemoveConsecutiveDuplicates( s));
		
	}
	
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here

		StringBuilder sb = new StringBuilder();
	    char prev = s.charAt(0);
	    sb.append(prev);

	    for (int i = 1; i < s.length(); i++) {
	        char curr = s.charAt(i);
	        if (curr != prev) {        
	            sb.append(curr);
	            prev = curr;           
	        }
	    }
	    return sb.toString();
	}
	
	public static String efficientRemoveConsecutiveDuplicates(String s) {		
		if (s == null || s.isEmpty()) return "";		
		StringBuilder sb = new StringBuilder();		
		sb.append(s.charAt(0));
		for(int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != sb.charAt(sb.length() - 1) )
				sb.append(c);	
		}		
		return sb.toString();		
	}
	
}
