/**
* Small program for comparing string values to check for duplicates
*/

import java.util.Scanner;

public class dupeTester {


   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in); 
      System.out.println("enter a string: " );
      String temp = input.nextLine();
      
      String[] myStrings = new String[] {"shit","cunt","fuck","fart","cunt"};
      
      
      for(int i = 0; i < myStrings.length; i++)
      {
         if(myStrings[i].equals(temp))
         {
            System.out.println("dupe found");
         } 
         temp = input.nextLine();
      }
      
     
   
   }


}