public class MapStuff implements java.awt.event.ActionListener {
    
    private java.util.Map<String, java.awt.Color> colors;
    private NscWindow win;
    private NscComponent comp;
    private javax.swing.JButton btn;
    private javax.swing.JTextField input;
    
    public MapStuff() {
        
        // set-up the map
        colors = new java.util.HashMap<String, java.awt.Color>();
        colors.put("red", java.awt.Color.red);
        colors.put("blue", java.awt.Color.blue);
        colors.put("green", java.awt.Color.green);
        colors.put("cyan", java.awt.Color.cyan);
        colors.put("orange", java.awt.Color.orange);
        
        // create the window
        win = new NscWindow();
        win.setTitle("MapStuff - Colors by Name");
        
        // setup the rectangle
        comp = new NscRectangle(100, 100, 200, 100);
        comp.setFilled(true);
        win.add(comp);
        
        // set-up the button
        btn = new javax.swing.JButton("Go");
        btn.setLocation(250, 50);
        btn.setSize(50, 30);
        win.add(btn);
        
        // connect up the action listener
        btn.addActionListener(this);
        
        // set-up the textbox
        input = new javax.swing.JTextField("");
        input.setLocation(100, 50);
        input.setSize(130, 30);
        win.add(input);
        
        // request a repaint
        win.repaint();
        
    }
    
    public void actionPerformed(java.awt.event.ActionEvent e) {
        String text = input.getText();
        java.awt.Color color = colors.get(text);
        if(color == null) {
            javax.swing.JOptionPane.showMessageDialog(comp, "Bad choice, try again.");
            input.requestFocus();
            return;
        }
//        comp.setBackground(java.awt.Color.black);
        comp.setBackground(colors.get(text));
        win.repaint();
    }
    
    public static void main(String[] args) {
        new MapStuff();
    }
    
}
