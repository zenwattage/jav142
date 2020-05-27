/**
*@author Scott Hansford
*@version PA:6: Pascals Triangle
*@version Standard
*/

public class PascalsTriangle extends PascalsTriangleBase {
   
   /**
   * Prints triangles based on CLI inputs
   *@author SID: 991162027
   *@params args Command-line arguments
   */

   public static void main(String[] args)
   {
   
      /*If there are no command-line arguments, main shall call printTriangle five (5) times,
       as described above. For the Minimal level, if there are command-line arguments,
       main shall print only a single line "command-line arguments ignored" and then exit.*/
      PascalsTriangleBase test = new PascalsTriangle();
      test.printTriangle(5);
      
      //if cli = "all" print 0-10 triangles
      args = new String[1];
      
      if( "all".equals(args[0]))
      {
         for(int i = 0; i <= 10; i++)
         {
            test.printTriangle(i);
         }
      }
      // if no arg is input
      if(args[0] == null)
      {  
         test.printTriangle(1);
         test.printTriangle(2);
         test.printTriangle(4);
         test.printTriangle(10);
      }
      //past arg to int them print equiv triangles
      else
      {
         int num;         
         num = Integer.parseInt( args[0]);
         test.printTriangle(num);
      }
      
   }//end of main
   
   
   /**
   * Overriding printInt to print spaces according to LA7
   *@param num Number of spaces to be printed
   */
   protected void printInt(int num)
   {
      if( num <= 9)
      {
         // single digits 5 spaces
         System.out.print( num + "     ");
      }
      
      if( num > 9 && num < 99)
      {  
         // double digits 4 spaces
         System.out.print( num + "    ");
      }
      
      if( num > 99 && num < 999)
      {
         //tripple digits 3 spaces
         System.out.print( num + "   ");
      }
   }
   
   /**
     * This method calculates the binomial coefficient, n choose k. These 
     * values are used to construct Pascal's Triangle. They are called
     * <i>binomial coefficients</i> because "n choose k" is the value of
     * the coefficient of the x<sup>k</sup> term in the expansion of
     * (1 + x)<sup>n</sup>.
     * <p>For this assignment, it should use the factorial algorithm; that 
     * is the return value should be calculated as n! / (k! (n-k)!). For 
     * the minimal and standard levels, this shall always involve calling
     * a factorial function three times.
     *
     * @param n The power for the binomial expansion
     * @param k The order of the term in the binomial expansion
     * @return The coefficient of the k<sup>th</sup> term.
     */

   
   protected int nChooseK(int n, int k)
   {
      int a;
      int b;
      int c;
      int gap = n - k;
      
      if(n < 10)
      {  
         // prevent 
         if( n != 0 && k != 0 && n != k)
         {
            a = factorialCalculation(n);
            b = factorialCalculation(k);
            c = factorialCalculation(gap);
            
            return a/(b * c);
         }
         else 
         {
            return 1;
         }
      }
      return 1;
   }
   
   /**
   * Override printOne to print base 1's and indentations
   *
   * @param row The number of the row being printed
   * @param height The height of the completed triangle
   */
   protected void printOne(int row, int height)
   {
      String str = "   ";
      for(int i = row; i < height; i++ )
      {
         System.out.print(str);
      }
      printInt(1);
   }
   
   
   /**
   * Check for negative height input or input above upper limit
   * @param height of triangle
   * @return returns true or false
   */
   protected boolean heightOutOfRange(int height)
   {
      if( height < 0 || height > 10 )
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   
   /**
   * Private helper function to calculate factorial
   * @param num Number to be factorialized
   * @return factoriliazed number
   */
   private int factorialCalculation(int num)
   {
      for( int i = num -1; i >= 1; i--)
      {
         num *= i;
      }
      
      return num;
   }   

}//end class