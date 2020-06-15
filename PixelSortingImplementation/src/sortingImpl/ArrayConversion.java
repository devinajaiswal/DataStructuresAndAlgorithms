package sortingImpl;

public class ArrayConversion {
	   
    public float[] convertDim(float[][] array)
    {
        int width = array.length;
        int height = array[0].length;
        float[] result = new float[317*158];
        result[0] = array[0][0];
        result[1] = array[317][158];
        int i = 0;
        while(i!= 317*158){
            for(int j = 0; j< width-1; j++){
                for(int k = 0; k< height-1; k++){
                    result[i] = array[j][k];
                    i++;
                }
            }
        }
        return result;
    }
}
