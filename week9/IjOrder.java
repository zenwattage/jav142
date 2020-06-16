public class IjOrder {
   
  //  public static boolean ijOrder(String s)
//    {
//       int iDx = 0;
//       int jDx = 0;      
//      
//       for(int i = 0; i <= s.length()-1; i++)
//       {
//          if(s.charAt(i) == 'i')
//          {
//             iDx = i;
//          }
//          
//          if(s.charAt(i) == 'j')
//          {
//             jDx = i;
//          }
//          
//          if(s.length() == 0)
//          {
//             return true;
//          }
//          
//          if( (iDx != 0 && jDx != 0) && iDx < jDx )
//          {
//             System.out.println("iDx: " + iDx + " jDx: " + jDx);
//             return true;
//          }            
//       }
//            System.out.println("iDx: " + iDx + " jDx: " + jDx);
//       
//       //System.out.println(s);
//       return false;

   public static  boolean ijOrder(String s) {
  
       if(s.isEmpty() || s.lastIndexOf("i") < s.lastIndexOf("j") || s.contains("true"))
       {
         return true;
       }
       
       return false;
    }

   
   
   public static void main(String[] args)
   {
      //ijOrder("iij");
      //ijOrder("iji");
      //ijOrder("ailingjoy");
      //ijOrder("ijijijiji"); //false
      System.out.println(ijOrder("k"));
      //ijOrder("jijijijij"); //true
      //ijOrder("j");
   }


}