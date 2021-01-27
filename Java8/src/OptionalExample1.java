import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        String[] str = new String[5];

        // Setting value for 1st index
        str[1] = "I am Siri";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[1]);
        System.out.println(value);
    }
}
