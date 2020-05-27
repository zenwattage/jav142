/**
*@author Scott Hansford
*@version LA5: Loops
*@version 5/11/2020
*/

/**
* Three loop methods that will count from 1 to 630 by increments of 37
*/

public class Loops {
   /* for loop */
   public static void myForLoop() {
      System.out.print(1);
      for(int i = 2; i <= 630; i++){
         // add 36 to account for i starting at 2
         i += 36;
         System.out.print(", " + i);
      }
      System.out.print(".");
   }
   
   /* while loop */
   public static void myWhileLoop(){
      System.out.print(1);
      int i = 2;
      while(i <= 630){
         i += 37;
         int j = i - 1;
         System.out.print(", " + j);
      }
      System.out.print(".");
   }
   
   /* do while loop */
   public static void myDoWhileLoop(){
      System.out.print(1);
      int i = 2;
      do{
         i += 37;
         int j = i - 1; 
         System.out.print(", " + j);
      }while(i <= 630);
      System.out.print(".");
   }
   
   

   /**
   * The application method. This is what runs the program.
   *
   * @param args The command-line arguments
   */
   public static void main(String[] args){
      myForLoop();
      System.out.println();     
      myWhileLoop();
      System.out.println();
      myDoWhileLoop();
   
   }

}