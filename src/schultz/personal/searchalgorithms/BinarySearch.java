package schultz.personal.searchalgorithms;

public class BinarySearch {
	
	public static void main(String[] args) {
		//			  0  1  2  3   4   5   6   7   8   9   10  11  12
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		
		System.out.println(binarySearch(list, 45));
	}
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		int mid = (low + high)/2;
		
		while(high >= low) {
			mid = (low + high)/2;
			
			if(key < list[mid])
				high = mid - 1;
			
			else if(key == list[mid])
				return mid;
			
			else
				low = mid + 1;
		}
		
		return -1;
	}

}
