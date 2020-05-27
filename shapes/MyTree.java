// Allow short name access to java.awt.Color
import java.awt.Color;

/**
*@author Scott Hansford
*@version Graphic Tree component
*/

public class MyTree extends NscComponent{

   private NscRectangle trunk;
   private NscUpTriangle top;  
   
   /*
   * 
   * 
   *@param int x x-coordinate for the tree
   *@param int y y-coordinate for the tree
   */
   public MyTree(int x, int y) {
      // constructor for superclass - NscComponent
      super(x,y,50,80);
      
      // Draw the trunk rectangle
      trunk = new NscRectangle(15,40,20,40);
      trunk.setFilled(true);
      trunk.setBackground(new java.awt.Color(0x99, 0x33, 0x00));
      
      // Draw the top triangle
      top = new NscUpTriangle(0,0,50,50);      
      top.setFilled(true);
      top.setBackground(new java.awt.Color(0x00, 0x99, 0x00));
      
      add(trunk);
      add(top);  
   }
   
   /*
   * Overloaded constructor with a color param
   *
   *@param int x x-coordinate for the tree
   *@param int y y-coordinate for the tree
   *@param Color c color parameter for the leaves of the tree
   */
   public MyTree(int x, int y, java.awt.Color c){
      this(x, y);
      setColor(c);
   }
   
   
   /*
   * Set method for color of tree
   *
   *@param c Color for the tree
   */
   public void setColor(java.awt.Color c){
      trunk.setBackground(c);
      repaint();
   }
   
   /**
   * Get method for color of tree
   *
   *@return The color of the tree  
   */
   public java.awt.Color getColor() {
      return trunk.getBackground();
   }

}