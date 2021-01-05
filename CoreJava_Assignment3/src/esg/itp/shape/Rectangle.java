package esg.itp.shape;

public class Rectangle implements Polygon {
    float length;
    float breadth;

    public Rectangle(int length, int breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public float calcArea() {
        return length * breadth;
    }

    @Override
    public float calcPeri() {
        return 2 * (length + breadth);
    }

    @Override
    public void display() {
        System.out.println("Area of Rectangle is :" + length * breadth);
        System.out.println("Perimeter of Rectangle is :" + 2 * (length + breadth));
    }
}
