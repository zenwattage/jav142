/**
* Overriding methods from SieveDriverBase
*@author Scott Hanford
*@version Sieve of Erastosthenes
*@version Standard
*/

public class SieveDriver extends SieveDriverBase {
   
      private int n;
     
    
    
    
    public SieveDriver() {
//      Inatantiate your Sieve implementation and 
//      bind it to theSieve field in SieveDriverBase          
      theSieve = new MySieve();
    }
    
    public void go() 
    {
      do
      {
         super.go();
         theSieve = new MySieve();
      }while( n != 0);
    }
    
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        new SieveDriver().go();
        long endTime = System.nanoTime();
      
        
        long duration = (endTime - startTime); //divide by 1000000 to get milliseconds.
        System.out.println(duration);
        
    }
    
}
