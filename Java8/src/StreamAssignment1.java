import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

class Employee2 {
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


    Employee2(int id, String name, int age, double monthlySalary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }


}

public class StreamAssignment1 {
    public static void main(String[] args) {
        List<Employee2> list = Arrays.asList(
                new Employee2(10, "raj", 32, 10000),
                new Employee2(11, "rak", 30, 18000),
                new Employee2(12, "jak", 25, 15000),
                new Employee2(12, "raj", 25, 15000),
                new Employee2(13, "kris", 42, 23000),
                new Employee2(13, "rak", 42, 18000));
        Consumer<List<Employee2>> businessLogic = l -> {
            for (int i = 0; i < l.size(); i++) {
                double salary = l.get(i).getMonthlySalary();
                if (salary * 12 < 200000)
                    salary += salary * 0.15;
                else
                    salary += salary * 0.05;
                Employee2 temp = new Employee2(l.get(i).getId(), l.get(i).getName(), l.get(i).getAge(), salary);
                l.set(i, temp);

            }

        };
        Consumer<List<Employee2>> count = l -> {
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (Employee2 i : l) {
                String name = i.getName();
                Integer j = map.get(name);
                map.put(name, (j == null) ? 1 : j + 1);
            }
            for (Map.Entry<String, Integer> entry : map.entrySet())
                System.out.println("Name = " + entry.getKey() +
                        ", Occurrence = " + entry.getValue());

        };
        Consumer<List<Employee2>> printConsumer = l -> l
                .stream()
                .sorted((Employee2 e1, Employee2 e2) -> (int) (e1.getMonthlySalary() - e2.getMonthlySalary()))
                .forEach(e -> System.out.println("Sorted by Salary :" + e));

        Consumer<List<Employee2>> printConsumerSortedByName = l -> l
                .stream()
                .sorted((Employee2 e1, Employee2 e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(e -> System.out.println("Sorted by Name :" + e));
        businessLogic.andThen(printConsumer).andThen(printConsumerSortedByName).andThen(count).accept(list);

    }
}
