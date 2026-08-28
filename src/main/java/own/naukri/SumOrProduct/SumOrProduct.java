package own.naukri.SumOrProduct;

public class SumOrProduct {
	private static long MOD = 1000000007L;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Result: " + sumOrProduct(4, 1) );
		System.out.println("***************************");
		
		System.out.println("Result: " + sumOrProduct(4, 2) );
		System.out.println("***************************");
		
		System.out.println("Result: " + sumOrProduct(5, 1) );
		System.out.println("***************************");
		
		System.out.println("Result: " + sumOrProduct(5, 2) );
		System.out.println("***************************");

	}
	
	
	public static long sumOrProduct(int n, int q) {
		if(q == 1) {
			return (long) (n * (n+1)/2);
		} else {
			long product = 1;
			for(int i = 2; i <= n; i++) {
				product = (product * i) % MOD;
			}
			return product;
		}		
	}
}
