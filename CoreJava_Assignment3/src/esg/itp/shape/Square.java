package esg.itp.shape;

public class Square implements Polygon {
    float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float calcArea() {
        return side * side;
    }

    @Override
    public float calcPeri() {
        return 4 * side;
    }

    @Override
    public void display() {
        System.out.println("Area of square is :" + side * side);
        System.out.println("Perimeter of sqaure is :" + 4 * side);

    }

}

