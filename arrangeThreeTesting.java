import java.util.Arrays;
/**
*@author Scott Hansford
*SA6:coding bat testing
*/

public class arrangeThreeTesting {
   
   public static void main(String[] args) {
   
      int[] mynums = new int[] {5, 1, 7, 3, 7, 8, 1};
                              // [1, 5, 3]
      //get indexes
      int a = mynums[0];
      int b = mynums[mynums.length/2];
      int c = mynums[mynums.length - 1];
     
      int[] check = new int[] {a, b, c};  
      // 5, 3, 1   
      int[] sorted = new int[3];
      int temp;
      int temp2;
      //smallest, largest, middle
      for(int i = 0; i < check.length; i++)
      {
         for(int j = i + 1; j < check.length; j++)
         {
            if(check[i] > check[j])
            {
               temp = check[i];
               check[i] = check[j];
               check[j] = temp;                      
            }
            
         }
            
      }
      
      temp2 = check[1];
      check[1] = check[2];
      check[2] = temp2;
      
      
      System.out.println(Arrays.toString(check));
      
      
     
      
   }

}
// FINAL WORKING SOLUTION 
// 
// public int[] arrangeThree(int[] nums) {
//   
//   //get indexes
//     int a = nums[0];
//     int b = nums[nums.length/2];
//     int c = nums[nums.length - 1];
//    
//     int[] check = new int[] {a, b, c};  
//     // 5, 3, 1   
//     int[] sorted = new int[3];
//     int temp;
//     int temp2;
//     //smallest, largest, middle
//     for(int i = 0; i < check.length; i++)
//     {
//        for(int j = i + 1; j < check.length; j++)
//        {
//           if(check[i] > check[j])
//           {
//              temp = check[i];
//              check[i] = check[j];
//              check[j] = temp;                      
//           }
//           
//        }
//           
//     }
//     
//     temp2 = check[1];
//     check[1] = check[2];
//     check[2] = temp2;
// 
//   return check;
//   
//   
// }
