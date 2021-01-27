import java.util.Arrays;
//Reference to a Static Method
interface Sayable{
    void say();
}
class Greetings{
    public static void say(){
        System.out.println("Hello");
    }
}
public class MethodReferenceExample {
    public static void main(String[] args) {
    Sayable saying=Greetings::say;
    saying.say();

    }
}
