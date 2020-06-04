
public class RemoveN 
{
   public static int[] removeN(int[] list, int n) {
   
     int count = 0;
     for(int check : list)
     {
        if(check != n)
        {  
           count++;
        }
     }
     
     int[] newList = new int[count];
   
     int i = 0;
     int idx = 0;
     for(int check : list)
     {
             
        if(check != n)
        {
           idx = check;
           newList[i] = idx;
           i++;
        }
     }
     return newList;
   }
   
   public static void main(String[] args)
   {
      int[] nums = new int[] {4, 5, 4, 4, 8, 2, 4};
      System.out.println(removeN(nums, 4));
   }  
}
