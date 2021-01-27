import java.util.ArrayList;
import java.util.Collections;

class Employee {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    Employee() {
    }

    Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}


public class SortingLambdaExpression {
    public static void main(String[] args) {
        ArrayList<Employee> ar = new ArrayList<Employee>();
        ar.add(new Employee(22, "Siri"));
        ar.add(new Employee(21, "Manali"));
        ar.add(new Employee(25, "Srikanth"));
        ar.add(new Employee(24, "Ritik"));
        ar.add(new Employee(23, "Kajal"));
        //using forEach to print the ArrayList
        System.out.println("Before Sorting the Employee List:");
        ar.forEach((s) -> System.out.println(s));
        System.out.println();

        System.out.println("After Sorting the Employees by Age in ascending order:");
        //Lambda expression for sorting by age
        Collections.sort(ar, (Employee e1, Employee e2) -> e1.getAge() - e2.getAge());
        ar.forEach((s) -> System.out.println(s));
        System.out.println();

        System.out.println("After Sorting the Employees by Age in descending order:");
        //Lambda expression for sorting by age
        Collections.sort(ar, (Employee e1, Employee e2) -> e2.getAge() - e1.getAge());
        ar.forEach((s) -> System.out.println(s));
        System.out.println();

        System.out.println("After Sorting the Employees by Name in ascending order:");
        //Lambda expression for sorting the list by student name
        Collections.sort(ar, (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
        ar.forEach((s) -> System.out.println(s));

        System.out.println("After Sorting the Employees by Name in descending order:");
        //Lambda expression for sorting the list by student name
        Collections.sort(ar, (Employee e1, Employee e2) -> e2.getName().compareTo(e1.getName()));
        ar.forEach((s) -> System.out.println(s));
    }

}
