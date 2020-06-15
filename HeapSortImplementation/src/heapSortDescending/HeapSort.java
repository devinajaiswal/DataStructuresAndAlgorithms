package heapSortDescending;

public class HeapSort {
 public void heapify(int arr[], int n,int i) {
	 int highest=i;
	 int left=2*i+1;
	 int right=2*i+2;
	 
	 if(left<n && arr[left]>arr[highest])
		 highest=left;
	 if(right<n && arr[right]>arr[highest])
		 highest=right;
	    if (highest != i) 
        { 
            int temp = arr[i]; 
            arr[i] = arr[highest]; 
            arr[highest] = temp; 
  
            heapify(arr, n, highest); 
        } 
		 
 }
	public void swap(int a,int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
	public void heapSort(int arr[]) {
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		for(int i=n-1;i>=0;i--) {
			swap(arr[0],arr[i]);
			heapify(arr, n, 0);
		}
	}
	void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
