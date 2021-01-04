import java.util.Scanner;

class Matrix {

   public int[][] mat = new int[10][10];
    int rows, columns;

    Matrix() {
        for(int i=0; i<10; i++)
            for(int j=0; j<10 ; j++)
                mat[i][j]=0;
    }

    Matrix(int r, int c) {
        super();
        rows= r;
        columns=c;
    }

    public void setElement(int r, int c, int value) {
        if(r>=0 && r<10 && c>=0 && c<10) {
            if(value>0)
                mat[r][c]=value;
            else mat[r][c]=0;
        }
    }

    Matrix transpose() {
        Matrix temp = new Matrix();
        for(int i=0; i<10; i++)
            for(int j=0; j<10; j++)
                temp.mat[i][j]=mat[j][i];

        return temp;
    }
}

public class Question11 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row & column values: ");
        int row = scan.nextInt();
        int col = scan.nextInt();

        Matrix matrix = new Matrix(row, col);
        System.out.println("Enter the number of values to input :");
        int t = scan.nextInt();
        for(int i=0; i<t; i++) {
            System.out.println("Enter value");
            int val = scan.nextInt();
            System.out.println("Enter row & column values: ");
            row = scan.nextInt();
            col = scan.nextInt();
            matrix.setElement(row, col, val);
        }
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
                System.out.printf("%d ", matrix.mat[i][j]);
            System.out.println("");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        Matrix transpose = matrix.transpose();
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
                System.out.printf("%d ", transpose.mat[i][j]);
            System.out.println("");
        }
    }
}
