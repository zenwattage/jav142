public class ijTest {

   public static void main(String[] args){
      String test = "ijijijiji";
      String test2 = "jijijijij";
      String testj = "j";
      int jDx = 0;
      int count = 0;
      // for (char ch: test2.toCharArray()) {
//          System.out.println(ch);
//          if(ch == 'j'){
//             jDx++;
//             System.out.println(jDx);
//          }
//       }
      System.out.println(test2.lastIndexOf("i"));
      System.out.println(test2.lastIndexOf("j"));
      if(test2.lastIndexOf("i") < test2.lastIndexOf("j"))
      {
         System.out.println("true");
      }
      else {
         System.out.println("false");
      }
      // for(int i = 0; i < test.length(); i++)
//       {
//       
//          
//          if(test2.charAt(i) == 'j')
//          {
//             jDx = i;
//          }
//          //System.out.print(test.charAt(i));
//          System.out.print(test2.charAt(i));
//       }
    //  System.out.println(jDx);
//      System.out.println(testj.length());
   
   }
}