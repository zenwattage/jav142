public class reverseArray { 
  
    /* function that reverses array and stores it  
       in another array*/
    static void reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n");
        System.out.print(b[0] + ","); 
        for (int k = 1; k < n -1; k++) { 
            System.out.print(b[k] + ","); 
        } 
        System.out.print(b[b.length-1]);
    } 
  
   //  public static void main(String[] args) 
//     { 
//         //int [] arr = {10, 20, 30, 40, 50}; 
//         int [] arr = {};
//         reverse(arr, arr.length); 
//     }

      public static void main(String[] args) {
 
        int[] array = {1, 2, 3};
        //System.out.println("array before reverse: " + Arrays.toString(array) );
 
        for(int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
         
         for(int check : array )
         {
            System.out.print(Arrays.toString(check);
            }
        //System.out.println("array after reverse: " + Arrays.toString(array) );
    } 
} 