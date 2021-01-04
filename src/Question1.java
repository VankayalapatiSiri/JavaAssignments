import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("List of all the even numbers less than and equal to " + n + " are:");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
