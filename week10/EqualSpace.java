import java.util.List;
import java.util.ArrayList;

public class EqualSpace {

   public static double[] equalSpace(int n, double lo, double hi)
   {
      double[] myArray = new double[n];
      
      myArray[0] = lo;
      
      for(int i = 1; i < myArray.length -1; i++)
      {
         myArray[i] = lo += 1.5;
      }
      myArray[myArray.length -1 ] = hi;
      //System.out.println(myArray);
      return myArray;
   }
   
   


   public static void main(String[] args)
   {
      
      double high = 8.0;
      double low = 2.0;
      double[] a = equalSpace(5,low,high);
      for(int i = 0; i <= a.length -1; i++)
      {
         System.out.println(a[i] + " " );
      }
   
      // double[] passArray = new double[] {4.0,3.2,5.2};
//       
//       equalSpace(passArray);

      //List<String> list = ["A", "B", "C"];
         
       //long st = System.currentTimeMillis();
   
       // List<String> l0 = new ArrayList<String>() {{
//          add("Hello");
//          add("World!");
//        }};
   
       //System.out.println(System.currentTimeMillis() - st);
       //  System.out.println(l0);
   }

}