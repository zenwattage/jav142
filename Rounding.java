/**
*@author Scott Hansford
*@version SA5: Rounding
*@version 5/11/20
*/

public class Rounding {

   public static void main(String[] args) {
      float number = 3.0f;
      
      
      for(int i = 0; i < 35; i++){
         number *= 10.0;
         System.out.println("Iteration: " + i + " " + number);
            
      }
   }

}
/*

    What is the value where the round-off error is first apparent?
      2.99999995E17
    Which iteration is the round-off error first apparent?
      16
    What is the significance of the letter 'f' in the assignment of the initial value of the variable number?
      the 'f' is forcing the double into  float literal
    What happens if the 'f' is omitted in the initial value?
      we get an error: incompatible types: possible lossy conversion from double to float
*/
