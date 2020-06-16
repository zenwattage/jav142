import java.awt.Color;

// Sample solution for Learning Activity: Traffic Light.
// This sample shows the Check level work for the lab,
// and half of the Plus level work, the custom green color.
public class TrafficLightSampleSolution {
    
    // The method that draws the traffic light.

    // This method is structured to show that the ellipses
    // could be positioned relative to (and then added to) 
    // either the window or the background rectangle. This
    // does not affect the size of the light (NscEllipse),
    // but does change the coordinates. This was done solely
    // for instructional purposes. Typically, all three of
    // the lights (ellipses) would be positioned relative 
    // to either the origin of the window, or the origin
    // of the background rectangle.
    public void drawTheLight() {
        
        // Create the window
        NscWindow win = new NscWindow(10, 10, 140, 330);
        
        // Background rectangle
        NscRectangle background = new NscRectangle(20, 20, 90, 250);
        background.setFilled(true);
        background.setBackground(Color.lightGray);
        // Add the background to the window
        win.add(background);
        
        // Create the red light
        // Notice that the position is relative to window
        NscEllipse redlight = new NscEllipse(30, 30, 70, 70);
        redlight.setFilled(true);
        redlight.setBackground(Color.red);
        // Add the light to the window
        win.add(redlight);
        
        // Create the yellow light
        // notice that the coordinates are relative to the background
        NscEllipse yellowlight = new NscEllipse(10, 90, 70, 70);
        yellowlight.setFilled(true);
        yellowlight.setBackground(Color.yellow);
        // Add the light to the background
        background.add(yellowlight);
        
        // Create the green light, also relative to the background
        NscEllipse greenlight = new NscEllipse(10, 170, 70, 70);
        greenlight.setFilled(true);
        // Create a new color for the light, 
        Color darkerGreen = new Color(0, 127, 0);
        greenlight.setBackground(darkerGreen);
        // add the light to the background
        background.add(greenlight);
        
        // repaint the window, just to be safe
        win.repaint();
    }
    
    // The application method to draw the window
    public static void main(String[] args) {
        TrafficLightSampleSolution lab2;
        lab2 = new TrafficLightSampleSolution();
        lab2.drawTheLight();
    }
    
}
