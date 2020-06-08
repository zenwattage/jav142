
/**
 * Write a description of class MaxDiff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MaxDiff
{
    public int maxDelta(int[] a) {
  int dif = 0;
  int max = 0;
  for(int i = 0; i < a.length - 1; i++){
      dif = Math.abs(a[i] - a[i+1]);
      if(dif > max){
          max = dif;
      }
  }
    return max;
  
}
}
