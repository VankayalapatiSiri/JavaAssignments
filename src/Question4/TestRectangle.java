package Question4;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        float length, breadth;
        System.out.println("Enter Length and Breadth for first object :");
        Scanner sc1 = new Scanner(System.in);
        length = sc1.nextFloat();
        breadth = sc1.nextFloat();
        Rectangle obj1 = new Rectangle();
        obj1.setLength(length);
        obj1.setWidth(breadth);
        obj1.getArea();
        obj1.getPerimeter();
    }
}
