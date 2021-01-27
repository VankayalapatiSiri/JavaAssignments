import java.util.Scanner;

@FunctionalInterface
interface SimpleInterest {
    void getSimpleInterest(double p, double t, double r);

}

public class FunctionalInterfaceExample2 {
    public static void main(String[] args) {
        double principal, time, rate;
        SimpleInterest si = (p, t, r) -> System.out.println("The Simple Interest is :" + (p * t * r) / 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount ");
        principal = sc.nextDouble();
        System.out.println("Enter the time period :");
        time = sc.nextDouble();
        System.out.println("Enter the rate :");
        rate = sc.nextDouble();
        si.getSimpleInterest(principal, time, rate);
    }
}
