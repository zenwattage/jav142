public class PlanePoint {
   
   public static double theta;
   
   public PlanePoint(int x, int y) {
      
   }
   
   public double getRadius() {
      return 1;
   }
   
   public double getTheta() {
      return 1;
   }
   
   
   public static void main(String[] args)
   {
      PlanePoint test = new PlanePoint(0,-5);
      
      theta = test.getTheta();
   }
}