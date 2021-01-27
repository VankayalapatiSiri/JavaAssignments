import java.util.ArrayList;
import java.util.function.Consumer;

public class forEachExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(3);
        l.add(7);
        l.add(5);
        l.add(8);
        MyConsumer obj=new MyConsumer();
        l.forEach(obj);
    }

}
class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Value::"+t);
    }


}
