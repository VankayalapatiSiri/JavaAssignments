package Question2;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        float length, breadth;
        System.out.println("Enter Length and Breadth for first object :");
        Scanner sc1 = new Scanner(System.in);
        length = sc1.nextFloat();
        breadth = sc1.nextFloat();
        Rectangle obj1 = new Rectangle(length, breadth);
        obj1.display();

        System.out.println("Enter Length and Breadth for second object :");
        Scanner sc2 = new Scanner(System.in);
        length = sc2.nextFloat();
        breadth = sc2.nextFloat();
        Rectangle obj2 = new Rectangle(length, breadth);
        obj2.display();

        System.out.println("Enter Length and Breadth for third object :");
        Scanner sc3 = new Scanner(System.in);
        length = sc3.nextFloat();
        breadth = sc3.nextFloat();
        Rectangle obj3 = new Rectangle(length, breadth);
        obj3.display();

        System.out.println("Enter Length and Breadth for fourth object :");
        Scanner sc4 = new Scanner(System.in);
        length = sc4.nextFloat();
        breadth = sc4.nextFloat();
        Rectangle obj4 = new Rectangle(length, breadth);
        obj4.display();

        System.out.println("Enter Length and Breadth for fifth object :");
        Scanner sc5 = new Scanner(System.in);
        length = sc5.nextFloat();
        breadth = sc5.nextFloat();
        Rectangle obj5 = new Rectangle(length, breadth);
        obj5.display();

    }
}
