import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//Reference to an Instance Method of a Particular Object
class Intern{
    int age;
    String name;
    Intern(int age,String name){
        this.age=age;
        this.name=name;

    }


    @Override
    public String toString() {
        return "Intern{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class AgeComparator implements Comparator<Intern> {

    @Override
    public int compare(Intern o1, Intern o2) {
        return o1.age - o2.age;
    }
}
public class MethodReferencesExample2 {
    public static void main(String[] args) {

        AgeComparator internAgeComparator = new AgeComparator();
        List<Intern> list= Arrays.asList(
                new Intern(21,"Siri"),
                new Intern(25,"Srikanth"),
                new Intern(20,"Manali")
        );
        list.stream().sorted(internAgeComparator::compare).forEach(System.out::println);
    }
}

