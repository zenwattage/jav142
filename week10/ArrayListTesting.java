import java.util.ArrayList;

/**
*
* ArrayList testing
*
*/

public class ArrayListTesting {

   
   
   
   public static void main(String[] args)
   {
      ArrayList<String> dwarves = new ArrayList<String>();
      dwarves.add("zulu");
      dwarves.add("brumpy");
      dwarves.add("cappy");
      dwarves.add("doc"); 
      
      String str1 = dwarves.get(0);
      String str2 = dwarves.get(1);
      String str3 = dwarves.get(3);
      String a = "a";
      String b = "b";
      int test = str2.compareTo(str1);
      int test2 = a.compareTo(b);
      System.out.println(test2);
     
      // System.out.println(str2.compareTo(str3));
//       System.out.println(str3.compareTo(str2));
//       System.out.println(str3.compareTo(str1));
//       System.out.println(str1.compareTo(str3));
//       System.out.println(str1.compareTo(str2));
//       
//       
//       System.out.println("value of: " + String.valueOf(str2));
     
      //dwarves.forEach((dwarf) -> System.out.println(dwarf));
//       String first,next;
//       String temp = "";
//       for(int i = 1 ; i < dwarves.size(); i++)
//       {
//          int j = i;
//          
//          String toInsert = dwarves.get(i);         
//          next = dwarves.get(i);
//          first = dwarves.get(i-1);
//          System.out.println("first:" + first);
//          //System.out.println(dwarves.get(i).compareTo(next));
//          
//          System.out.println(first.compareTo(next));
//          System.out.println("next: " + next);
//          //System.out.println("next" + next.compareTo(first));
//          //System.out.println("first: " + first);
//          // while((next > 0 && first > )
// //          {
// //             System.out.println("flip");
// //             temp = next;
// //             next = first;
// //             first = temp;
// //          }
//          
//          System.out.println(temp);
//          
//       }
//       
//       dwarves.forEach((dwarf) -> System.out.println(dwarf));
   }

}