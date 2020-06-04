/**
 * This is a driver class for the demo on abstract methods
 * and abstract classes.
 * 
 * @author Dan
 * @version Demo code
 */
public class ShapeHierarchy {
    
    /**
     * The application method.
     * 
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        
        // declare a MyShape reference variable
        MyShape shape;
        
        // instantiate a MyRectangle
        shape = new MyRectangle(3, 5);
        // print out information about the shape
        printInfo(shape);
        
        // instantiate a MySquare and print out info
        printInfo(new MySquare(5));
        
        // instantiate a MyTriangle and print out info
         printInfo(new MyTriangle(5, 3));
    }
    
    
    /**
     * This is a helper method to print out information about
     * the shapes.
     */
    public static void printInfo(MyShape s) {
        // print out the shape type, dimensions, and area
        System.out.print("Your shape is a " + s.getName() + " ");
        System.out.print("that is " + s.getHeight() + " by " + s.getWidth() + ". ");
        System.out.println("Its area is " + s.getArea() + ".");
    }
    
}