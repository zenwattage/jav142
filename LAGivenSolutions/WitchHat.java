/**
 * A simple reusable component that draws a graphical witch's hat of a given
 * size. 
 */
public class WitchHat extends NscComponent {
    
    // The pieces of the witch's hat
    private NscComponent brim;
    private NscComponent body;
    
    /**
     * The 'default' constructor for MyHat.
     * This creates a black hat at location (10, 10).
     */
    public WitchHat() {
        this(10, 10);
    }
    
    /**
     * A constructor for MyHat. This creates a black witch's hat
     * of the 'standard' size, at the specified location.
     * 
     * @param x The x-coordinate for the top hat.
     * @param y The y-coordinate for the top hat.
     */
    public WitchHat(int x, int y) {
        super(x, y, 70, 45);
        // create the pieces of the hat
        brim = new NscEllipse(0, 35, 70, 10);
        brim.setBackground(java.awt.Color.BLACK);
        brim.setFilled(true);
        body = new NscUpTriangle(15, 0, 40, 40);
        body.setBackground(java.awt.Color.BLACK);
        body.setFilled(true);
        // add the pieces to the hat
        add(brim);
        add(body);
    }
}
