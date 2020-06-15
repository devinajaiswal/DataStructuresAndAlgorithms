package heapSortDescending;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]={11, 27, 43, 38, 3, 9, 82, 10, 21, 8, 34, 19, 6};
   int n= arr.length;
   System.out.println("Array befor sorting: ");
   
   HeapSort hp=new HeapSort();
   hp.printArray(arr);
   hp.heapSort(arr);
   
  System.out.println(" "); 
  System.out.println(" "); 
  System.out.println("Array After sorting via heapsort in Descending order : ");
  hp.printArray(arr);
  
		
		
		
		
		
	}

}
