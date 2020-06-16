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
   
    // public static float[] posMaxMin(ArrayList<Float> vals)
//     {
//       int max, min;
//      
//       return floatArray;
//     }
     
   
    public static void main(String[] args)
    {
      float[] myArray = {2.3f, 1.4f, 3.2f, 5.4f, 2.2f,5.1f};
      float min = myArray[0];
      float max = 0;
      float[] newArray = new float[2];
      for(int i = 0; i <= myArray.length -1 ; i++)
      {
         if(myArray[i] < min){
            min = myArray[i];
         }
               
         if(myArray[i] > min && myArray[i] > max){
            max = myArray[i];            
         }         
      }
      
      newArray[0] = min;
      newArray[1] = max;

      System.out.println(Arrays.toString(newArray));
    }

}