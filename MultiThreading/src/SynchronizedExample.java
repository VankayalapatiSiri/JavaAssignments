import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Test {
    private int sum, count = 0;

    //synchronizing the method
    synchronized void add() {
        sum += 1;
        System.out.println("sum :" +sum);
    }

    //using synchronized block
    void increment() {
        synchronized (this) {
            count += 1;
            System.out.println("count : "+ count);
        }
    }

}

public class SynchronizedExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Test t = new Test();
        for (int i = 0; i <= 10; i++) {
            executor.submit(t::add);
        }

        for (int i = 0; i <= 10; i++) {
            executor.submit(t::increment);
        }
    }
}
