package sortingImpl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class QuickSortImpl {
	  public float[][] convertRGB(BufferedImage img){
		    float[][] pixels = new float[img.getWidth()][img.getHeight()];

		    for (int x = 0; x < img.getWidth(); x++){
		        for (int y = 0; y < img.getHeight(); y++){
		            int rgb = img.getRGB(x, y);
		            int r = (rgb >> 16) & 0xFF;
		            int g = (rgb >> 8) & 0xFF;
		            int b = (rgb & 0xFF);
		            float i = (float) (0.2989*r + 0.5870*g + 0.1140*b);
		            pixels[x][y] = i;
		        }
		    }
		    return pixels;
		}
	  public static void swap(float a[], int x, int y){
		  float temp = a[x];
	        a[x] = a[y];
	        a[y] = temp;
	    }
	    
	  public static void quickSort(float a[], int low, int high){
	        if(a == null || a.length == 0){
	            return;
	        }
	        
	        if(low >= high){
	            return;
	        }
	        
	        int mid = low + (high-low)/2;
	        float pivot = a[mid];
	        
	        int i = low, j = high;
	        while (i <= j){
	            while (a[i] < pivot)
	            {
	                i++;
	            }
	            
	            while (a[j] > pivot)
	            {
	                j--;
	            }
	            
	            if (i <= j)
	            {
	                swap (a, i, j);
	                i++;
	                j--;
	            }
	        }
	        if (low < j){
	            quickSort(a, low, j);
	        }
	        if (high > i){
	            quickSort(a, i, high);
	        }
	    }
	    public static void main(String[] args) throws IOException {
	    	long startTime=System.nanoTime();
	        BufferedImage image = null;File f = null;
	        try {
	            f = new File("Boston.jpeg");
	            image = ImageIO.read(f);
	        } 
	        catch (IOException e){
	            System.out.println(e);
	        }
	        QuickSortImpl object1 = new QuickSortImpl();
	        ArrayConversion object2 = new ArrayConversion();
	        QuickSortImpl object3 = new QuickSortImpl();
	       
	        float[][] pixelArray = object1.convertRGB(image);
	        float[][] sortedPixelArray = new float[317][158];

	    
	        float[] intensity1D = object2.convertDim(pixelArray);
	      
	        quickSort(intensity1D, 0, intensity1D.length-1);

	 
	        for(int i = 0; i< sortedPixelArray.length; i++){
	            for(int j = 0; j< sortedPixelArray[0].length; j++)
	            {
	                sortedPixelArray[i][j] = intensity1D[i*158+j];
	            }
	        }
	   
	        for(int m = 0; m< sortedPixelArray.length; m++){
	            for(int n = 0; n< sortedPixelArray[0].length; n++){
	                System.out.print(sortedPixelArray[m][n] + "  ");
	            }
	            System.out.println();
	        }
	        long endTime= System.nanoTime();
	        long timeElapsed= endTime-startTime;
	        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
	    }
}
