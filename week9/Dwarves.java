import java.util.ArrayList;
import java.util.*;

/**
*@author Scott Hansford
*@version LA10: Dwarves
*@version check
*/


/*
 * This is the starting point code for Lab: Dwarves.
 */
public class Dwarves {

  // The collect to hold the names
  private java.util.ArrayList dwarves;

  /**
   * Zero-Param constructor for the ArrayList
   *
   */

  public Dwarves() {
    dwarves = new ArrayList<>();
  }

  /**
   * Add the names of the dwarves to the collection.
   */
  public void addNames() {
    add("Doc");
    add("Grumpy");
    add("Happy");
    add("Sleepy");
    add("Bashful");
    add("Sneezy");
    add("Dopey");
  }

  /**
   * Add a single name to the collection
   * 
   * @param name The name to be added
   */
  public void add(String name) {
         dwarves.add(name);
  }

  /**
   * A simple method to print out the contents of the collection, using the get
   * method.
   */
  public void print() {
    System.out.println("Print out the list using the get method:");
    for (int i = 0; i < dwarves.size(); i++) {
      System.out.println(dwarves.get(i));
    }
    System.out.println();

  }

  /**
   * A second method to print out the contents of the collection, using an
   * explicit Iterator object.
   */
  public void print2() {
    System.out.println("Print out the list using the explicit iterator method:");
    Iterator<String> dwarf = dwarves.iterator();
    while (dwarf.hasNext()) {
      System.out.println(dwarf.next());
    }
    System.out.println();

  }

  /**
   * A third method to print out the contents of the collection, using an implicit
   * Iterator, the for-each loop.
   */
  public void print3() {
    System.out.println("Print out the list using the implicit iterator method:");
    for (Object check : dwarves) {
      System.out.println(check);
    }
    //dwarves.forEach((dwarf) -> System.out.println(dwarf));
    System.out.println();
  }

  /**
   * The application method
   * 
   * @param args Command-line parameters
   */
  public static void main(String[] args) {
    // instantiate the Dwarves class
    Dwarves theGuys = new Dwarves();
    long startTime = System.nanoTime();
      
      
    theGuys.addNames();
    theGuys.print();
    theGuys.print2();
    theGuys.print3();
    
    long endTime = System.nanoTime();
      
    long duration = (endTime - startTime); //divide by 1000000 to get milliseconds.
      System.out.println(duration);
  }

}
