package Question4;

public class Rectangle {
    float length = 1f;
    float width = 1f;
    float Area;
    float Perimeter;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            this.length = 1f;
        }
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            this.width = 1f;
        }
    }

    void getArea() {
        Area = length * width;
        System.out.println("Area of the Rectangle is :" + Area);
    }

    void getPerimeter() {
        Perimeter = 2 * (length + width);
        System.out.println("Perimeter of the Rectangle is :" + Perimeter);
    }

}
