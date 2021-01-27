import java.util.Arrays;

public class ResuceExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);
        int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);
        System.out.println("The sum is :"+sum);
        System.out.println("the Average is :"+sum/ numbers.length);
        System.out.println("max is :"+max);
        System.out.println("min is :"+min);

    }
}
