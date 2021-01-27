import java.util.Optional;

public class OptionalExample2 {
    public static void main(String args[]) {

        // Optional.ofNullable - allows passed
        // parameter is not null.
        Optional<Integer> val1 = Optional.ofNullable(10);

        // Optional.ofNullable - allows passed
        // parameter is null.
        Optional<Integer> val2 = Optional.ofNullable(null);
        System.out.println("First parameter is present:" + val1.isPresent());
        System.out.println("Second parameter is present:" + val2.isPresent());
    }
}
