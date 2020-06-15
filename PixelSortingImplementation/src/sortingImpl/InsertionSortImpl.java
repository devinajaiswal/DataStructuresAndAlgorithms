package sortingImpl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class InsertionSortImpl {
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
         System.out.println(Arrays.toString(array));
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
        InsertionSortImpl object1 = new InsertionSortImpl();
        ArrayConversion object2 = new ArrayConversion();
        InsertionSortImpl object3 = new InsertionSortImpl();
        
        
        float[][] pixelArray = object1.convertRGB(image);
        float[][] sortedArray = new float[317][158];

   
        float[] intensity1D = object2.convertDim(pixelArray);
    
        object3.insertionSort(intensity1D);


        for(int i = 0; i< sortedArray.length; i++){
            for(int j = 0; j< sortedArray[0].length; j++)
            {
                sortedArray[i][j] = intensity1D[i*158+j];
            }
        }
      
        for(int m = 0; m< sortedArray.length; m++){
            for(int n = 0; n< sortedArray[0].length; n++){
                System.out.print(sortedArray[m][n] + "  ");
            }
            System.out.println();
        }
        long endTime= System.nanoTime();
        long timeElapsed= endTime-startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        
    }
}
