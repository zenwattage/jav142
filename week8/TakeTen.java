public class TakeTen
{

   public static int[] takeTen(int[] nums) 
   {
        int temp = 0;
        

         
         for(int i = 0; i < nums.length ; i++)
         {
            if(nums[i] != 10)
            {
               nums[temp++] = nums[i];
            }         
         }
         
         while(temp < nums.length)
         {
            nums[temp++] = 0;
         }
         
      
      return nums;
   }

   public static void main(String[] args)
   {
      int[] nums = new int[] {1,10,10,2};
      
      takeTen(nums);
   }

}
