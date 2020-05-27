import java.awt.Color;

/**
  * A graphic traffic light class
  * 
  * @author Scott Hanford
  * @activity LA2: Traffic Light
*/

public class TrafficLight {
    
    public void drawTheLight() {
      // create a window 140 wide, 330 tall, located at (10,10)(upperleft)
      NscWindow win;
      win = new NscWindow(10,10,140,330);
      win.setTitle("TrafficLight");
      
      //grey filled rectangle for light
      NscRectangle rect;
      rect = new NscRectangle(20,20,90,250);
      //place rect inside window
      win.add(rect);
      
      //set rect color 
      rect.setFilled(true);
      rect.setBackground(Color.lightGray);
      
      //custom green 
      Color dGreen = new Color(0,153,0);
      
      //create circles
      NscEllipse topCircle;
      NscEllipse midCircle;
      NscEllipse bottomCircle;
      
      //instantiate circles
      topCircle = new NscEllipse(10,10,70,70);
      midCircle = new NscEllipse(10,90,70,70);
      bottomCircle = new NscEllipse(10,170,70,70);
      
      //fill circles
      topCircle.setFilled(true);
      midCircle.setFilled(true);
      bottomCircle.setFilled(true);
      
      //color circles
      topCircle.setBackground(Color.red);
      midCircle.setBackground(Color.yellow);
      bottomCircle.setBackground(dGreen);
      
      //colormatch outlines
      rect.setForeground(Color.lightGray);
      topCircle.setForeground(Color.red);
      midCircle.setForeground(Color.yellow);
      bottomCircle.setForeground(dGreen);
      
      //add circles to rect
      rect.add(topCircle);
      rect.add(midCircle);
      rect.add(bottomCircle);
      
        
    }
    
    public static void main(String[] args){
      
      //create a new TrafficLight object
      TrafficLight trafficLight;
      trafficLight = new TrafficLight();
      //instantiate our drawTheLight method
      trafficLight.drawTheLight();
    }
    
}