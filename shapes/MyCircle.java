/*
*@author Scott Hansford
*@version MyCircle subclass
*/

public class MyCircle extends MyEllipse {
   /**
   * MyCircle constructor
   * Override of MyEllipse 
   * 
   *@param d Diameter of the circle
   */
   public MyCircle(int d){
      super(d, d);
   }   
   
   public String getName() {
     return "circle";
   }
   
   

}