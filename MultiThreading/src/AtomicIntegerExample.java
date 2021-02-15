import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicIntegerExample {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInt1 = new AtomicInteger(0);
        AtomicInteger atomicInt2 = new AtomicInteger(0);
        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 10)
                .forEach(i -> executor.submit(atomicInt1::incrementAndGet));

        IntStream.range(0, 1000)
                .forEach(i -> {
                    Runnable task = () ->
                            atomicInt2.updateAndGet(n -> n + 2);
                    executor.submit(task);
                });

        executor.shutdown();
        executor.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println(atomicInt1.get());
        System.out.println(atomicInt2.get());



    }
}
