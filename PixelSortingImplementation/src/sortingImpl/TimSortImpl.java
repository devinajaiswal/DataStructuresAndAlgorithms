package sortingImpl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class TimSortImpl {
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

    public static void timSort(float [] array){
        int run = 4500;
        int length = array.length;
        for(int i = 0; i< length; i+=run)
        {
            
            insertionSort(array);
        }
        
        for (int size = run; size < length; size = 2 * size)
       {
           for (int left = 0; left < length; left += 2 * size)
           {
               
               int mid = Math.min(left + size - 1, length-1);
               int right = Math.min((left + 2 * size - 1), (length - 1));
               int arrayLength = array.length;
               merge(array, left, mid, right);
           }
       }
         System.out.println(Arrays.toString(array));
    }
    public static void insertionSort(float [] array){
        float length = array.length;
         float temp = 0;
         for(int i = 1; i < length ; i++){
            for(int j = i ; j > 0 ; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                } 
            }   
        }
        
    }
    public static void merge(float[] array, int l, int m, int r)
    {    
        int i = 0, j = 0, k = 0;
        int leftLength = m - l + 1, rightLength = r - m;
       float[] left = new float[leftLength];
       float[] right = new float[rightLength];
       for (int x = 0; x < leftLength; x++)
       {
           left[x] = array[l + x];
       }
       for (int x = 0; x < rightLength; x++)
       {
           right[x] = array[m + 1 + x];
       }
        while(i< left.length && j < right.length){
            if(left[i]<right[j]){
                array[k] = left[i];
                i++;k++;
            }
            else{
                array[k] = right[j];
                j++;k++;
            }
        }
        while(i< left.length){
            array[k] = left[i];
            i++;k++;
        }
        while(j < right.length){
            array[k] = right[j];
            j++;k++;
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
        TimSortImpl object1 = new TimSortImpl();
        ArrayConversion object2 = new ArrayConversion();
        TimSortImpl object3 = new TimSortImpl();
        
        
        float[][] pixelArray = object1.convertRGB(image);
        float[][] sortedPixelArray = new float[317][158];

       
        float[] pixel1D = object2.convertDim(pixelArray);
       
        object3.timSort(pixel1D);

       
        for(int i = 0; i< sortedPixelArray.length; i++){
            for(int j = 0; j< sortedPixelArray[0].length; j++)
            {
                sortedPixelArray[i][j] = pixel1D[i*158+j];
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
