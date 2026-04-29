package own.bodmas;

import java.util.Stack;

public class Bodmass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "2+3*4";
		System.out.println(bodmasCalculations(s));;
		

	}
	
	
	public static double  bodmasCalculations(String s) {
		
		/* Steps
		 * trim the string
		 * Check String if empty and check null
		 * Define stacks one for number and one for operation
		 * use for loop for to get each character 
		 * if char is digit or . add in numsString use string builder
		 * 
		 * */
				
		s=s.trim();
		if( s == null || s.isEmpty() ) return 0.0;
		
		Stack<Double> nums = new Stack<>();
		Stack<Character> ops = new Stack<>();
		
		for(int i = 0; i< s.length(); i++) {
			
			char c = s.charAt(i);
			//ignore spaces (important for real inputs like "2 + 3")
            if (c == ' ') continue;
			
			if(Character.isDigit(c) || c == '.') {
				StringBuilder sb = new StringBuilder();
				while(i < s.length() && (Character.isDigit(c) || c == '.')) {
					sb.append(c);
					i++;
					//read next char if this char is not last char
					if(i < s.length()) c = s.charAt(i);
					//else break the loop
					else break;
				}
				//pointer i is already incremented to one char above digit
				i--;
				nums.push(Double.parseDouble(sb.toString()));				
			}
			else if(c == '(') {
				ops.push(c);
			}
			else if(c == ')') {
				while(!ops.isEmpty() && ops.peek() != '(') {
					calculate(nums, ops);
				}
				if (!ops.isEmpty()) ops.pop(); // remove '('
			}
			else if (c == '+' || c == '-' || c == '*' || c == '/'){
				while(!ops.isEmpty() && precedance(ops.peek() ) >= precedance(c) ){
					calculate(nums, ops);					
				}
				ops.push(c);
			}		
			//fail fast for invalid characters
            else {
                throw new IllegalArgumentException("Invalid character: " + c);
            }
		}
		while(!ops.isEmpty()) {
			calculate(nums, ops);
		}
		//invalidate final result
        if (nums.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }
		return nums.pop();
	}


	private static int precedance(Character ops) {
		// TODO Auto-generated method stub
		if(ops == '-' || ops == '+') return 1;
		if(ops == '*' || ops == '/') return 2;		
		return 0 ;
	}


	private static void calculate(Stack<Double> nums, Stack<Character> ops) {
		// TODO Auto-generated method stub
		
		//safety check before popping
        if (nums.size() < 2) {
            throw new IllegalArgumentException("Invalid expression");
        }
		
		Double b = nums.pop();
		Double a = nums.pop();
		char op = ops.pop();
		
		switch(op) {
		case'+': nums.push(a+b); break;
		case '-': nums.push(a-b); break;
		case'*': nums.push(a* b); break;
		case'/':  //division by zero handling
        if (b == 0) throw new ArithmeticException("Division by zero");
        nums.push(a / b);
        break;		
		}
	}

}
