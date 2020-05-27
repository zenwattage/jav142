import java.awt.Color;

/**
*@author Scott Hansford
*@version PA3: Tic-Tac-Toe Boards
*@version Standard Level
*/

public class TicTacToeBoards {

   private NscWindow win;

   /**
   * Board and window Constructor
   */
   public TicTacToeBoards() {
      //create window
      win = new NscWindow(10,10,300,330);
      win.setTitle("Tic-Tac-Toe Boards");
      //standard method
      drawBoard(40,40);
      //thick line method
      drawBoard(40,170, 5);
      //red colored method
      drawBoard(170,40, Color.red);
      //rotated method
      drawBoard(170,170);
   }
   
   /*
   * Create board method
   *
   *@param x is the x-axis of the board
   *@param y is the y-axis of the board
   */
   public void drawBoard(int x, int y){
      NscLine vertLeft;
      NscLine vertRight;
      NscLine horizTop;
      NscLine horizBot;
      //NscLine(int x1, int y1, int x2, int y2)
      vertLeft = new NscLine(x + 30, y, x + 30, y + 90);
      vertRight = new NscLine(x + 60, y, x + 60, y + 90);
      horizTop = new NscLine(x, y + 30, x + 90, y + 30);
      horizBot = new NscLine(x, y + 60, x + 90, y + 60);
       
      //add lines to window
      win.add(vertLeft);
      win.add(vertRight);
      win.add(horizTop);
      win.add(horizBot);
      
      win.repaint();
   }
   
   
   /**
   * Colored board version
   *
   *@param x is the x-axis of the board
   *@param y is the y-axis of the board
   *@param color is the color of the lines
   */
      public void drawBoard(int x, int y, Color color){
      NscLine vertLeft;
      NscLine vertRight;
      NscLine horizTop;
      NscLine horizBot;
      //NscLine(int x1, int y1, int x2, int y2)
      vertLeft = new NscLine(x + 30, y, x + 30, y + 90);
      vertRight = new NscLine(x + 60, y, x + 60, y + 90);
      horizTop = new NscLine(x, y + 30, x + 90, y + 30);
      horizBot = new NscLine(x, y + 60, x + 90, y + 60);
       
      //add lines to window
      win.add(vertLeft);
      win.add(vertRight);
      win.add(horizTop);
      win.add(horizBot);
      
      //color the lines
      vertLeft.setForeground(color);
      vertRight.setForeground(color);
      horizTop.setForeground(color);
      horizBot.setForeground(color);
      
      win.repaint();
   }
   
   
   /**
   * 
   * Rectangle line version
   *
   *@param x is the x-axis of the board
   *@param y is the y-axis of the board
   *@param width is the width of the rectangle
   */
   public void drawBoard(int x, int y, int width){
      NscRectangle vertLeft;
      NscRectangle vertRight;
      NscRectangle horizTop;
      NscRectangle horizBot;
      //NscRectangle(int x, int y, int w, int h)
      vertLeft = new NscRectangle(x + 30, y, width, 90);
      vertRight = new NscRectangle(x + 60, y, width, 90);
      horizTop = new NscRectangle(x, y + 30, 90, width);
      horizBot = new NscRectangle(x, y + 60, 90, width);
       
      //add lines to window
      win.add(vertLeft);
      win.add(vertRight);
      win.add(horizTop);
      win.add(horizBot);
      
      // fill rectangles
      vertLeft.setFilled(true);
      vertRight.setFilled(true);
      horizTop.setFilled(true);
      horizBot.setFilled(true);
      
      //color the lines
      vertLeft.setBackground(Color.black);
      vertRight.setBackground(Color.black);
      horizTop.setBackground(Color.black);
      horizBot.setBackground(Color.black);
      
      win.repaint();
   }
   
   
   /**
   *
   * main app method
   *
   *@params args Unused
   */
   
   public static void main(String[] args){
      TicTacToeBoards board = new TicTacToeBoards();
   }


}