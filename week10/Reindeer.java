import java.util.Iterator;
/**
*@author Scott Hansford
*@version LA11: Reindeer
*/

/**
 * This is the starting point code for Lab: Reindeer.
 */
public class Reindeer {
    
    // The reindeer
    //private java.util.ArrayList reindeer;
    private java.util.Collection<String> reindeer;
    
    /**
     * Constructor, which you will write
     */
     public Reindeer() {
      reindeer = new java.util.ArrayList<String>();
     }
    
    /**
     * Add the names of the reindeer to the collection.
     */
    public void addReindeer() {
        reindeer.add("Dasher");
        reindeer.add("Dancer");
        reindeer.add("Prancer");
        reindeer.add("Vixen");
        reindeer.add("Comet");
        reindeer.add("Cupid");
        reindeer.add("Dunder");
        reindeer.add("Blixem");
    }
    
    /**
     * A simple method to print out the contents of
     * the collection.
     */
    public void print() {
        // for(Object o : reindeer) {
//             System.out.print(o + " ");
//         }
//         System.out.println();
         
         //using iterator
         Iterator<String> it = reindeer.iterator();
         
         while(it.hasNext())
         {
            System.out.print(it.next() + " " );
         }
         System.out.println();
      
    }
    
    /**
     * The application method, which you will write
     * @param args Command-line arguments
     */
     public static void main(String[] args)
     {
       Reindeer app = new Reindeer();
       System.out.println("Using an ArrayList...");
       app.addReindeer();
       app.print();
       
       System.out.println("Using a LinkedList...");
       app.reindeer = new java.util.LinkedList<String>();
       app.addReindeer();
       app.print();
       
       System.out.println("Adding again...");
       app.addReindeer();
       app.print();
       
       System.out.println("Using a hashed data structure...");
       app.reindeer = new java.util.HashSet<String>();
       app.addReindeer();
       app.print();
       
       System.out.println("Adding again...");
       app.addReindeer();
       app.print();
       
     }
    
}
