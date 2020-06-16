import java.util.ArrayList;
public class MaxRun 
{

   public static void main(String[] args)
   {
      String s = "xgaeioubzqfl";
      char one;
      char two;
      char[] sa = s.toCharArray();
      ArrayList<Character> list = new ArrayList<Character>(); 
      for(int i = 0; i < s.length() - 1; i++)
      {
         if(s.charAt(i) < s.charAt(i+1) && s.valueOf(s.charAt(i)) != s.valueOf(s.charAt(i+1)))
         {
            list.add(s.charAt(i));
         }
      }   
      
      System.out.println(list);
   }


}