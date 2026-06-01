package own.naukri.ArrayRotation;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		int[ ]arr = {5, 4, 3, 1 , 2};		
//		System.out.println(bfArrayRotation(arr));		
//		System.out.println("**************");		
//		System.out.println(search(arr));
		
		//for profiling to check which algo is more efficient 

	    int[] arr = new int[10000];

	    // Fill array
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = arr.length - i;
	    }

	    System.out.println("Process running... attach VisualVM now");

	    while (true) {
	        bfArrayRotation(arr);
	        search(arr);
	    }

	}
	// Brute-force method 
	private static int bfArrayRotation(int[] arr)  {
		// TODO Auto-generated method stub
		if(arr.length <= 1) throw new RuntimeException("Invalid Array length!...");
		int index = 0;
		int minNumber = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {			
			if(minNumber > arr[i] ) {
				minNumber = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	//Binary search 
	
	public static int search(int[] arr) {
		
		 int lo = 0;
	        int hi = arr.length - 1;

	        while(lo < hi){
	            int mid = (lo + hi) /2;
	            if(arr[mid] > arr[hi]){
	                lo = mid+ 1;
	            } else{
	                hi = mid;
	            }
	        }
	        return lo;
	  
	    
	}

}
