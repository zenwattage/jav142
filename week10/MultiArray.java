public class MultiArray {

   public static void main(String[] args)
   {
            
      String[][] multiArray = new String[10][10];
      
      for(int i = 0; i < multiArray.length; i++)
      {
         for(int j = 0; j < multiArray[i].length; j++)
         {
            multiArray[i][j] = i + " " + j;
         }
      }
      
      int k = 1;
      while(k <= 6)
      {
         System.out.print("-");
         k++;
      }
      System.out.println();
   
      for(int i = 0; i < multiArray.length; i++)
      {
         for(int j = 0; j < multiArray[i].length; j++)
         {
            System.out.print("| " + multiArray[i][j] + " ");  
         }
         System.out.println("|");
      }
      
      k = 1;
      while(k <= 6)
      {
         System.out.print("-");
         k++;
      }
      System.out.println("|");
   
   }

}