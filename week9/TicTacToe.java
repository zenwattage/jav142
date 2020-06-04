import javax.swing.JLabel;
/**
* Tic-Tac-Toe game 
*
* @author Scott Hansford
* @version PA8: Tic-Tac-Toe
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
   
   
   
   /*
   * Constructor
   */
   public TicTacToe()
   {
      //instantiate window and title
      win = new NscWindow(10,10,235,280);
      win.setTitle("Tic-Tac-Toe");
      //instantiate labels
      JLabel label = new JLabel("X's turn");
      // instantiate blank buttons
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
   // @Override
   public void actionPerformed(java.awt.event.ActionEvent e) 
   {
      Object button = e.getSource();
      System.out.println(button);
      
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