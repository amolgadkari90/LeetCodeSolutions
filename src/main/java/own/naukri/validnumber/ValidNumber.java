package own.naukri.validnumber;

public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Check if number is valid 
		//+35e-10 = v 
		//35 = v 
		//.64 = v 
		//e = inv 
		//44- = Inv 
		//3.E830 = inval 
		//.631 = val 
		//rules
		//Digit valid = 35 //sign + digit = valid = +35 // . + digit = valid = .64(v), 0.64 (v), 64.0(v), // 64.(inv), 6.4.0 (inv), 6..4(inv) // digit + E/e + digit = 3e-10 valid // digit + E/e + sign +digit = 3e10 valid // Sign + digit + E/e + sign +digit = +3e-10 valid // Digit + . + e/E + Digit = invalid = 3.E-10, 4.e10 // Digit + Sign = invalid = 44- // e = invald //3e = invalid // 9.9 e4 = valid // e3 = invalid //9.9e0.5 = invalid //3ee10 = invalid //.e4 - false //--6 - false //1e - false //-.9 = true //99e2.5 - false //3e+5 =true //. = false //.9E-3 = true //abc = false //.9ea = false
		
		System.out.println(isValidNumber("+35e-10"));
	

	}
	
	public static String  isValidNumber(String s){
		 if (s == null || s.trim().isEmpty()) return "invalid";

		    s = s.trim();

		    boolean seenDigit = false;
		    boolean seenDot = false;
		    boolean seenE = false;
		    boolean digitAfterE = true;

		    for (int i = 0; i < s.length(); i++) {
		        char c = s.charAt(i);

		        if (Character.isDigit(c)) {
		            seenDigit = true;
		            if (seenE) digitAfterE = true;
		        }

		        else if (c == '+' || c == '-') {
		            if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
		                return "invalid";
		            }
		        }

		        else if (c == '.') {
		            if (seenDot || seenE) return "invalid";
		            seenDot = true;
		        }

		        else if (c == 'e' || c == 'E') {
		            if (seenE || !seenDigit) return "invalid";
		            seenE = true;
		            digitAfterE = false;
		        }

		        else {
		            return "invalid";
		        }
		    }

		    return seenDigit && digitAfterE ? "valid" : "invalid";		
	}
}
