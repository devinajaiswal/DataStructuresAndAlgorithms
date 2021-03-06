package MergeSortImplementation;

public class MergeSort {
	  void merge(int arr[], int l, int m, int r) 
	    { 
	        System.out.println("Push merge (arr," + l + "," + m + "," + r + ")");
	     
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        int left[] = new int [n1]; 
	        int right[] = new int [n2]; 
	  
	        for (int i=0; i<n1; ++i) 
	            left[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            right[j] = arr[m + 1+ j]; 
	 
	        int i = 0, j = 0; 
	  
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (left[i] <= right[j]) 
	            { 
	                arr[k] = left[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = right[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        while (i < n1) 
	        { 
	            arr[k] = left[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        while (j < n2) 
	        { 
	            arr[k] = right[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	  
	    void sort(int arr[], int l, int r) 
	    { 
	        System.out.println("Push mergeSort (arr," + l + "," + r+ ")");
	        if (l < r) 
	        { 
	            int m = (l+r)/2; 
	  
	            sort(arr, l, m); 
	            System.out.println("Pop mergeSort (arr," + l + "," + m  + ")");
	            sort(arr , m+1, r); 
	            int x = m+1;
	            System.out.println("Pop mergeSort (arr," + x + "," + r + ")");
	  
	            merge(arr, l, m, r); 
	            System.out.println("Pop merge (arr," + l + "," + m + "," + r + ")");
	        } 
	    } 
	  
	    static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
	  
	    
	    public static void main(String args[]) 
	    { 
	        int arr[] = {11, 27, 43, 38, 3, 9, 82, 10, 21, 8,34,19,6}; 
	  
	        System.out.println("Array: "); 
	        printArray(arr); 
	  
	         
	        MergeSort ms = new MergeSort(); 
	        ms.sort(arr, 0, arr.length-1); 
	  
	        System.out.println();
	        System.out.println("Sorted array: "); 
	        
	        printArray(arr); 
	        
	    } 
}
