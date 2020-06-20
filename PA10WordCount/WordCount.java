/**
* Intake a file and count the individual types found in the file
*@author Scott Hansford
*@version Standard
*/

public class WordCount {
   
   private static java.util.Map<String, Integer> map;
    
    /**
    * Method to count the tokens found in the file
    * @param text The file to be read
    */       
    public static void tokenCount(String text){
        
        java.util.Scanner scan;
        
        map = new java.util.HashMap<String, Integer>();
        int tryCount = 0;
        int maxTry = 3;
        
        while(true){
        // open the file for reading using Scanner
           try {
               scan = new java.util.Scanner(new java.io.File(text));
               // process the file, token by token
              int i = 0;
              while(scan.hasNext()) {
                   
                  String token = scan.next().toLowerCase();
                  if(!map.containsKey(token))
                  {
                    //System.out.println(map.value(i));
                    map.put(token, 1);             
                  }
                  else
                  {
                     //increment counter for that value 
                     map.put(token, map.get(token) + 1);
                     
                  }
                  i ++;
              }
              
              
              // close the file
              scan.close();
              
              // output statistics
              System.out.print(text + ": " + i + " tokens \n");
              
              map.entrySet().forEach(entry->{
                  System.out.println( entry.getValue() + " : " +  entry.getKey());  
               });        
               break;
                  
           }        
           catch(java.io.FileNotFoundException e) {
               String msg = "File not found";
               System.out.println(msg);
               break;
           }
           catch(java.lang.NullPointerException e) {
               throw e;
           }
        }         
       
                
    }
 
    
    /**
    * Main Method to handle the filename
    *@param Filename Command line argument
    */
    public static void main(String[] args) throws java.io.FileNotFoundException {
       
            tokenCount(args[0]);
        
    }
    
}
