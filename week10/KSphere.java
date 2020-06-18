public class KSphere{

        private final double radius;

        private final double volume;

        public Sphere(double rad){
            radius = rad;
            volume = (4.0 / 3.0) * Math.PI * (radius * radius * radius);
        }
    }