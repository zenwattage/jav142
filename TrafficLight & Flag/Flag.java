import java.awt.Color;

/**
*
* Draw National Flags
*
*@author Scott Hansford
*@version PA2: Flags
*@version Standard
*/



public class Flag{

   /*
    * This method will draw the Niger flag
    * 
    * Calculations: 
    *    fly:hoist: 7:6 : 308: 264
    *    orange color - red:255, green:127, blue:0
    *    green color - red:0, green:204, blue:0
    *    actual dimensions adjusted by one pixel
    *    overall flag:
    *       dimension: 308 x 264
    *       location: (10,10)
    *       Horizontal rectangles:
    *          dimension: 308 x 89
    *          locations: (0,0),(0,88),(0,175)
    *          height/3 : 264/3 = 88 + 1 for border overlap = 89
    *       Circle:
    *          dimension:  75% of horizontal rectangle: 88 * .75 = 66 
    *       Circle horizontal placement: midRect width / 2 - circle diamter / 2 : 308/2 = 154 - 33 = 121  
    *       Circle vertical placement: midRect height /2 - circle diameter /2 : 88 / 2 = 44 - 33 = 21
    * 
   */

   public void drawNigerFlag() {   
      //niger flag colors
      Color nOrange = new Color(255,127,0);
      Color nGreen = new Color(0,204,0);
      
      //create window
      NscWindow win;
      //create rectangle for outter border of flag
      win = new NscWindow(10,10,360,360);
      win.setTitle("Nigerian Flag");      
      
      //flag shapes
      NscRectangle outline;
      NscRectangle topRect;
      NscRectangle midRect;
      NscRectangle bottomRect;
      NscEllipse circle;
      
      //flag shape dimensions
      outline = new NscRectangle(20,20,308,264);
      topRect = new NscRectangle(0,0,308,89);
      midRect = new NscRectangle(0,88,308,89);
      bottomRect = new NscRectangle(0,175,308,89);
      circle = new NscEllipse(121,11,66,66);
      
      // add shapes
      win.add(outline);
      outline.add(topRect);
      outline.add(midRect);
      outline.add(bottomRect);
      midRect.add(circle);
      
      //set shape fills
      topRect.setFilled(true);
      midRect.setFilled(true);
      bottomRect.setFilled(true);
      circle.setFilled(true);
      
      //set shape colors
      topRect.setBackground(nOrange);           
      midRect.setBackground(Color.white);      
      bottomRect.setBackground(nGreen);
      circle.setBackground(nOrange);
   }
   
   /*
    * This method will draw the Sweden flag
    * 
    * Calculations:
    *    fly: blue:yellow:blue vertically : 5:2:9 : 260/5 = 52, 260/2 = 130, 416*9/16 = 234
    *    hoist: blue:yellow:blue horizontally : 4:2:4 : 416/4 = 104, 260/5 = 52  
    *
    *    Rectangle calculations adjust to account for 
    *    
    *    overall flag:
    *       dimension: 416 x 260
    *       location: (20,20)
    *
    *    horizontal rectangle:
    *       dimension: 416 x 52
    *       location: (0,110)
    *
    *    vertical rectangle:
    *       dimension: 52 x 260
    *       location: (140,0)
   */
   
   public void drawSwedenFlag() {
   
      //create window
      NscWindow win;      
      //create rectangle for outer border/background
      win = new NscWindow(10,10,470,360);
      win.setTitle("Swedish Flag");
      
      //fill outter/background rectangle blue
      NscRectangle outline;
      NscRectangle back;
      NscRectangle horiz;
      NscRectangle vert;
      
      //rectangle dimensions
      outline = new NscRectangle(20,20,416,260);
      back = new NscRectangle(0,0,416,260);
      horiz = new NscRectangle(0,110,416,52);
      vert = new NscRectangle(140,0,52,260);
      
      back.setFilled(true);
      horiz.setFilled(true);
      vert.setFilled(true);
      
      back.setBackground(Color.blue);
      horiz.setBackground(Color.yellow);
      vert.setBackground(Color.yellow);
      vert.setForeground(Color.yellow);
      
      win.add(outline);
      outline.add(back);
      outline.add(horiz);
      outline.add(vert);
   }
   
   /*
   * This method will draw the flag of Norway
   * 
   * Calculations:
   *
   *  Overall flag:
   *     dimensions: 22:16 : 352 wide(fly) x 256 high(hoist)
   *        
   *     vertical ratio: red:white:blue:white:red  : 6:1:2:1:6 : 352-256 = 96, 16, 16 * 2 = 32, 16
   *     horizontal ratio: red:white:blue:white:red  : 6:1:2:1:12
   *     vertical position: 96 + 16 = 112
   *     vertical width = 96 - 16 = 80
   *  Red rectangle dimensions:
   *     dimensions: 96 x 96, 192 x 96
   *     location: (0,0),(0,160),(160,0),(160,160);
   *  White rectangle dimensions:
   *     dimensions: 112 x 112, 208 x 112
   *     location: (0,0), (0,144),(144,0),(144,144);
   */
   
   public void drawNorwayFlag() {
      //create window
      NscWindow win;
      win = new NscWindow(10,10,450,400);
      win.setTitle("Norwegian Flag");
      
      //create shapes
      NscRectangle outline;
      NscRectangle topLeftWhite;
      NscRectangle topLeftRed;
      NscRectangle topRightWhite;
      NscRectangle topRightRed;
      NscRectangle botLeftWhite;
      NscRectangle botLeftRed;
      NscRectangle botRightWhite;
      NscRectangle botRightRed;
      
      //shape dimensions
      outline = new NscRectangle(40,40,352,256);
      topLeftWhite = new NscRectangle(0,0, 112, 112);
      topLeftRed = new NscRectangle(0, 0 , 96, 96);
      topRightWhite = new NscRectangle(144,0,208,112);
      topRightRed = new NscRectangle(160,0,192,96);
      botLeftWhite = new NscRectangle(0,144,112,112);
      botLeftRed = new NscRectangle(0,160,96,96);
      botRightWhite = new NscRectangle(144,144,208,112);
      botRightRed = new NscRectangle(160, 160, 192, 192);  
      
      //set filled
      outline.setFilled(true);
      topLeftWhite.setFilled(true);
      topLeftRed.setFilled(true);
      topRightWhite.setFilled(true);
      topRightRed.setFilled(true);
      botLeftWhite.setFilled(true);
      botLeftRed.setFilled(true);
      botRightWhite.setFilled(true);
      botRightRed.setFilled(true);
      
      //fill colors
      outline.setBackground(Color.blue);
      topLeftWhite.setBackground(Color.white);
      botLeftWhite.setBackground(Color.white);
      topRightWhite.setBackground(Color.white);
      botRightWhite.setBackground(Color.white);
      topLeftRed.setBackground(Color.red);
      topRightRed.setBackground(Color.red);
      botLeftRed.setBackground(Color.red);
      botRightRed.setBackground(Color.red);
      
      //add shapes
      win.add(outline);
      outline.add(topLeftWhite);
      outline.add(botLeftWhite);
      outline.add(topRightWhite);
      outline.add(botRightWhite);
      outline.add(topLeftRed);
      outline.add(topRightRed);
      outline.add(botLeftRed);
      outline.add(botRightRed);
   
   }
   
   
   /*
   * This method will draw flags of Nigeria, Sweden, and Norway
   * @params args Unused.
   */
   public static void main(String[] args){
      Flag test = new Flag();      
      test.drawNigerFlag();
      test.drawSwedenFlag();
      test.drawNorwayFlag();      
      
   }


}