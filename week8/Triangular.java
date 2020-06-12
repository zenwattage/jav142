public class Triangular {
   
   public static int[] triangular(int n) {
     
     int[] nArray = new int[n];
            
      for(int i = 1; i < nArray.length ; i++)
      {
         for(int j = 1; j < i ; j++)
         {
            nArray[i] = j;
         }
         
      }
     return nArray;
   }
    
    
   public static void main(String[] args)
   {
      System.out.println(triangular(5));

         // int test = 5;
//          
//          int[] nArray = new int[test];
//          
//          for(int i = 1; i <= nArray.length ; i++)
//          {
//             for(int j = 1; j < i ; j++)
//             {
//                System.out.print(j);
//             }
//             
//          }
   } 
}