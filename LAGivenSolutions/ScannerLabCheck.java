/**
 * Getting familiar with Scanner and arrays
 * 
 * @author Sample solution
 * @version Learning Activity: Scanner, Check version
 */ 
public class ScannerLabCheck {
    
    // shared scanner object
    private java.util.Scanner scan;
    
    /**
     * Initialize the scanner object.
     */
    public ScannerLabCheck() {
        scan = new java.util.Scanner(System.in);
    }
    
    /**
     * Work with Strings.
     */
    public void echoStrings() {
        String word;
        // declare an array to hold the 5 values
        String[] values = new String[5];
        for(int i = 0; i < 5; i ++) {
            // prompt for the value
            System.out.print("Enter word " + i + ": ");
            // get the input value
            word = scan.next();
            // echo the input value
            System.out.println("You entered " + word);
            // store the input value into the array
            values[i] = word;
        }
        String line = "";
        // loop through the array and concatenate the values
        for(int i = 0; i < values.length; i++) {
            // put a space between the words
            line += values[i] + " ";
        }
        System.out.println("The words you entered are: " + line);
    }
    
    /**
     * Working with ints.
     */
    public void echoIntsAndTotal() {
        int inputValue;
        // declare an array to hold the 5 values
        int[] values = new int[5];
        for(int i = 0; i < 5; i ++) {
            // prompt for the value
            System.out.print("Enter integer value " + i + ": ");
            // check the next input value
            if(scan.hasNextInt()) {
                // get the input value
                inputValue = scan.nextInt();
            } else {
                // report the error
                System.out.println("Non-integer input. Using -99 instead.");
                // use the default value
                inputValue = -99;
                // discard the current input value
                scan.next();
            }
            // echo the input value
            System.out.println("You entered " + inputValue);
            // store the input value into the array
            values[i] = inputValue;
        }
        int total = 0;
        // loop through the array and add the values
        for(int i = 0; i < values.length; i++) {
            total += values[i];
        }
        System.out.println("The total of your values is " + total);
    }
    
    /**
     * The application method.
     * @param The command-line arguments.
     */
    public static void main(String[] args) {
        ScannerLabCheck lab;
        lab = new ScannerLabCheck();
        lab.echoStrings();
        lab.echoIntsAndTotal();
    }
    
}