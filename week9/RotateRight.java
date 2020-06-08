public class RotateRight 
{

   public static int[] rotateRight(int[] arr, int n)
   {
      
      for(int i = 0; i < n; i++)
      {
         int temp = arr[arr.length -1];
         
          for(int j = arr.length -1; j > 0; j--)
          {
            arr[j] = arr[j-1];
          }
             arr[0] = temp;
      }
          //   for(int check : arr)
//       {
//          System.out.println(check);
//       }
      
      return arr;
      
      // //System.out.print(arr[shift]);
//       for(int check : newList)
//       {
//          System.out.println(check);
//       }
//       
//       return newList;
   }

   public static void main(String[] args)
   {
      int[] list = new int[] {3,5,2,1};
      
      rotateRight(list, 3);
   }


}