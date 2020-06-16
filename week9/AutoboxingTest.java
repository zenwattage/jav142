import java.util.ArrayList;
import java.util.Iterator;
public class AutoboxingTest {


   public static void main(String[] args)
   {
   
      //(Note, this example uses the default generic parameter for ArrayList,
      // so it is necessary that the values from the ArrayList as cast to the desired type.)
      // construct the list and add an item
     /*
      ArrayList objectList = new ArrayList();
      objectList.add(new Integer(2));
      
      // retrieve item using the 'get' method
      int g1 = ((Integer)objectList.get(0)).intValue();
      
      // retrieve item using an iterator's 'next' method
      Iterator genIter = objectList.iterator();
      int g2 = ((Integer)genIter.next()).intValue(); 
     */ 
      
      
      /*
      generic make it possible to specify what type of data will be
       stored in a collection. 
      */
      // construct the list and add an item
      ArrayList<Integer> intList;
      intList = new ArrayList<Integer>();
      intList.add(new Integer(2));
      
      // retrieve item using the 'get' method
      int g1 = intList.get(0).intValue();
      
      // retrieve item using an iterator's 'next' method
      Iterator<Integer> intIter = intList.iterator();
      int g2 = intIter.next( ).intValue();     
      
      System.out.println(g2);
      System.out.println(g1);
      
      
      /*
      When one of the wrapper classes with a generic class like ArrayList,
      the underlying primitive type will be recognized when a type is for the generic class,
      in addition to the wrapper class itself — this feature is called autoboxing/autounboxing.
      Here's an example:
      */

       ArrayList<Integer> grades = new ArrayList<Integer>();
       // fill with values
       // autoboxing allows type int to be used here
       grades.add(86);
   
       // autounboxing converts the return type to int
       int firstScore = grades.get(0);
   
       // Find average grade
       int sum = 0;
       Iterator<Integer> it = grades.iterator();
       while (it.hasNext()) {
           // autounboxing allows next to return type int
           sum += it.next();
       }
       
       double average = (double)sum / grades.size(); 
       
       System.out.println(average);
   }

}