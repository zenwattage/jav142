/**
*
*@author Scott Hanford
*@version Sieve of Eratosthenes
*/

public class MySieve implements Sieve
{

   //instance variables
   
   private int currentPrime;
   private int M;
   private java.util.ArrayList<Integer> numberList;
   private java.util.ArrayList<Integer> primeList;
   
   /**
   * Zero param constructor
   */
   public MySieve()
   {
      numberList = new java.util.ArrayList<Integer>();
      primeList = new java.util.ArrayList<Integer>();
   }

   /**
   * Override getPrimes to square user input and get primes
   * @param n Number to square to get upper limit
   */
   @Override
   public java.util.List<Integer> getPrimes(int n)
   {
      // square root of n to get upper limit
      M = (int)Math.sqrt(n);
      
      // add numbers to list
      for(int i = 2; i <= n; i++)
      {
         numberList.add(i);
      }
      
      
      if(n >= 2)
      {
         //start at 2
         currentPrime = numberList.get(0);
         primeList.add(currentPrime);
         
         //remove duplicates and composites
         for(int j = 0; j < numberList.size(); j++)
         {
            if(numberList.get(j) % currentPrime == 0)
            {
               numberList.remove(j);
            }
         }
         
         //while in upperlimit
         while(currentPrime < M)
         {
            //start at first number in numberList and add to primes
            int k = 0;
            currentPrime = numberList.get(k);
            primeList.add(currentPrime);
            
            if(numberList.get(k) % currentPrime == 0)
            {
               numberList.remove(k);
            }
         
         }
         
         //add rest of composites to primes
         for(int h = 0; h < numberList.size(); h++)
         {
            primeList.add(numberList.get(h));
         }
      }
      
      return primeList;
   
   }




}