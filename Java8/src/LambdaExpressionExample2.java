import java.util.Scanner;

@FunctionalInterface
interface NaturalNumbers {
    public void getSum(int n);

    default void display() {
        System.out.println("These are natural numbers");
    }
}

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        int number;
        NaturalNumbers x = (n) -> System.out.println("Sum of the first " + n + " natural numbers is :" + n*(n + 1) / 2);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the natural number : ");
        number=sc.nextInt();
        x.getSum(number);
    }
}
