import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

class Employee3 {
    int id;
    int age;
    String name;
    Double monthlySalary;

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


    Employee3(int id, String name, int age, double monthlySalary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
    public static double calculateAverage(List<? extends Employee3> employees)
    {
        int totalEmployee = employees.size();
        double totalSalary = 0;
        for(Employee3 e : employees){
            totalSalary += e.getMonthlySalary();
        }
        double average = totalSalary/totalEmployee;
        return average;
    }



}

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Employee3> list = Arrays.asList(
                new Employee3(10, "raj", 32, 10000),
                new Employee3(11, "rak", 30, 18000),
                new Employee3(12, "jak", 25, 15000),
                new Employee3(12, "raj", 25, 15000),
                new Employee3(13, "kris", 42, 23000),
                new Employee3(13, "rak", 42, 18000));


        Consumer<List<Employee3>> businessLogic = l -> {
            for (int i = 0; i < l.size(); i++) {
                double salary = l.get(i).getMonthlySalary();
                if (salary * 12 < 200000)
                    salary += salary * 0.15;
                else
                    salary += salary * 0.05;
                Employee3 temp = new Employee3(l.get(i).getId(), l.get(i).getName(), l.get(i).getAge(), salary);
                l.set(i, temp);

            }
        };
        Consumer<List<Employee3>> avg = l -> {
            int totalEmployee = l.size();
            double totalSalary = 0;
            for(Employee3 e : l)
            {
                totalSalary += e.getMonthlySalary();
            }
            double average = totalSalary/totalEmployee;
            System.out.println("The Average Salary is : " +average);

        };
        Consumer<List<Employee3>> count = l -> {
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (Employee3 i : l) {
                String name = i.getName();
                Integer j = map.get(name);
                map.put(name, (j == null) ? 1 : j + 1);
            }
            for (Map.Entry<String, Integer> entry : map.entrySet())
                System.out.println("Name = " + entry.getKey() +
                        ", Occurrence = " + entry.getValue());

        };

        Consumer<List<Employee3>> printConsumer = l -> l
                .stream()
                .sorted((Employee3 e1, Employee3 e2) -> (int) (e1.getMonthlySalary() - e2.getMonthlySalary()))
                .forEach(e -> System.out.println("Sorted by Salary :" + e));


        Consumer<List<Employee3>> printConsumerSortedByName = l -> l
                .stream()
                .sorted((Employee3 e1, Employee3 e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(e -> System.out.println("Sorted by Name :" + e));

        Consumer<List<Employee3>> totalSalary = l -> System.out.println("Total Salary is :" + l
                .stream()
                .mapToDouble(Employee3::getMonthlySalary)
                .reduce(0, (value1, value2) -> value1 + value2));
        Consumer<List<Employee3>> avgS = l -> l
                .stream()
                .mapToDouble(Employee3::getMonthlySalary)
                .average();
//       Consumer<List<Employee3>> avgSalary = l -> System.out.println("Total Average Salary is :" + l
//             .stream()
//              .mapToDouble(Employee3::getMonthlySalary)
//               .reduce(0,Double::calculateAverage));
        Consumer<List<Employee3>> maxSalary = l -> System.out.println("Maximum Salary is :" + l
                .stream()
                .mapToDouble(Employee3::getMonthlySalary)
                .reduce(0, (a, b) -> a > b ? a : b));
        Consumer<List<Employee3>> minSalary = l -> System.out.println("Minimum Salary is :" + l
                .stream()
                .mapToDouble(Employee3::getMonthlySalary)
                .reduce(0, (a, b) -> a < b ? a : b));
        businessLogic.andThen(printConsumer).andThen(totalSalary).andThen(avg).andThen(maxSalary).andThen(minSalary).andThen(printConsumerSortedByName).andThen(count).accept(list);

    }
}
