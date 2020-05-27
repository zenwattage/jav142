/*
*@author Scott Hansford
*@version MyTriangle
*/

public class MyTriangle extends MyShape{
   

   /**
   * MyTriangle constructor
   *
   *@param h Height of the triangle
   *@param w Width of the triangle
   */
   public MyTriangle(int h, int w) {
      super(h, w);
   }
   
  /**
  * getArea override
  * 
  * @return The area of the triangle
  */
   public double getArea() {
      // calculate the area
      return (height * width) * .5;
   }
   
   /**
   * getPerimeter override using Pythagorean theorem
   *
   * @return perimeter
   */
   public double getPerimeter() {
      return height + width + (Math.pow(height,2) + Math.pow(width,2));
   }
   
   
   /**
   * Get name of shape type
   *
   */
   public String getName() {
      return "triangle";
   }

}