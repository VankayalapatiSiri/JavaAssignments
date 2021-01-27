//Reference to a Constructor
interface Sayable1 {
    void say(String msg);
}

class Greetings1 {
    Greetings1(String msg) {
        System.out.println(msg);
    }
}

public class MethodReferencesExample3 {
    public static void main(String[] args) {
        Sayable1 saying = Greetings1::new;
        saying.say("Hello");
    }
}
