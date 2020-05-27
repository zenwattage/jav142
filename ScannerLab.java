import java.util.Arrays;

public class ScannerLab {
    
    private java.util.Scanner scan;
    
    public void echoStrings() {
        scan = new java.util.Scanner(System.in);
        String word;
        // declare an array to hold the 5 values
        String[] fiveValues = new String[5];
        for(int i = 0; i < 5; i ++) {
            // prompt for the value
            System.out.print("Enter word " + i + ": ");
            // get the input value
            word = scan.next();
            // echo the input value
            System.out.println("You entered " + word);
            // store the input value into the array
            fiveValues[i] = word;
        }
        String line = "";
        // loop through the array and concatenate the values
        // put a space between the words
        System.out.print("The words you entered are: " + line);
        
        System.out.print(fiveValues[0]);
        for(int i = 1; i < fiveValues.length; i++)
        {
         System.out.print(", " + fiveValues[i]);
        }
        System.out.print(".");
        System.out.println();
        
    }
    
    public void echoIntsAndTotal() {
        scan = new java.util.Scanner(System.in);
        int inputValue;
        // declare an array to hold the 5 values
        int[] intArray = new int[5];
        
        for(int i = 0; i < 5; i ++) {
            // prompt for the value
            System.out.print("Enter integer value " + i + ": ");
            // get the input value
            if(scan.hasNextInt())
            {  
               inputValue = scan.nextInt();
               System.out.println("You entered " + inputValue);
               // store the input value into the array
               intArray[i] = inputValue;
            }
            else 
            {
               System.out.println("You entered a non-integer. Using -99 instead.");
               intArray[i] = -99;
               scan.next();
            }
        }
        
        int total = 0;
        // loop through the array and sum the values
        for(int i = 0; i < intArray.length; i++)
        {
            total += intArray[i];           
        }
        
        System.out.println("The total of your values is " + total);
        
        //sort array and get min and max values
        Arrays.sort(intArray);
        System.out.println("Maximum value entered: " + intArray[0]);
        System.out.println("Minimum value entered: " + intArray[intArray.length - 1]);
        
    }
    
    public static void main(String[] args) {
        ScannerLab lab;
        lab = new ScannerLab();
        lab.echoStrings();
        lab.echoIntsAndTotal();
    }
    
}