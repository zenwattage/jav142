import java.awt.Color;

/**
* ButtonButton color cycling
* @author Scott Hansford
* @version LA9: ButtonButton
* @version Plus
*/

public class ButtonButton 

   implements java.awt.event.ActionListener{
   
   //private fields win and oval
   private NscWindow win;
   private NscEllipse oval;
   private javax.swing.JButton btn;
   private javax.swing.JButton btn2;
   private Color[] colors;
   
   
   //zero param constructor
   public ButtonButton()
   {
      //instantiate window
      win = new NscWindow();
      //set window title
      win.setTitle("ButtonButton");
      
      //instantiate oval
      oval = new NscEllipse(100,70,200,150);
      
      // setup color array
      colors = new Color[6];
      colors[0] = Color.red;
      colors[1] = Color.yellow;
      colors[2] = Color.green;
      colors[3] = Color.cyan;
      colors[4] = Color.blue;
      colors[5] = Color.magenta;
      
      //setbackground to Colors[0]
      oval.setFilled(true);
      oval.setBackground(colors[0]);
      
      //instantiate jButton     
      btn = new javax.swing.JButton("Prev Color");
      btn2 = new javax.swing.JButton("Next Color");
      
      btn.setSize(120,35);
      btn2.setSize(120,35);
      
      btn.setLocation(60,10);
      btn2.setLocation(220,10);
      
      //add to window
      win.add(oval);
      win.add(btn);
      win.add(btn2);
      
      //repaint window
      win.repaint();
      
      //btn.addActionListener(new SayHey());
      btn.addActionListener(this);
      btn2.addActionListener(this);
      
      //array of colors
      
   }
   
   /**
   * Method inherited from ActionListener
   * @param e The event source
   **/
   //@Override
   int count = 1;
   public void actionPerformed(java.awt.event.ActionEvent e)
   {
     if( count < colors.length && count >= 0)
      {  
         System.out.println(count);
         
         if(e.getSource() == btn)
         {
           
            if(count > 0)
            {
               count--;
            }
            oval.setBackground(colors[count]);
             System.out.println(count);
           
         }
                
         if( e.getSource() ==  btn2)
         {
            oval.setBackground(colors[count]);
            
           if(count < 5)           
           {
               count++;
           }
         }
         
         
      }
      
      win.repaint();
   }
   
   //main method
   public static void main(String[] args)
   {
      new ButtonButton();      
   }
      

}