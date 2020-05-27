import java.util.Arrays;
/**
*@author Scott Hansford
*@version Codingbat : Arrays: threeThrees
*/

public class threeThrees {
   
   public static void main(String[] args) 
   {
      int[] nums = new int[] {3, 4, 3, 3, 4};
      
      //count 3
      int count = 0;
      int found = 0;
      int temp = 0;
      
      for(int check : nums)
      {
         if(check == 3)
         {
            count++;
            
         }        
         
      }
      
      if(count == 3)
      {
         for(int i = 0; i < nums.length; i++)
         {
            if(nums[i - 1] == 3 && nums[i] == 3)
            {
               yep = false;
            }
         }
      }
      
   }
}