import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

/**
* Tic-Tac-Toe game 
*
* @author Scott Hansford
* @version PA8: Tic-Tac-Toe 
* @version Standard
*/

public class TicTacToe
   implements java.awt.event.ActionListener {
   
   private NscWindow win;
   
   private javax.swing.JButton btn;
   private javax.swing.JButton btn2;
   private javax.swing.JButton btn3;
   private javax.swing.JButton btn4;
   private javax.swing.JButton btn5;
   private javax.swing.JButton btn6;
   private javax.swing.JButton btn7;
   private javax.swing.JButton btn8;
   private javax.swing.JButton btn9;
   
   private JButton[] button = new JButton[9];
   
   private int count = 0;
   private String letter = "";
   JLabel label = new JLabel("X's turn");
   
   /*
   * Constructor for game
   */
   public TicTacToe()
   {
      //instantiate window and title
      win = new NscWindow(10,10,235,280);
      win.setTitle("Tic-Tac-Toe");
      //instantiate labels
      
      //button label
      String letter = "";
      
      //button labels
      btn = new javax.swing.JButton("");
      btn2 = new javax.swing.JButton("");
      btn3 = new javax.swing.JButton("");
      btn4 = new javax.swing.JButton("");
      btn5 = new javax.swing.JButton("");
      btn6 = new javax.swing.JButton("");
      btn7 = new javax.swing.JButton("");
      btn8 = new javax.swing.JButton("");
      btn9 = new javax.swing.JButton("");      
      
      //set label size
      label.setSize(160,20);
      label.setLocation(30,200);
      label.setHorizontalAlignment(JLabel.CENTER);
      label.setVerticalAlignment(JLabel.CENTER);
      
      // set button sizes
      btn.setSize(50,50);
      btn2.setSize(50,50);
      btn3.setSize(50,50);
      btn4.setSize(50,50);
      btn5.setSize(50,50);
      btn6.setSize(50,50);
      btn7.setSize(50,50);
      btn8.setSize(50,50);
      btn9.setSize(50,50);
      
      // set button locations
      btn.setLocation(30,30);
      btn2.setLocation(85,30);
      btn3.setLocation(140,30);
      btn4.setLocation(85,140);
      btn5.setLocation(85,85);
      btn6.setLocation(30,140);
      btn7.setLocation(30,85);
      btn8.setLocation(140, 85); 
      btn9.setLocation(140,140);
      
      // add label to window
      win.add(label);
      
      // add buttons to window
      win.add(btn);
      win.add(btn2);
      win.add(btn3);
      win.add(btn4);
      win.add(btn5);
      win.add(btn6);
      win.add(btn7);
      win.add(btn8);
      win.add(btn9);
      
      // action listener
      btn.addActionListener(this);
      btn2.addActionListener(this);
      btn3.addActionListener(this);
      btn4.addActionListener(this);
      btn5.addActionListener(this);
      btn6.addActionListener(this);
      btn7.addActionListener(this);
      btn8.addActionListener(this);
      btn9.addActionListener(this);
      
      //repaint window
      win.repaint();
   }
   
   /**
   * Method inherited from ActionListener
   * @param e The event source
   **/
   /// @Override
   public void actionPerformed(java.awt.event.ActionEvent e) 
   {
      //odds get X, evens get Y
      count++;
      if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9)
      {
         letter = "X";
         label.setText("Y's Turn");
      }
      
      if(count == 2 || count == 4 || count == 6 || count == 8)
      {
         letter = "Y";
         label.setText("Xy's Turn");
      }
      if(count == 9)
      {
         label.setText("DONE");
      }
      
//       Object button = e.getSource();
//       System.out.println(button);
      
      
      if(e.getSource() == btn)
      {
         if(btn.getText().isEmpty()){
            
         btn.setText(letter);
         btn.setFont(new Font("Arial", Font.BOLD, 20));
            
         } else 
         {
            btn.getToolkit().beep();
         }         
         //btn.setEnabled(false);
      }
      else if (e.getSource() == btn2)
      {
        if(btn2.getText().isEmpty()){
            
         btn2.setText(letter);
         btn2.setFont(new Font("Arial", Font.BOLD, 20));
            
         } else 
         {
            btn2.getToolkit().beep();
         }  
         //btn2.setEnabled(false);
      }
      else if (e.getSource() == btn3)
      {
         if(btn3.getText().isEmpty()){
            
         btn3.setText(letter);
         btn3.setFont(new Font("Arial", Font.BOLD, 20));
            
         } else 
         {
            btn3.getToolkit().beep();
         }
         
         //btn3.setEnabled(false);
      }
      else if (e.getSource() == btn4)
      {
         if(btn4.getText().isEmpty()){
            
         btn4.setText(letter);
         btn4.setFont(new Font("Arial", Font.BOLD, 20));
            
         } else 
         {
            btn4.getToolkit().beep();
         }
         
         
         //btn4.setEnabled(false);
      }
      else if (e.getSource() == btn5)
      {
         if(btn5.getText().isEmpty()){
            
         btn5.setText(letter);
         btn5.setFont(new Font("Arial", Font.BOLD, 20));
            
         } else 
         {
            btn5.getToolkit().beep();
         }
         
         //btn5.setEnabled(false);
      }
      else if (e.getSource() == btn6)
      {
         if(btn6.getText().isEmpty()){
            
         btn6.setText(letter);
         btn6.setFont(new Font("Arial", Font.BOLD, 20));
            
         } else 
         {
            btn6.getToolkit().beep();
         }
         
         //btn6.setEnabled(false);
      }
      else if (e.getSource() == btn7)
      {
         if(btn7.getText().isEmpty()){
            
         btn7.setText(letter);
         btn7.setFont(new Font("Arial", Font.BOLD, 20));
            
         } else 
         {
            btn7.getToolkit().beep();
         }
         
         //btn7.setEnabled(false);
      } 
      else if (e.getSource() == btn8)
      {
         
         if(btn8.getText().isEmpty()){
            
         btn8.setText(letter);
         btn8.setFont(new Font("Arial", Font.BOLD, 20));
            
         } else 
         {
            btn8.getToolkit().beep();
         }
         
         //btn8.setEnabled(false);
      } 
      else if (e.getSource() == btn9)
      {
         if(btn9.getText().isEmpty()){
            
         btn9.setText(letter);
         btn9.setFont(new Font("Arial", Font.BOLD, 20));
            
         } else 
         {
            btn9.getToolkit().beep();
         }
         
         //btn9.setEnabled(false);
      }
      
      win.repaint();
   }
   
   
   /**
   * Main method
   */
   public static void main(String[] args)
   {
      
      new TicTacToe();
   
   }






}