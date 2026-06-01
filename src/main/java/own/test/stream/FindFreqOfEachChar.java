package own.test.stream;

import java.util.LinkedHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Find the frequency of each character using Java 8 Streams.
* Input: aaaabbbccdde
 * 
 */
public class FindFreqOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaaabbbccddea";
		
		LinkedHashMap<Character, Long> freq = str.chars()
			.mapToObj(c -> (char) c)
			.collect(
					Collectors.groupingBy(							
							c -> c,
							LinkedHashMap:: new,
							Collectors.counting()							
							)					
					);
		
		System.out.println(freq);

	}

}
