import java.util.Scanner;

class CalcAverage {
    public double avgFirstN(int N) {
        if (N < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException nf) {
                System.out.println("We Must Enter a Positive Number");
            }
        } else {
            N = (N + 1) / 2;

            System.out.println("THe Average is :" + N);
        }

        return N;
    }
}

class Number {
    int firstNumber;
    int secondNumber;
    double result;

    Number(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    double add() {
        result = firstNumber + secondNumber;
        System.out.println(result);
        return result;
    }

    double sub() {
        result = firstNumber - secondNumber;
        System.out.println(result);
        return result;
    }
    double mul(){
        result = firstNumber * secondNumber;
        System.out.println(result);
        return result;
    }
    double div(){
            try{
                result = firstNumber / secondNumber;
            }
            catch
                (ArithmeticException e) {
                    // Exception handler
                    System.out.println("Divided by zero operation cannot possible");
                }


        System.out.println(result);
        return result;
    }
}

public class Question3 {
    public static void main(String[] args) {
        CalcAverage ca=new CalcAverage();
        ca.avgFirstN(-1);
        Number num=new Number(2,0);
        System.out.println("Select an operation:");
        System.out.println("1:Add");
        System.out.println("2:Subtract");
        System.out.println("3:Multiply");
        System.out.println("4:Divide");
        Scanner sc=new Scanner(System.in);

        int a = sc.nextInt();
        switch(a){
            case 1:num.add();
            break;
            case 2:num.sub();
            break;
            case 3:num.mul();
            break;
            case 4:num.div();
            default:
                break;
        }
    }
}
