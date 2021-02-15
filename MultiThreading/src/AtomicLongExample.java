import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class AtomicLongExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        LongAdder adder = new LongAdder();
        IntStream.range(0, 10)
                .forEach(i -> executor.submit(adder::increment));
        executor.shutdown();
        executor.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println(adder.sumThenReset());
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        AtomicLong adder = new AtomicLong();
//        IntStream.range(0, 2000)
//                .forEach(i -> executor.submit(adder::incrementAndGet));
//
//        executor.shutdown();
//
//        System.out.println(adder.get());

    }
}
