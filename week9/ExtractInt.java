import java.util.ArrayList;
public class ExtractInt
{
    // public static int extractInt(String str) {
//       // int foo;
// //       for(int i = 0; i < str.length(); i++)
// //       {
// //          System.out.println(str
// //       }
// //       return foo;
 

   public static void main(String[] args)
   {
      String test = "aa1bc2d3";
      String nums = "";
      
      ArrayList<Integer> holder = new ArrayList<Integer>();
      //System.out.println(extractInt(test));
     
      for(int i = 0; i < test.length(); i++)
      {
         //System.out.println(test.charAt(i));
         if(Character.isDigit(test.charAt(i)))
         {
            
           nums += test.charAt(i);
         }
      }
      int ints = Integer.parseInt(nums);
      System.out.println(nums);
      System.out.println(foo);

   }

}