import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class ReentrantLockExample {
    private static int count = 0;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ReentrantLock lock = new ReentrantLock();

        executor.submit(() -> {
            lock.lock();
            try {
                sleep(3);
                count++;
                System.out.println(count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        executor.submit(() -> {
            boolean isLockAcquired = false;
            try {
                isLockAcquired = lock.tryLock(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(isLockAcquired){
                try {
                    count++;
                    System.out.println(count);
                } finally {
                    lock.unlock();
                }
            }

        });

        //stop(executor);
    }
}
