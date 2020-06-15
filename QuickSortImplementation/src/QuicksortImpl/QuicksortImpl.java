package QuicksortImpl;

import java.util.Arrays;

public class QuicksortImpl {
    public static void main(String [] args){
        int [] array  = {11,27,43,38,3,9,82,10,21,8,34,19,6};
        System.out.println(" Unsorted array: "+ Arrays.toString(array));
        quickSort(array, 0, (array.length-1));
        System.out.println(" Sorted array: "+Arrays.toString(array));
        
    } 
    
    public static void quickSort(int[] array, int startIndex, int endIndex){
        if(startIndex < endIndex){
        int partitionIndex = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, partitionIndex-1);
        quickSort(array, partitionIndex+1, array.length-1);
        }
    }
    
    public static int partition(int[] array, int startIndex, int endIndex){
        int pivot = array[endIndex];
        int partitionIndex = startIndex;

        for(int i = startIndex; i <= endIndex-1 ; i++){
            if(array[i] <= pivot){
                int temp = array[partitionIndex];
                array[partitionIndex] = array[i];
                array[i] = temp;
                partitionIndex++;
            }
        }
        
        int temp2 = array[partitionIndex];
        array[partitionIndex] = array[endIndex];
        array[endIndex] = temp2;
        
        return partitionIndex;
    }
    
}
