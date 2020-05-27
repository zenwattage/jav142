// Scott Hansford
// SE1: Basic Programming Competence


public class SE1 {
   //main method
   public static void main(String[] args){
      // declare an array that can hold 15 integer values
      int[] numbers = new int[15];
      // use a loop to put the integer values 5, 6, 7, … 18, 19 into the array
      int j = 0;
      for(int i = 5; i < 20; i++){
            numbers[j] = i;
            j++;
      }
      
      // pass the array to the helper function which will return an integer value
      // print out the value returned by the helper function
      System.out.println("The sum is: " + sum(numbers));
   }

   //helper method
   public static int sum(int[] intArray){
      // traverse the array values found in the array, totaling the values that are odd or a multiple of 3.
      int sum = 0;
      for(int element: intArray){
         if(element % 2 != 0 || element % 3 == 0){
            sum += element;
         }
      }
      // return the sum of those values.
      return sum;
   }


}