import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

public class OptimisticLockingExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();
        map.put("1","Siri");
        System.out.println(map);
        StampedLock lock = new StampedLock();
        String value = map.get("1");

        executor.submit(() -> {
            long stamp = lock.tryOptimisticRead();
            if (!lock.validate(stamp)) {
                stamp = lock.readLock();
                try {
                    System.out.println(map.get("1"));
                } finally {
                    lock.unlock(stamp);
                }
            }
            else
                System.out.println(value);
        });
    }
}