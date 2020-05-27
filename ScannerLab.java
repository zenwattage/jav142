public class ScannerLab {
    
    private java.util.Scanner scan;
    
    public void echoStrings() {
        String word;
        // declare an array to hold the 5 values
        for(int i = 0; i < 5; i ++) {
            // prompt for the value
            System.out.print("Enter word " + i + ": ");
            // get the input value
            word = scan.next();
            // echo the input value
            System.out.println("You entered " + word);
            // store the input value into the array
        }
        String line = "";
        // loop through the array and concatenate the values
        // put a space between the words
        System.out.println("The words you entered are: " + line);
    }
    
    public void echoIntsAndTotal() {
        int inputValue;
        // declare an array to hold the 5 values
        for(int i = 0; i < 5; i ++) {
            // prompt for the value
            System.out.print("Enter integer value " + i + ": ");
            // get the input value
            inputValue = 23;
            // echo the input value
            System.out.println("You entered " + inputValue);
            // store the input value into the array
        }
        int total = 0;
        // loop through the array and add the values
        System.out.println("The total of your values is " + total);
    }
    
    public static void main(String[] args) {
        ScannerLab lab;
        lab = new ScannerLab();
        lab.echoStrings();
        // lab.echoIntsAndTotal();
    }
    
}