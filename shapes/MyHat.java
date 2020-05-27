/**
 * A simple reusable component that draws a graphical hat of a given
 * size. 
 */
public class MyHat extends NscComponent {
    
    // The pieces of the my hat
    private NscComponent brim;
    private NscComponent body;
    
    /**
     * The 'default' constructor for MyHat.
     * This creates a black hat at location (40, 10).
     */
    public MyHat() {
        this(40, 10);
    }
    
    /**
     * A constructor for MyHat. This creates a black witch hat
     * of the 'standard' size, at the specified location.
     * 
     * @param x The x-coordinate for the witch hat.
     * @param y The y-coordinate for the witch hat.
     */
    public MyHat(int x, int y) {
        super(x, y, 70, 45);
        // create the pieces of the hat
        brim = new NscEllipse(0, 35, 70, 10);
        brim.setBackground(java.awt.Color.BLACK);
        brim.setFilled(true);
        //NscUpTriangle(int x, int y, int w, int h)
        body = new NscUpTriangle(15, 0, 40, 40);
        body.setBackground(java.awt.Color.BLACK);
        body.setFilled(true);
        // add the pieces to the hat
        add(brim);
        this.add(body);
    }
}