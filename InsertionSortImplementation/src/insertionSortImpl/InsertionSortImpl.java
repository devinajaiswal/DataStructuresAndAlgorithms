package insertionSortImpl;

public class InsertionSortImpl {
	
		void insertionSort(int array[]) 
		{ 
			int arrayLength = array.length; 
			for (int i = 1; i < arrayLength; ++i) { 
				int key = array[i]; 
				int j = i - 1; 

				
				while (j >= 0 && array[j] > key) { 
					array[j + 1] = array[j]; 
					j = j - 1; 
				} 
				array[j + 1] = key; 
			} 
		} 

		
		static void printArray(int arr[]) 
		{ 
			int n = arr.length; 
			for (int i = 0; i < n; ++i) 
				System.out.print(arr[i] + " "); 

			System.out.println(); 
		} 

	
		public static void main(String args[]) 
		{ 
			int array[] = {11,27,43,38,3,9,82,10,21,8,34,19,6};
			System.out.println("Unsorted array is: ");
			printArray(array); 

			InsertionSortImpl ob = new InsertionSortImpl(); 
			ob.insertionSort(array); 
			System.out.println("Sorted array is: ");
			printArray(array); 
		} 
	} 


