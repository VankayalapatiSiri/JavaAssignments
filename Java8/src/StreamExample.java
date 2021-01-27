import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Siri","Srikanth","Madhuri","Narayana","Sam");
        list
                .stream()
                .filter(s -> s.startsWith("S"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
