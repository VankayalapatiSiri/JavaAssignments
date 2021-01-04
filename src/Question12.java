import java.util.Scanner;

class Complex {
    float real;
    float img;

    Complex() {
        real=0;
        img=0;
    }

    Complex(float r, float i) {
        real=r;
        img=i;
    }

    public void addition(Complex c1, Complex c2) {
        real = c1.real + c2.real;
        img = c1.img + c2.img;
        System.out.println("Sum of "+ c1.real +"+"+ c1.img +"i & " + c2.real +"+"+ c2.img +"i is: " + real +"+"+ img +"i");
    }

    public void subtraction(Complex c1, Complex c2) {
        real = c1.real - c2.real;
        img = c1.img - c2.img;
        System.out.println("Difference between "+ c1.real +"+"+ c1.img +"i & " + c2.real +"+"+ c2.img +"i is: " + real +"+"+ img +"i");
    }
}
public class Question12 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter real & imaginary values for 1st complex no.: ");
        float a1 = scan.nextFloat();
        float b1 = scan.nextFloat();

        System.out.println("Enter real & imaginary values for 1st complex no.: ");
        float a2 = scan.nextFloat();
        float b2 = scan.nextFloat();

        Complex c1= new Complex(a1,b1);
        Complex c2= new Complex(a2,b2);

        Complex c3 = new Complex();
        c3.addition(c1,c2);
        c3.subtraction(c1,c2);
    }
}
