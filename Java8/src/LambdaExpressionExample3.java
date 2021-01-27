import java.util.Scanner;

interface Operations {
    void performOperations(int x, int y);
    default void display(){
        System.out.println("Arithmetic Operations");
    }
}

public class LambdaExpressionExample3 {
    public static void main(String[] args) {
        Operations o = (a, b) -> System.out.println("The sum is :" + (a + b) +"\n"+  "The product is :" + a * b +"\n" +"The difference is :" + (a - b));
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        x = sc.nextInt();
        y = sc.nextInt();
        o.display();
        o.performOperations(x, y);
    }
}
