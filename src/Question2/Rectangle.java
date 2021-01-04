package Question2;

public class Rectangle {
    float length = 0;
    float breadth = 0;
    float Area = 0;

    Rectangle() {

    }

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float getArea() {
        Area = length * breadth;
        //System.out.println("Area is : "+Area);
        return Area;
    }

    public void display() {
        System.out.println("Length of the Rectangle is " + length);
        System.out.println("Breadth of the Rectangle is " + breadth);
        System.out.println(new StringBuilder().append("Area of the Rectangle is ").append(getArea()).toString());

    }
}
