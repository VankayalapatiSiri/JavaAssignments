import java.util.Arrays;
import java.util.List;

class Employee1 {
    int id;
    int age;
    String name;
    Double monthlySalary;
    //Double annualSalary = monthlySalary * 12;

    public int getAge() {
        return age;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    Employee1(int id, String name, int age, double monthlySalary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }
    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }

    public Double incrementSalary() {
        if (monthlySalary * 12 < 200000) { //annualSalary = monthlySalary * 12
            monthlySalary += monthlySalary * .15;
        } else
            monthlySalary += monthlySalary * .05;
        return monthlySalary;
    }
}

public class StreamAssignment {
    public static void main(String[] args) {
        List<Employee1> list = Arrays.asList(
                new Employee1(10, "raj", 32, 10000),
                new Employee1(11, "rak", 30, 18000),
                new Employee1(12, "jak", 25, 15000),
                new Employee1(13, "kris", 42, 23000));

        list
                .stream()
                //sorting by name
                .sorted((Employee1 e1, Employee1 e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(System.out::println);
        System.out.println();

        list
                .stream()
                //sorting by salary
                .sorted((Employee1 e1, Employee1 e2) -> (int) (e1.getMonthlySalary() - e2.getMonthlySalary()))
                .forEach(System.out::println);

        System.out.println();

        list
                .stream()
                //incrementing salary based on the given condition
                .forEach(e -> System.out.println(e.getMonthlySalary() + " incremented to : " + e.incrementSalary()));


    }
}
