

public class testThree {

   public static boolean doubleThree(int[] nums) {
      
      int count = 0;
      for(int i = 0; i < nums.length; i++)
      {
         count++;
      }
      
      int[] idxArray = new int[count];
      
      for(int i = 0; i < nums.length; i++)
      {
         if(nums[i] == 3)
         {
            idxArray[i] = i;
         }
      }
      
      int[] countArr = new int[count];
      for(int i = 0; i < countArr.length; i++)
      {
         countArr[i] = i;
      }
      
      for(int i = 0; i < idxArray.length; i++)
      {
         if(idxArray[i] != countArr[i])
         {
            return false;
         }
      }
            
      return true;
   }
   
   
   public static void main(String[] args)
   {
      int[] nums = new int[] {3, 3, 2, 3};
      doubleThree(nums);      
      
   
   }

}