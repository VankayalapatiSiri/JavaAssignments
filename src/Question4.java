public class Question4 {
    public static void main(String[] args) {
        System.out.println("Enter your first number :");
        int num1 = Integer.parseInt(args[0]);
        System.out.println("Enter any operator like (+,-,*, /) ");
        char operator = args[1].charAt(0);
        System.out.println("Enter your second number :");
        int num2 = Integer.parseInt(args[2]);
        switch (operator) {
            case '+':
                System.out.println("Addition of " + num1 + " and " + num2 + " : " + (num1 + num2));
                break;

            case '-':
                System.out.println("Subtraction of " + num1 + " and " + num2 + " : " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multiplication of " + num1 + " and " + num2 + " : " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division of " + num1 + " and " + num2 + " : " + (num1 / num2));
                break;


            default:
                System.out.println("Please Enter '+', '-', '*', '/'  operator only.");
        }
    }


}

