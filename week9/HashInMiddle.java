public class HashInMiddle 
{

   public static boolean hashInTheMiddle(String s) {
     String hash = "###";
     int mid = s.length() / 2 -1;
     
     if(s.length() >= 3 && (s.substring(mid, mid+3).equals("###") ||
     (s.length()%2 == 0 && s.substring( mid - 1, mid + 2).equals("###"))))
     {
       return true;
     }
     
      return false;
   }

   public static void main(String[] args)
   {
      System.out.println(hashInTheMiddle("aaa###bb")); //true
      System.out.println(hashInTheMiddle("a###bbb")); //false
   }

}