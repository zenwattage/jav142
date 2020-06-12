public class ExtractInt
{

   public static void main(String[] args)
   {
      String test = "aa1bc2d3";
      int i = 0;
      int digit = 0;
      
      while(i < test.length())
      {
         System.out.println(test.charAt(i));
         
         i++;
      }
   }

}