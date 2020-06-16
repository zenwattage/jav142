import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListsTesting
{
   //linked list is good for collection when you plan on adding and deleting objects from 
   // without using indexes
   public static void main(String[] args)
   {
      LinkedList linkedlistOne = new LinkedList();
      
      //calling constuctor file for linked list
      LinkedList<String> names = new LinkedList<String>();
      
      names.add("John Smith");
      names.add("Fred Flint");
      
      //add at end
      names.addLast("Bill Balls");
      
      //add at first
      names.addFirst("Josh Smith");
      
      names.add(0, "Noah Peters");
      
      names.set(2, "Paul Newman");
      
      names.remove(4);
      names.remove("Josh Smith");
      
      System.out.println("\nFirst Index: " + names.get(0));

      System.out.println("\nFirst Index: " + names.getLast());
      
      LinkedList<String> nameCopy = new LinkedList<String>(names);
      
      System.out.println("\nName Copy: " + nameCopy);
      
      if(names.contains("Paul Newman")){
         System.out.println("\n Paul's here");
      }
      
      if(names.containsAll(nameCopy))
      {
         System.out.println("\nCollections the same");
      }
      
      System.out.println("\nPaul Newman at: " + names.indexOf("Paul Newman"));
      
      System.out.println("\nList Empty: " + names.isEmpty());
      
      System.out.println("\nHow Many: " + names.size());
      //check if there is a first element - if not null
      System.out.println("\nLook without Error: " + names.peek());
      //takes first element, prints, then deletes it from list
      System.out.println("\nRemove first element: " + nameCopy.poll());
      //same but take last
      System.out.println("\nRemove first element: " + nameCopy.pollLast());
      
      nameCopy.push("Noah Peters");
      //remove first element
      nameCopy.pop();
      
      for(String name : nameCopy)
      {
         System.out.println(name);
      }  
      
      Object[] nameArray = new Object[4];
      nameArray = names.toArray();
      
      System.out.println(Arrays.toString(nameArray));
      
      //delete entire list
///      names.clear();

   
   }



}