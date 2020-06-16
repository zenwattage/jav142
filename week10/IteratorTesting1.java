import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTesting1 {
      
   public static void main(String[] args)
   {
      ArrayList arrayListOne = new ArrayList();
      
      ArrayList<String> names = new ArrayList<String>();
      names.add("John Smith");
      names.add("Tits McGee");
      names.add("Bob Jones");
      
      names.add(2, "Jack Ryan");
      
      
      //replace john smith with john adams
      names.set(0, "John Adams");
      
      //remove 3rd
      names.remove(3);
      
      //names.removeRange(0,1);
      
      for(int i =0; i < names.size(); i++)
      {
         System.out.println(names.get(i));
      }
      
      
      for(String i : names)
      {
         System.out.println(i);
      }
      
      //use iterator to print all names
      Iterator indivItems = names.iterator();
      
      while(indivItems.hasNext())
      {
         System.out.println(indivItems.next());
      }
      
      ArrayList nameCopy = new ArrayList();
      ArrayList nameBackup = new ArrayList();
      //copy array
      nameCopy.addAll(names);
      
      
      String paulYoung = "Paul Young";
      
      names.add(paulYoung);
      
      if(names.contains(paulYoung))
      {
         System.out.println("paul is here");
      }
      
      //does names contain everything in nameCopy
      if(names.containsAll(nameCopy))
      {
         System.out.println("Everything is here!");
      }
      
      names.clear();
      
      if(names.isEmpty())
      {
         System.out.println("ArrayList is empty");      
      }
      
      Object[] moreNames = new Object[4];
      
      moreNames = nameCopy.toArray();
      
      System.out.println(Arrays.toString(moreNames));
      
   } 
}