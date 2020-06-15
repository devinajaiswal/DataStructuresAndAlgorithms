package HeapSortAscending;

public class DriverClass {
	  public static void main(String args[]) 
	    { 
	        int arr[] = {11, 27, 43, 38, 3, 9, 82, 10, 21, 8, 34, 19, 6};
	        int n = arr.length; 
	  
	        System.out.println("Array before sorting: ");
	        HeapSortAscending hp = new HeapSortAscending(); 
	        hp.printArray(arr);
	        hp.sort(arr); 
	        System.out.println(" "); 
	        System.out.println(" "); 
	        System.out.println("Array after sorting via heapsort in ascending order: "); 
	       hp.printArray(arr); 
	    } 
}
