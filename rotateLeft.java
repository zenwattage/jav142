import java.util.Arrays;
/**
*@author Scott Hansford
*@version Codingbat : Arrays: rotateLeft
*/
public class rotateLeft {

     
   
   public static void main(String[] args)
   {
   
      int[] nums = new int[] {1, 3, 5, 7, 9};
      
      int[] resort = new int[nums.length];
      
      int temp;
      //shift indexes down 1
      // test[0] goes to the end test[array.length -1]
      //test [1] becomes test[0]
      // test [2] becomes test[1]
      // test [3] becomes test[2]
      
      resort[resort.length-1] = nums[0];
      
      temp = nums[0];
      
      for(int i = 1; i < nums.length; i++)
      {
         
         resort[i-1] = nums[i];
      }
      
      resort[nums.length-1] = temp;
      
      System.out.println(Arrays.toString(nums));
      System.out.println(Arrays.toString(resort));
   }
   
 }