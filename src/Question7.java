public class Question7 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum = 0;
        System.out.println(num1 + " " + num2);
        for (int i = 0; i <= 13; i++) {
            sum=num1+num2;
            num1=num2;
            num2=sum;
            System.out.println(num1);

        }
    }
}
