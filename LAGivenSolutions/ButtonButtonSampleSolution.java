/**
 * Learning Activity: ButtonButton, Updated
 * Sample solution
 * @author Dan
 */
public class ButtonButtonSampleSolution implements java.awt.event.ActionListener {
    
    // the window for the application
    private NscWindow win;
    // the filled oval
    private NscEllipse oval;
    // the "forward" button
    private javax.swing.JButton next;
    // the "backward" button
    private javax.swing.JButton prev;
    
    /**
     * construct the window, et al.
     */
    public ButtonButtonSampleSolution() {
        // create the window
        win = new NscWindow();
        win.setTitle("ButtonButton");
        // create the oval
        oval = new NscEllipse(100, 70, 200, 150);
        oval.setFilled(true);
        oval.setBackground(java.awt.Color.blue);
        // create the buttons
        next = new javax.swing.JButton("Next Color");
        next.setSize(120, 35);
        next.setLocation(220, 10);
        prev = new javax.swing.JButton("Prev Color");
        prev.setSize(120, 35);
        prev.setLocation(60, 10);
        // put it together
        win.add(oval);
        win.add(next);
        win.add(prev);
        win.repaint();
        // add the handler to the buttons
        next.addActionListener(this);
        prev.addActionListener(this);
    }
    
    /**
     * Method for ActionListener interface
     * @param e The event that occurred
     */
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // determine which button
        if(e.getSource() == next) {
            // check the current color and update
            // notice this is a single if-else if cascade
            // only one of the block will be performed
            if(oval.getBackground() == java.awt.Color.red) {
                oval.setBackground(java.awt.Color.green);
            } else if(oval.getBackground() == java.awt.Color.green) {
                oval.setBackground(java.awt.Color.blue);
            } else {
                // use of else here, in case there is a different color
                oval.setBackground(java.awt.Color.red);
            }
        } else {
            // set up is analogous to the then-part
            if(oval.getBackground() == java.awt.Color.red) {
                oval.setBackground(java.awt.Color.blue);
            } else if(oval.getBackground() == java.awt.Color.green) {
                oval.setBackground(java.awt.Color.red);
            } else {
                oval.setBackground(java.awt.Color.green);
            }
        }
        // repaint to show the new color
        oval.repaint();
    }
    
    /**
     * application method
     * @param args The command-line parameters
     */
    public static void main(String[] args) {
        new ButtonButtonSampleSolution();
    }
    
}
