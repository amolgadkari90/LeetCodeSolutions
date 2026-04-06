package easy.romanToInteger;

public class RomanToInteger {
	
	public static void main(String[] args) {
		
		String s = "MCMXCIV";
		
		int romanToInt = romanToInt(s);
		
		System.out.println(romanToInt);
		
		
	}
	
	 public static int romanToInt(String s) {
		 
		 if(s.isEmpty()) {
			 throw new IllegalArgumentException("String is empty!...");
		 }
		 
		 int total = 0;
	        int prev = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {

	            int curr = getValus(s.charAt(i));

	            if (curr < prev) {
	                total -= curr;
	            } else {
	                total += curr;
	            }

	            prev = curr;
	        }

	        return total;
	        
	    }
	 
	 
	 private static int getValus(char c) {
		 
		 switch (c) {
		 case 'I': return 1;
		 case 'V': return 5;
		 case 'X': return 10;
		 case 'L': return 50;
		 case 'C': return 100;
		 case 'D': return 500;
		 case 'M': return 1000;	 
		 }
		 return 0;		
		 
	 }

}
