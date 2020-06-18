 import java.util.ArrayList;
 import java.util.Arrays;
 /** 
   * Given a List of floats, the posMaxMin method returns the minimum and 
   * maximum positive values from the list in a two-element array, with the
   * minimum positive value as the first element and the maximum positive
   * value as the second element. When there are no positive elements in the
   * List, the return array contains two zeroes. 
   * @param vals The List to be searched. 
   * @return The array with the minimum and maximum positive values of the given List.
 */
 
 public class PosMaxMin
 {
   
    public static float posMaxMin(java.util.List<Float> vals)
    {
      float min = 0;
      float max = 0;
      float[] newArray = new float[2];
      
      if(vals.get(0) > 0f)
      {
         min = vals.get(0);
      }
      
      for(int i = 0; i <= vals.size() -1 ; i++)
      {
         if( vals[i] < min && vals[i] > 0){
            min = vals[i];
         }
               
         if(vals[i] > min && vals[i] > max && vals[i] > 0){
            max = vals[i];
         }         
      }
      
      vals[0] = min;
      vals[1] = max;
      
      return vals;
    }
     
   
    public static void main(String[] args)
    {
      //float[] myArray = {2.3f, 1.4f, 3.2f, 5.4f, 2.2f,5.1f};
      float[] myArray = {-3.2f, -1.4f, -2.5f, -4.1f};
      
   
      posMaxMin(myArray);
    }

}