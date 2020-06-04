public class tester {


   public static void main(String[] args)
   {
      
      int[] nums = new int[] {3,5,2,3,3};
      
      for(int i = 0; i < nums.length; i++)
      {
         System.out.println("first: " + nums[i]);
         if(nums[i] == 3)
         {
            continue;
         }
         System.out.println("second: " + nums[i]);
      }
   }

}