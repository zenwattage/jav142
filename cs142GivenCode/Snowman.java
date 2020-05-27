import java.awt.Color;
/*
* Scott Hansford
* @version Demo: Snowman
*/



public class Snowman {

   //declare a field for the window
   private NscWindow win;
   //declare fields for the head and body
   private NscEllipse head;
   private NscEllipse body;
   
   /**
   * This method creates a window and draws
   * a snowman within that window
   */
   
   public void buildSnowman() {
      // create the window for the snowman, set the title
      
      win = new NscWindow(75, 50, 160, 250);
      win.setTitle("My Snowman");
      // create the head and body
      head = new NscEllipse();
      body = new NscEllipse();
      // add them to the window 
      win.add(head);
      win.add(body);
      // set the size and location
      head.setSize(50, 50);
      body.setSize(100, 100);
      body.setLocation(25, 25 + 50);
      head.setLocation(75 - 25, 25);
      // set the Filled property to make them white
      head.setFilled(true);
      body.setFilled(true);
      // request a repaint for the whole window
      win.repaint();
      
   }
   
   /**
   * Add a face to the snowman
   */
   public void addFace() {
      
      // declare variables for the face
      NscUpTriangle leftEye;
      NscUpTriangle rightEye;
      NscUpTriangle nose;
      // instantiate the eyes and add to the window
      leftEye = new NscUpTriangle(75-10-4, 25+15, 10, 10);
      rightEye = new NscUpTriangle(75+4, 25+15, 10, 10);
      win.add(leftEye);
      win.add(rightEye);
      // instantiate the nose and add to the head
      nose = new NscUpTriangle(25-5, 15+10+3, 10, 10);
      head.add(nose);

      // color the outlines of the eyes
      leftEye.setForeground(Color.green);
      rightEye.setForeground(Color.green);
      // color the insides of the eyes
      leftEye.setFilled(true);
      rightEye.setFilled(true);
      leftEye.setBackground(Color.blue);
      rightEye.setBackground(Color.blue);
      // create a custom color for the nose
      Color lightBlue = new Color(196, 196, 255);
      nose.setFilled(true);
      nose.setBackground(lightBlue);
      
      //request a repaint for the whole window
      win.repaint();
   }
   
   /**
   * This method builds a snowman and
   * adds a face to it.
   */
   public void show() {
      buildSnowman();
      addFace();
   
   }
   
   public static void main(String[] args) {
      Snowman frosty;
      frosty = new Snowman();
      frosty.show();
   }
}