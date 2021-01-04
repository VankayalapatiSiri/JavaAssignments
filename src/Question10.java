import java.util.Scanner;

class Term {

    int coefficient;
    int exponent;

    Term() {
        coefficient=0;
        exponent=0;
    }
}

class Polynomial {

    Term terms[];
    int top=0;

    Polynomial(int n) {
        terms = new Term[n];
        for(int i=0; i<n; i++)
            terms[i] = new Term();
    }

    public void setTerm(int exp, int coeff,int size) {
        for(int i=0; i<top; i++) {
            if(exp == terms[i].exponent) {
                System.out.println("Same Exponent cannot be input twice!");
                return;
            }
        }
        if(top == size) {
            System.out.println("Polynomial size exceeded!");
            return;
        }
        if(exp < 0) {
            System.out.println("Exponent can't be negative!");
            return;
        }
        terms[top].coefficient = coeff;
        terms[top].exponent = exp;
        top++;
    }

    public void sort() {
        Term temp= new Term();
        for(int i=0; i<top-1; i++) {
            for(int j=i+1; j<top; j++ ) {
                if(terms[i].exponent > terms[j].exponent) {
                    temp= terms[i];
                    terms[i]=terms[j];
                    terms[j]=temp;
                }
            }
        }
    }

    public void print() {
        System.out.printf(" %dx^%d", terms[0].coefficient, terms[0].exponent);
        for(int i=1; i<top; i++)
            System.out.printf(" + %dx^%d", terms[i].coefficient, terms[i].exponent);
    }
}
public class Question10 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of terms: ");
        int n = scan.nextInt();

        Polynomial poly = new Polynomial(n);
        System.out.println("Enter no. of terms in which data is to filled: ");
        int t = scan.nextInt();

        for(int i=0; i<t; i++) {
            System.out.println("Enter co-efficient value: ");
            int coeff=scan.nextInt();
            System.out.println("Enter exponent value: ");
            int exp=scan.nextInt();
            poly.setTerm(exp, coeff,n);
        }
        poly.sort();
        poly.print();

    }
}
