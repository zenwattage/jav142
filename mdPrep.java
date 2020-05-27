/**
*@author Scott Hanford
*@version helloWorld 1.0
*/

/**
* Will print hello world to the terminal
*
*/
public class mdPrep {
   public String words;
   // constructor
   public mdPrep() {
       words = "Hello World";
   
   }
   
   /**
   * Main method
   *
   *@params args the command line arguments
   */
   public static void main(String[] args) {
      mdPrep test = new mdPrep();
      System.out.print(test.words);
   }
}