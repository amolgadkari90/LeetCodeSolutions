package easy.ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
	
	

	public static void main(String[] args) {
		
		String  s = "()";
		boolean status = isValid( s);
		System.out.println("String: " + s +" is "+status); // true
		
		 s = "()[]{}";
		status = isValid( s);
		System.out.println("String: " + s +" is "+status); // true
		
		 s = "(]";
		status = isValid( s);
		System.out.println("String: " + s +" is "+status); // false
		
		 s = "([])";
			status = isValid( s);
			System.out.println("String: " + s +" is "+status); // true
			
			
			 s = "([)]";
				status = isValid( s);
				System.out.println("String: " + s +" is "+status); // false
				
				 s = "()[]{}";
					status = isValid( s);
					System.out.println("String: " + s +" is "+status); // false

	}
	
	public static boolean isValid(String s) {
		
		if (s == null )
			return false;
		
		Deque<Character> queue = new ArrayDeque<>();
		
		for (char ch : s.toCharArray()) {
			if(ch == '(' || ch == '[' || ch == '{') {
				queue.push(ch);		
				
			} else {
				
				if(queue.isEmpty())
					return false;
				char top = queue.pop();
				
				if(		ch == ')' && top != '(' ||
						ch == ']' && top != '[' ||
						ch == '}' && top != '{'					
						)
					return false;		
			}
		}   
        	
		return (queue.isEmpty());
        }  


}
