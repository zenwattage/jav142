public class Sphere {
   
   // public final int radius;
   
   public static double Sphere(double radius)
   {
      final double volume = (4 * Math.PI * Math.pow( radius, 3)) / 3;
      return volume;
   }
   
   
   public static void main(String[] args)
   {
      System.out.println(Sphere(48));
   }
}