import java.util.List;
public class KPosMaxMin{

public float[] posMaxMin(java.util.List<Float> vals){
   
    List[] arr = new List[]{-1,-1};
     
   java.util.Iterator<Float> it = vals.iterator();
   float temp;
   while(it.hasNext())
   {
      temp = it.next();
      if(temp > 0)
      {
          if(arr[0] == -1)
          {
               arr[0] = temp;
               arr[1] = temp;
          }
         else
         {
            if(temp < arr[0])
            {
               arr[0] = temp;
            }
         else if(temp > arr[1])
         {
            arr[1] = temp;
         }
      }
   }
   }
     if(arr[0] == -1)
     {
         arr[0] = 0;
         arr[1] = 0;
     }
   return arr;
   }
   
   public static void main(String[] args)
   {
         posMaxMin();
   
   }
    
}