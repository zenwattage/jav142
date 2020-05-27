/*
*@author Scott Hansford
*@version MyEllipse subclass
*/

public class MyEllipse extends MyShape {
   /**
   * MyEllipse constructor
   *
   *@param h Height of the Ellipse
   *@param w Width of the Ellipse
   */
   public MyEllipse(int h, int w){
      super(h, w);
   }
   
  /**
  * getArea override
  * 
  * @return The area of the ellipse
  */
   public double getArea() {
      return Math.PI * (height * width) * .25;
   }
   
   /**
   * getPerimeter override using Ramanujan's approximation
   * 
   * @return perimeter of ellipse
   */
   public double getPerimeter() {
      return .5 * Math.PI * (3 * (height + width) 
      - Math.sqrt((3 * height + width) * (height + 3 * width)));
   }
   
   /**
   * Get name of shape type
   *
   */
   public String getName() {
      return "ellipse";
   }

}