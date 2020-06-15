package sortingImpl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BubbleSortImpl {
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
    
    void bubbleSort(float arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                	float temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
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
        BubbleSortImpl object1 = new BubbleSortImpl();
        ArrayConversion object2 = new ArrayConversion();
        BubbleSortImpl object3 = new BubbleSortImpl();
        

        float[][] pixelArray = object1.convertRGB(image);
        float[][] sortedPixelArray = new float[317][158];

    
        float[] pixel1D = object2.convertDim(pixelArray);

        object3.bubbleSort(pixel1D);

       
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
