import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

public class StampedLockExample {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();
        StampedLock lock = new StampedLock();

        executor.submit(() -> {
            long stamp = lock.writeLock();
            try {
                map.put("1", "Siri");
                System.out.println("After performing write :" + map);
            } finally {
                lock.unlockWrite(stamp);
            }
        });

        executor.submit(() -> {
            long stamp = lock.writeLock();
            try {
                map.remove("1");
                System.out.println("After performing Remove :" + map);
            } finally {
                lock.unlockWrite(stamp);

            }
        });

        executor.submit(() -> {
            long stamp = lock.readLock();
            try {
                System.out.println(map.get("1"));
            } finally {
                lock.unlockRead(stamp);
            }
        });

        executor.submit(() -> {
            long stamp = lock.readLock();
            try {
                System.out.println(map.containsKey("1"));
            } finally {
                lock.unlockRead(stamp);
            }
        });

    }
}
