package easy.FindCommonCharacters;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

	public static void main(String[] args) {
		String [] words = {"bella","label","roller"};
		List<String> result = commonChars(words);  // Output: ["e","l","l"]
		result.stream().forEach(x -> System.out.print(x + " , "));
		System.out.println();
		
		String [] words1 = {"cool","lock","cook"};
		List<String> result1 = commonChars(words1);  // Output: ["c","o"]
		result1.stream().forEach(x -> System.out.print(x + " , "));
		

	}	
	
	public static List<String> commonChars(String[] words) {

        int[] min = new int[26];

        for(int i = 0; i < words[0].length(); i++){
            char ch = words[0].charAt(i);
            min[ch - 'a']++;
        }

        for(int arr = 1; arr < words.length; arr++){
            int[] curr = new int[26];

            for(int j = 0; j < words[arr].length(); j++){
                char ch = words[arr].charAt(j);
                curr[ch - 'a']++;
            }  
            
            for(int k = 0; k < min.length ; k++){
                min[k] = Math.min(min[k], curr[k]);
            }
        }
        List<String> result = new ArrayList<>();

        for(int l = 0; l < min.length; l++){
            int c = min[l];
            if(c > 0){
                while(c != 0){
                    result.add(String.valueOf((char) (l + 'a')));
                    c--;
                }
            }      
        } 
        return result;     
    }
	
	
	
}
