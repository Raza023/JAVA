public class App {
    public static void main(String args[]){   
    	
    	//interpolation search =  improvement over binary search best used for "uniformly" distributed data
    	//					     "guesses" where a value might be based on calculated probe results
    	//				             if probe is incorrect, search area is narrowed, and a new probe is calculated
    	
    	//						  average case: O(log(log(n)))
    	//						  worst case: O(n) [values increase exponentially]

    	int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    	
    	int index = interpolationSearch(array, 8);
    	
    	if(index != -1) {
    		System.out.println("Element found at index: "+ index);
    	}
    	else {
    		System.out.println("Element not found");
    	}
    }

	private static int interpolationSearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length - 1;
		
		while(target >= array[low] && target <= array[high] && low <= high)
		{	
			int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

			int value = array[probe];
			
			System.out.println("value at probe: " + value + " with probe: "+probe);
			
			if(value < target) low = probe + 1;
			else if(value > target) high = probe - 1;
			else return probe;
		}
		
		return -1;
	}
}


/*
On Best case O(1)
On average case log(log(n)) 
On the worst case O(n) (for instance where the numerical values of the keys increase exponentially)
*/
