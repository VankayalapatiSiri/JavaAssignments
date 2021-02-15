import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

public class SemaphoreExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Semaphore semaphore = new Semaphore(5);

        Runnable task = () -> {
            boolean permit = false;
            try {
                permit = semaphore.tryAcquire(1, TimeUnit.SECONDS);
                if (permit) {
                    System.out.println("Semaphore acquired");
                } else {
                    System.out.println("Could not acquire semaphore");
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            } finally {
                if (permit) {
                    semaphore.release();
                }
            }
        };

        IntStream.range(0, 5)
                .forEach(i -> executor.submit(task));

    }
}
