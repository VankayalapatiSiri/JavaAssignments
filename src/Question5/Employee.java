package Question5;

import java.util.Scanner;

public class Employee {
    String emp_name;
    int emp_no;
    Date emp_joining_date;

    Employee() {

    }

    Employee(String emp_name, int emp_no, Date emp_joining_date) {
        this.emp_joining_date = emp_joining_date;
        this.emp_no = emp_no;
        this.emp_name = emp_name;
    }

    void display() {
        System.out.println("Employee Name         " + emp_name);
        System.out.println("Employee Number       " + emp_no);
        System.out.printf("Joining Date          " );
         emp_joining_date.displayDate();
    }

    public static void main(String[] args) {
        String name;
        int number;
        Date date;
        int d, m, y;
        int i = 1;
        while (i <= 2) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the name :");
            name = sc1.nextLine();
            System.out.println("Enter the number");
            number = sc1.nextInt();
            System.out.println("Enter the day :");
            d = sc1.nextInt();
            System.out.println("Enter the month :");
            m = sc1.nextInt();
            System.out.println("Enter the year :");
            y = sc1.nextInt();
            date = new Date(d, m, y);
            Employee e1 = new Employee(name, number, date);
            e1.display();
        }
    }
}
