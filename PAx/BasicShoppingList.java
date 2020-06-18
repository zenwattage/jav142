public class BasicShoppingList {
    
    private java.util.Scanner scan;
    // declare storage for the list items
    BasicList theList;
    
    public BasicShoppingList() {
        scan = new java.util.Scanner(System.in);
        // initialize storage for list items
        theList = new MyList(10);
    }
    
    public void printList() {
        System.out.println("Your shopping list:");
        // print the list
        if(theList.size() == 0) {
            System.out.println(" * No items on list");
        } else {
            for(int i = 0; i < theList.size(); i++) {
                System.out.printf("%3d. %s\n", i+1, theList.get(i));
            }
        }
    }
    
    public void addToList(String item) {
        // add item to the list
        if(theList.size() >= theList.capacity()) {
            System.out.println("List full, Item " + item + " not added to list.");
        } else if(theList.contains(item)) {
            System.out.println("Duplicate item " + item + " not added to list.");
        } else {
            theList.add(item);
        }
    }
    
    public void emptyList() {
        // empty the list
        theList.clear();
    }
    
    public String getInput() {
        System.out.print("Enter your item or command: ");
        return scan.next().trim();
    }
    
    public void printWelcome() {
        System.out.println("Welcome to the XYZ Shopping List Program.");
    }
    
    public void printThankYou() {
        System.out.println("Thank you for using the XYZ Shopping List Program.");
    }
    
    public void printHelp() {
        System.out.println("Here are the list of commands:");
        System.out.println("  -p : Print the list");
        System.out.println("  -e : Empty the list");
//        System.out.println("  -r n : Remove the nth item from the list");
        System.out.println("  -x : Exit the application");
        System.out.println("  -h : Print this command list");
    }
    
    public void go() {
        String input;
        
        printWelcome();
        printHelp();
        input = getInput();
        while( ! input.equals("-x")) {
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
                default:
                    addToList(input);
            }
            input = getInput();
        }
        printThankYou();
    }
    
    public static void main(String[] args) {

        new BasicShoppingList().go();

    }
    
}
