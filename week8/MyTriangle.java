public class MyTriangle extends MyShape {

    public MyTriangle(int h, int w) {
        super(h, w);
    }

    public double getArea() {
        return 1/2 * height * width;
    }

}