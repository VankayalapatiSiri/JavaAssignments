import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {


    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Lock writeLock = lock.writeLock();
        Lock readLock = lock.readLock();

        executor.submit(() -> {
            try {
                writeLock.lock();
                map.put("1", "Siri");
                System.out.println("After performing write :" + map);
            } finally {
                writeLock.unlock();
            }
        });

        executor.submit(() -> {
            try {
                writeLock.lock();
                map.remove("1");
                System.out.println("After performing Remove :" + map);
            } finally {
                writeLock.unlock();

            }
        });

        executor.submit(()->{
            try {
                readLock.lock();
                System.out.println(map.get("1"));
            } finally {
                readLock.unlock();
            }
        });

        executor.submit(()->{
            try {
                readLock.lock();
                System.out.println(map.containsKey("1"));
            } finally {
                readLock.unlock();
            }
        });


    }
}
