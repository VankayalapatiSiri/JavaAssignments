import techm.itp.hyd10001.cs35123.Anu.Advisor;
import techm.itp.hyd10001.cs35123.Anu.Greeter;

public class Question1 {
    public static void main(String[] args) {
        String name;
        String[] message;
        System.out.println("Enter your name :");
        name = args[0];
        Greeter greet = new Greeter(name);
        Advisor adv = new Advisor();
        adv.getAdvice();
        greet.sayGoodBye();
    }
}
