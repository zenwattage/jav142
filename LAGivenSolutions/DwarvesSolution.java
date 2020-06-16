/*
 * Sample solution for Learning Activity: Dwarves.
 */
public class DwarvesSolution {

    // The collect to hold the names
//  private java.util.ArrayList dwarves;
    private java.util.ArrayList<String> dwarves;

    /**
     * Create the ArrayList for storage
     */
    public DwarvesSolution() {
        // instatiate the ArrayList
//     dwarves = new java.util.ArrayList();
        dwarves = new java.util.ArrayList<String>();
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
     * @param name The name to be added
     */
    public void add(String name) {
//     dwarves.add(name);
        // look for the place to insert the name
        java.util.ListIterator<String> iter = dwarves.listIterator();
        while(iter.hasNext()) {
            if(name.compareTo(iter.next()) < 0) {
                // back up one element
                iter.previous();
                // exit the loop
                break;
            }
        }
        // add the name at the current location
        iter.add(name);
    }

    /**
     * A simple method to print out the contents of
     * the collection, using the for loop.
     */
    public void print() {
        // print out the header
        System.out.println("Print out the list using the get method:");
        // work through the collection
        for(int i = 0; i < dwarves.size(); i++) {
            // print out each value
            System.out.print(dwarves.get(i) + " ");
        }
        // end the line
        System.out.println();
        // print a blank line
        System.out.println();
    }

    /**
     * A second method to print out the contents of
     * the collection, using an Iterator.
     */
    public void print2() {
        // print out the header
        System.out.println("Print out the list using Iterator:");
        // set up the iterator
        java.util.Iterator<String> iter;
        iter = dwarves.iterator();
        // work through the collection
        while(iter.hasNext()) {
            // print out each value
            System.out.print(iter.next() + " ");
        }
        // end the line
        System.out.println();
        // print a blank line
        System.out.println();
    }

    /**
     * A third method to print out the contents of
     * the collection, using an implicit Iterator,
     * the for-each loop.
     */
    public void print3() {
        // print out the header
        System.out.println("Print out the list using for-each:");
        // work through the collection
        for(String name : dwarves) {
            // print out each value
            System.out.print(name + " ");
        }
        // end the line
        System.out.println();
        // print a blank line
        System.out.println();
    }

    /**
     * The application method
     * @param args Command-line parameters
     */
    public static void main(String[] args) {
        // instantiate the Dwarves class
        DwarvesSolution theGuys = new DwarvesSolution();
        theGuys.addNames();
        theGuys.print();
        theGuys.print2();
        theGuys.print3();
    }

}

