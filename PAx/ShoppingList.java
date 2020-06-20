/**
*  A simple Java ShoppingList application
*
*@author Scott Hansford
*@version LA8: ShoppingList
*@version Standard/Challenge
*/

public class ShoppingList {
    
    private java.util.Scanner scan;
    // declare storage for the list items
    String[] list;
    int counter;
    
    /**
    * Shoppinglist constructor
    */
    public ShoppingList() {
        scan = new java.util.Scanner(System.in);
        // initialize storage for list items
        list = new String[10];
        counter = 0;
    }
    
    /**
    * Method for testing list values
    */    
    private void testList() {
      list[0] = "pizza";
      list[1] = "milk";
      list[2] = "bread";
      counter = 3;
    }    
    
    
    /**
    * Method for printing the current list of items
    */
    public void printList() {
        int count = 1;
        System.out.println("Your shopping list:");
        // print the list
        if(list[0] == null)
        {
         System.out.println("* No items in list.");
        }
        for(String item : list)
        {
         
            if(item != null)
            {
               System.out.println(count + ". " + item);
               
            }
            count++;
        }
        
    }
    
    /**
    * Method to check if there are duplicate values in the list
    *
    * @return boolean If duplicate is found returns false
    */
    public boolean checkList(String checkItem) {
      for(String check : list)
      {
         if(checkItem.equals(check)){
            System.out.println("Duplicate item " + checkItem + " not added to list.");
            return false;
         }
      }   
      return true;
    }
    
    
    /*
    * Method for adding items to the list
    */
    public void addToList(String item) {
        
        // add item to the list                    
        if(counter == 10){
         System.out.println("List is full. Item " + item + " not added to list.");
        }
        
        if(counter < 10)
        {        
           list[counter] = item;  
           counter++;
        }
    }
    
    
    public void removeItem(String item)
    {
      for(int i = 0; i < list.length; i++)
      {
         if(list[i].equals(item))
         {
            list[i] = null;
         }
      }
           
    }
    
    /**
    * Method for resetting the item list
    */
    public void emptyList() {
        // empty the list
        list = new String[10];        
    }
    
    
    /**
    * method for getting user input
    *
    * @return string command line input from user
    */
    public String getInput() {
        
        System.out.print("Enter your item or command: ");
        //get multiple word inputs
        return scan.nextLine();
    }
    
    
    /**
    * Method for printing welcome message
    */
    public void printWelcome() {
        System.out.println("Welcome to the XYZ Shopping List Program.");
    }
    
    
    /**
    * Method for printing thank you message
    */
    public void printThankYou() {
        System.out.println("Thank you for using the XYZ Shopping List Program.");
    }
    
    
    /**
    * Method for printing menu commands
    */
    public void printHelp() {
        System.out.println("Here are the list of commands:");
        System.out.println("  -p : Print the list");
        System.out.println("  -e : Empty the list");
        System.out.println("  -r n : Remove the nth item from the list");
        System.out.println("  -x : Exit the application");
        System.out.println("  -h : Print this command list");
    }
    
    
    /**
    * Method for driving and printing menu
    */
    public void go() {
        String input;
        printWelcome();
        printHelp();
        input = getInput();
        while( ! input.equals("-x")) {
            if(input.equals(""))
            {
               System.out.println("Shopping list items cannot be blank.");
            }
            switch(input) {
                case "-h":
                    printHelp();
                    break;
                case "-p":
                    printList();
                    break;
                case "-x":
                    break;
                case "-e":
                    emptyList();
                    break;
                case "-r":             //removal of single item incomplete       
                     removeItem(input);
                     break;
                default:
                  if(checkList(input) == true){
                     addToList(input);
                  }
            }
/* alternate (pre-Java 1.7) implementation
            if(input.equals("-h")) {
                printHelp();
            } else if(input.equals("-p")) {
                printList();
            } else if(input.equals("-e")) {
                emptyList();
            } else {
                addToList(input);
            }
//*/        
            input = getInput();
        }
        printThankYou();
    }
    
    
    /**
    * main method for testing of the application
    *
    * @param args The command-line arguments
    */
    public static void main(String[] args) {
        ShoppingList list;
        
        list = new ShoppingList();
        // list.testList();
//         list.printList();
//         list.emptyList();
//         list.printList();
        list.go();
    }
    
}