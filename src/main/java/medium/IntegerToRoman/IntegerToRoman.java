package medium.IntegerToRoman;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result =  intToRoman(1994);
	    System.out.println(result);
	    
		result =  intToRoman(58);
	    System.out.println(result);
	    
		result =  intToRoman(3749);
	    System.out.println(result);
	    
		result =  intToRoman(0);
	    System.out.println(result);
	    
		result =  intToRoman(4000);
	    System.out.println(result);
		

	}

	private static String intToRoman(int num) {
		// TODO Auto-generated method stub
		
		//Create symbol array 
		String [] s = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		//Create number array		
		int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		
		//Define result StringBuilder
		StringBuilder result = new StringBuilder();
		
		//Loop till end of numeric Array n[]
		for(int i = 0; i < n.length; i++) {
			//add string till  num >= n[i]
			while(num >= n[i]) {
				result.append(s[i]);
				num -= n[i];				
			}
		}		
		return result.toString();
	}
}
