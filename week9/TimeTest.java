public class TimeTest 
{
   
   public static void main(String[] args)
   {
      long startTime = System.nanoTime();
      
      long endTime = System.nanoTime();
      
      long duration = (endTime - startTime); //divide by 1000000 to get milliseconds.
   }


}