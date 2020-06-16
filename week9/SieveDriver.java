/**
* Overriding methods from SieveDriverBase
* @author Scott Hanford
* @version Sieve of Erastosthenes
* @version Standard
*/

public class SieveDriver extends SieveDriverBase {
   
      private int n;
      private int percent;
     
    public SieveDriver() {
//      Inatantiate your Sieve implementation and 
//      bind it to theSieve field in SieveDriverBase          
      theSieve = new MySieve();
    }
    
    //override go() to continually prompt
    public void go() 
    {
      do
      {
         super.go();
         theSieve = new MySieve();
      } while( n != 0);
    }
    
    /**
    * Validate user input with getNumber override
    */
    public int getNumber()
    {
      n = super.getNumber();
      
      while( n < 0 )
      {
         System.out.println("Enter a positive integer: ");
         n = super.getNumber();
      }
         return n;
    }
    
    
    /**
    * Override the printPrimes method of SieveDriverBase.
      The override shall use the Iterator interface to get the values from the list, rather than the get method.
      The override shall also format the output: 12 numbers per line.
      Following the list of primes, print out the percentage of the numbers between 1 and N that are prime.
      This value shall be rounded to the nearest integer value.
      
      @param limit upper limit for prime search
      @param list list of integers to search 
    */
    
    public void printPrimes(int limit, java.util.List<Integer> list) {
    
      System.out.print("Here are the primes up to " + limit);
      //iterator over list of primes
      java.util.Iterator<Integer> intList = list.iterator();
      
      int counter = 0;
      while( intList.hasNext() )
      {
         //limit line to 12 primes
         if( counter % 12 == 0)
         {
            System.out.println("");
         }
      
         System.out.print(intList.next() + " ");
         
         counter++;
         
         // calculates the percentage of numbers that a prime
         percent = (( counter * 100 ) / limit);
     
      }
       
      System.out.println("");
      
      if( limit >= 2){
         //prints about the pecentage of n that are primes
         System.out.println(percent + "% of the numbers between 1 and "+ limit +" are prime.");
      }
      else
      {
         System.out.println("There are no prime numbers up to " + limit);
      }
         System.out.println("");
      }
    
    
    /**
    * Main application method
    * @param args Command line arguments
    */
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        new SieveDriver().go();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);
        
    }
    
}
