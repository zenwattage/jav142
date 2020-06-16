/**
 * Learning Activity: Loops
 * Sample solution, check level
 * 
 * @author Dan Jinguji
 */
public class LoopTo630 {
    
    /**
     * Version using the do loop.
     * This uses one form of fenceposting
     */ 
    public void doLoop() {
        // label the output
        System.out.println("Using a do loop:");
        int i = 1;
        // print the bulk of the numbers
        do {
            System.out.print(i + ", ");
            i += 37; 
        } while(i < 630);
        // complete the fencepost line
        System.out.println(i + ".");
        // print a blank line
        System.out.println();
    }
    
    /**
     * Version using the while loop.
     * Here is an alternate way to fencepost
     */ 
    public void whileLoop() {
        // label the output
        System.out.println("Using a while loop:");
        int i = 1;
        // print out the first number
        System.out.print(i);
        // print the bulk of the numbers
        while(i < 630) {
            // calculate the next number
            i += 37;
            System.out.print(", " + i);
        }
        // complete the fencepost line
        System.out.println(".");
        // print a blank line
        System.out.println();
    }
    
    /**
     * Version using the for loop.
     * Yet another alternate.
     */ 
    public void forLoop() {
        // label the output
        System.out.println("Using a for loop:");
        // print the first number
        System.out.print(1);
        // print the bulk of the numbers
        for(int i = 38; i < 631; i += 37) {
            System.out.print(", " + i);
        }
        // complete the fencepost line
        System.out.println(".");
        // print a blank line
        System.out.println();
    }
    
    /**
     * The driver for this lab
     * 
     * @param args The command-line agrements
     */
    public static void main(String[] args) {
        LoopTo630 lab = new LoopTo630();
        lab.forLoop();
        lab.whileLoop();
        lab.doLoop();
    }
    
}
