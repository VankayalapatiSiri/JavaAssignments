@FunctionalInterface
interface Greet{
    public void greet();
}
public class LambdaExpressionExample1 {
    public static void main(String[] args) {
        Greet g=()-> System.out.println("Hello!");
        g.greet();
    }
}
