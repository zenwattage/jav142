
   
   /**
   * First button handler class
   */
   public class SayHey
       implements java.awt.event.ActionListener 
   {
      
      public void actionPerformed(java.awt.event.ActionEvent e)
      {
         String msg = "Hey, you clicked the button.";
         
         
         javax.swing.JOptionPane.showMessageDialog(null, msg);
      }
      
      
   }
   