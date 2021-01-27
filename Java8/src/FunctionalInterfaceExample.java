import java.util.Scanner;

interface Test {
    public void multiply(int x, int y);

    default void display() {
        System.out.println("This is a default method");
    }

    public String toString();
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        a = sc.nextInt();
        b = sc.nextInt();

        Test t = (x, y) -> System.out.println("The product is :" + x * y);
        t.multiply(a, b);
        t.display();
    }
}
