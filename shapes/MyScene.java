// Allow short name access to java.awt.Color
import java.awt.Color;

/**
 * This is the shell for assignment: MyScene.
 * This program draws a simple scene using additional
 * classes that the student creates.
 * 
 * @author Dan Jinguji
 * @author Scott Hansford
 * @version Programming Assignment: MyScene
 */
public class MyScene extends NscWindow {
    
    // instance variables
    private MyHouse house;
    private MyHouse house2;
    private MyHouse house3;
    private MyTree tree;
    private MyTree tree2;
    private MyTree tree3;
    
    /**
     * Constructor for objects of class MyScene
     */
    public MyScene() {
        // Specify the constructor for the superclass
        super(10, 10, 400, 300);
        // set characteristics for the object
        setTitle("My Scene");
        
        // Draw the sky
        getContentPane().setBackground(new Color(0x00, 0xCC, 0xFF));
        
        // Draw some grass
        NscRectangle grass = new NscRectangle(0, 100, 400, 200);
        grass.setBackground(new Color(0x00, 0x99, 0x00));
        grass.setFilled(true);
        add(grass);
        
        // Draw a house
        house = new MyHouse(130, 50);
        house2 = new MyHouse(240,80);
        house3 = new MyHouse(40,90);
        
        // Set house color
        house2.setColor(java.awt.Color.pink);
        house3.setColor(java.awt.Color.yellow);
        
        add(house);
        add(house2);
        add(house3);
        
        // Draw a tree
        tree = new MyTree(120,180);
        tree2 = new MyTree(320,140, java.awt.Color.pink);
        tree3 = new MyTree(20,160,java.awt.Color.yellow);
        
        // add trees to component
        add(tree);
        add(tree2);
        add(tree3);
        // request a rerendering of the window
        repaint();
    }
    
    /**
     * Alter the scene, by changing color
     */
    public void change1() {
        // change the color of each house
        house.setColor(Color.yellow);
        house2.setColor(Color.cyan);
        house3.setColor(Color.magenta);
        
        // change the color of each tree
        tree.setColor(Color.red);
        tree2.setColor(Color.white);
        tree3.setColor(Color.blue);
        // request a rerendering of the window
        repaint();
    }
    
    /**
     * Alter the scene, by changing location
     */
    public void change2() {
        // change the location of the house
        house.setLocation(250, 125);
        house2.setLocation(140,100);
        house3.setLocation(30,140);
        
        // change the location of the trees
        tree.setLocation(5,35);
        tree2.setLocation(100,30);
        tree3.setLocation(270,35);
        
        // request a rerendering of the window
        repaint();
    }
    
    /**
     * Alter the scene, by changing size
     */
    public void change3() {
        // change the size of the house
        house.setSize(80, 60);
        // request a rerendering of the window
        repaint();
    }
    
    
    /**
     * Alter the scene, restoring original settings
     */
    public void reset() {
        // Draw a house
        
        house.setSize(120,90);
        house.setLocation(130, 50);
        house2.setLocation(240,80);
        house3.setLocation(40,90);
        
        // Set house color
        house.setColor(java.awt.Color.blue);
        house2.setColor(java.awt.Color.pink);
        house3.setColor(java.awt.Color.yellow);
        
        // Draw a tree
        tree.setLocation(120,180);        
        tree2.setLocation(320,140);
        tree3.setLocation(20,160);
        
        // Set tree color
        tree.setColor(new java.awt.Color(0x99, 0x33, 0x00));        
        tree2.setColor(java.awt.Color.pink);
        tree3.setColor(java.awt.Color.yellow);
        

        // request a rerendering of the window
        repaint();

    }
    
    /**
     * The application method, to test your code
     *
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        
        // declare a MyScene reference
        MyScene aScene;
        // instantiate MyScene
        aScene = new MyScene();
        // pause
        javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");
        
        // test setColor
        aScene.change1();
        javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");
        
        // test setLocation
        aScene.change2();
        javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");
        
        // test setSize
        aScene.change3();
        javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");
        
        // reset initial values
        aScene.reset();
    }
    
}
