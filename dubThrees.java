public class dubThrees
{

   

   public static void main(String[] args)
   {
      int[] nums = new int[] {3, 3, 7, 3, 1};
      
      
      int found = 0;
      
      for( int i = 0 ; i < nums.length; i++)
      {
         if(nums[i] == 3)
         {
            found++;
         }
      }
      
      for(int i = 0; i < nums.length -1 ; i++)
      {
         if(nums[i] == 3 && nums[i+1] == 3)
         {
            return false;
         }
      }
      return found == 3;
      
      
            
   }
   
}










// public boolean doubleThree(int[] nums) {
//    int last = 0;
//     int next = 0;
//     int broken = 0;
//     
//     for(int i = 0; i < nums.length; i++)
//     {
//       
//       
//       if(nums.length == 1 && nums[i] != 3)
//       {
//         return false;
//       }
//       if(nums.length <= 1 && nums[i] == 3)
//       {
//         return false;
//       }
//       
//       if(nums.length <= 2 && nums[i] != 3)
//       {
//         return false;
//       }
//       if(nums[i] == 3)
//       {
//         if(nums[i] != 3)
//         {
//           return false;
//         }
//         //System.out.println("i is: " + i + " num is: " + nums[i]);
//         last = i;
//         next = last + 1;
//         //System.out.println("last is: " + last);
//         //System.out.println("next is: " + next);
//         // if(next != 3)
//         //   {
//         //       return false;
//         // //       System.out.print("false");
//         // }
//         
//         if(nums[last+1] != nums[i])
//         {
//            broken = nums[i];
//            //System.out.println("broken: " + broken);
//            return false;
//         } 
//         if(nums[nums.length-1] == 3 && nums[nums.length - 2] !=3){
//           return false;
//         }
//         
//         
//        if(broken != 0)
//          {
//             return false;
//          }
//         else {
//           
//           return true;
//         }
//        }
//     }
//     return true;
//  
// }