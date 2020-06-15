package HeapSortAscending;

public class HeapSortAscending {
	public void sort(int arr[]) 
    { 
        int n = arr.length; 
  
    
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  
        
        for (int i=n-1; i>0; i--) 
        { 
            
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
       
            heapify(arr, i, 0); 
        } 
    } 
  
 
    void heapify(int arr[], int n, int i) 
    { 
        int lowest = i; 
        int left = 2*i + 1;
        int right = 2*i + 2; 
  
 
        if (left < n && arr[left] > arr[lowest]) 
            lowest = left; 
  
       
        if (right < n && arr[right] > arr[lowest]) 
            lowest = right; 
  
        if (lowest != i) 
        { 
            int temp = arr[i]; 
            arr[i] = arr[lowest]; 
            arr[lowest] = temp; 
  
        
            heapify(arr, n, lowest); 
        } 
    } 
  

    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
  
  
}
