/**
*
*@author Scott Hansford
*@version CodingBat: doubleThree
*/

/**
*Given an array of ints, return true if every 3 that appears
* in the array is next to another 3.
*
*/
public class DoubleThree {

   public static boolean doubleThree(int[] nums) {
  
  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] != 3)
    {
      continue;
    }
    
    if(i > 0 && nums[i -1 ] == 3)
    {
      continue;
    }
    
    if( i < nums.length-1 && nums[i+1] == 3)
    {
      continue;
    }
    
    return false;
    
  }
  
  return true;
 
} //end of method

   public static void main(String[] args)
   {
      int[] nums = new int[] {4, 3, 3, 2, 4, 5, 3};
      System.out.println(doubleThree(nums));
   
        
      
   }//end of main
         
}//end of class