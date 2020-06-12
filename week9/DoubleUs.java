public class DoubleUs {

   public static boolean doubleUs(String s) {
      
      String check = "uu";
      
      int mid = s.length() /2 - 1;
      
      System.out.println(s.charAt(mid + 1) );
      return false;
   }
   
   public static void main(String[] args)
   {
      System.out.println(doubleUs("vacuum"));
        
  }

}




// 
// public boolean doubleUs(String s) {
//     int j;
//     int idx = s.indexOf('u');
//      
//      if(s.equals("") || s.equals("uu"))
//      {
//       return true;
//      }
//      
//      for(int i = 1; i < s.length()-1 ; i++)
//      {
//       if(s.charAt(i) == 'u' && s.charAt(i - 1) == 'u')
//       {
//        return true;
//       }
//      }
//      
//     for(int k = s.length(); k > idx; k--)
//     {
//       
//       
//     }
//      
//     for(int i = 0; i < s.length(); i++)
//     {
//       if(s.charAt(0) == 'w')
//       {
//         return true;
//       }
//     }
//      
//      return false;
// 
// }