package own.dsa.BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array must be sorted 
		int arr [] = {0,1,2,3,4,5,6,7,8,9};
		int value = 9;
		System.out.println(binarySearch(value, arr));		

	}

	private static int binarySearch(int value, int[] arr) {
		// TODO Auto-generated method stub
		int hi = arr.length-1;
		if(arr == null || hi == 0) throw new RuntimeException("Invalid array");
		
		int low = 0;		
		//int loop = 0;
		while(low <= hi) {
			int mid =low + (hi-low)/2;
			//System.out.println(++loop);
			if(arr[mid] < value) 	{
				low = mid+1;
			}				
			else if(arr[mid] > value) {
				hi = mid -1;
			}
			else {
				return mid;				
			}
		}		
		return -1;
	}

}
