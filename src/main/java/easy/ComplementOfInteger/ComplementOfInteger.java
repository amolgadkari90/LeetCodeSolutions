package easy.ComplementOfInteger;

public class ComplementOfInteger {

	public static void main(String[] args) {
		
		int n = 5 ;		
		int complement = bitwiseComplement(n);		
		System.out.println("bitwiseComplement: "+ complement); // 2
		
		n = 7 ;		
		complement = bitwiseComplement(n);		
		System.out.println("bitwiseComplement: "+ complement); // 0
		
		n = 10 ;		
		complement = bitwiseComplement(n);		
		System.out.println("bitwiseComplement: "+ complement);// 5

	}

	
public static int bitwiseComplement(int n) {
	
	//System.out.println(~n);
	
	if(n == 0 ) return 1;
	
	int mask = Integer.highestOneBit(n) *2 -1;
	
		return  n ^ mask ;
        
    }
}
