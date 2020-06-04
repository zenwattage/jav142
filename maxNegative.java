public class maxNegative
{

   public static void main(String[] args)
   {
      int[] list = new int[] {0, -9, -12, 6, 10, -15, 7};
      int max = 0;
            
      for(int i = 0; i < list.length; i++)
      {
        if(list[i] < 0)
        {
           if(max == 0 || list[i] > max)
           {
              max = list[i];
           }
        }
      }
      //return max;
      System.out.println(max);
   }

}