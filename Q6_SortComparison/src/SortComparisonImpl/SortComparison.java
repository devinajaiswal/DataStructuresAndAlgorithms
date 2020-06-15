package SortComparisonImpl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SortComparison {

	   
	static int width=318;
    static int height=159;
    static double intensity[];
    static BufferedImage imgage = null;
	
    public static double [] convertToRGB(BufferedImage img)
	{
	 int k=0;
	 double intensity[] = new double[width*height];
	 for(int x=0; x<img.getWidth(); x++) {
		 for(int y=0; y<img.getHeight(); y++) {
			 int rgb=img.getRGB(x, y);
			 int R=(rgb >>16) & 0xff;			
			 int G=(rgb >>8) & 0xff;
			 int B=rgb & 0xff;
	
			 double i =0.2989*R + 0.5870*G + 0.1140*B;
			 intensity[k]=i;
			 k++;
			
		 }
	 }
	 
	 return intensity;
	}

    
        
    public static void mergeSort(double a[],int low,int high)
	{
		if(low<high) {
			int mid=(low + high)/2;
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			merge(a,low,mid,high);
	}
}
        
    public static void merge(double a[],int low,int mid, int high)
    {    int left= mid+1-low;
         int right= high-mid;
    	double l[] = new double[left];
    	double r[] = new double[right];
    	for(int i =0;i<left;i++){
    		l[i]=a[low+i];
    	}
        
    	for(int j=0;j<right;j++){
    		r[j]=a[mid+1+j];
    	}
    
  	int i =0, j=0,f=low;
  	while (i < left && j < right){ 
        if (l[i] <= r[j]){ 
            a[f] = l[i]; 
            i++; 
        } 
        else{ 
            a[f] = r[j]; 
            j++; 
        } 
        f++; 
        } 
    	
    	while(i<left){
    		a[f]=l[i];
    		i++;
    		f++;
    	}
    	while(j<right){
    		a[f]=r[j];
    		j++;
    		f++;
    	}
    }


    

  
    public static void heapSort(double a[]) 
        { 
            int num = a.length; 
            for (int i = num / 2 - 1; i >= 0; i--) 
                heapify(a, num, i); 
     
            for (int i=num-1; i>=0; i--) 
            { 
                double temp = a[0]; 
                a[0] = a[i]; 
                a[i] = temp; 
                heapify(a, i, 0); 
            } 
        } 
      
    public static void heapify(double a[], int n, int i) 
        { 
            int largest = i; 
            int left = 2*i + 1; 
            int right = 2*i + 2; 
      
            if (left < n && a[left] > a[largest]) 
                largest = left; 

            if (right < n && a[right] > a[largest]) 
                largest = right; 
            if (largest != i) 
            { 
                double temp = a[i]; 
                a[i] = a[largest]; 
                a[largest] = temp; 
                heapify(a, n, largest); 
            } 
        } 
      

    
    public static void print(double a[]) 
    { 
        int n = a.length-1; 
        for (int i=n; i>0; i--) 
            System.out.println(a[i] + " "); 
       
    } 
	
    public static void main(String[] args) { 
		
        try {
		File iFile = new File("Boston.jpeg");
		
	    imgage =new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
	    imgage = ImageIO.read(iFile);
        
        }
	
	catch(Exception e) {
		System.out.println(e);
	}     
        double array[]=convertToRGB(imgage);	
        
        
       
        
        System.out.println("Merge Sort:");
     mergeSort(array, 0, array.length-1);
        
       
        
        System.out.println("Heap Sort:");
      heapSort(array);
        
     
        
        System.out.println();
        
        print(array);
	}
}
