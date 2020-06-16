//iterator example
import java.util.*;

public class IteratorExample {

   public static void showStringList(ArrayList<String> sList) {
       System.out.println( "Contents of the list:");
       Iterator<String> it = sList.iterator();
       while(it.hasNext()) {
           System.out.println("\"" + it.next() + "\"");
       }
   }
   
   public static int countAllCharacters(ArrayList<String> sList) {
       int total = 0;
       Iterator<String> it = sList.iterator();
       while(it.hasNext()) {
           total += it.next().length();
       }
       return total;
   }
   
   public static int countSpecificCharacters(ArrayList<String> sList,
                                             char c) {
       int count = 0;
       Iterator<String> it = sList.iterator();
       while(it.hasNext()) {
           String s = it.next();
           for(int pos = 0; pos < s.length(); pos++) {
               if(s.charAt(pos) == c) {
                   count++;
               }
           }
       }
       return count;
   }
   
   
   // public class void main(String[] args)
//    {  
//       
//    }
   
}