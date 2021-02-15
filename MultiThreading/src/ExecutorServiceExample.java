import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
//There are two methods provided by ExecutorService shutdown() and shutdownNow()
public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
            try {
                System.out.println("attempt to shutdown executor");
                executor.shutdown();
                executor.awaitTermination(5, TimeUnit.SECONDS);
            }
            catch (InterruptedException e) {
                System.err.println("tasks interrupted");
            }
            finally {
                if (!executor.isTerminated()) {
                    System.err.println("cancel non-finished tasks");
                }
                executor.shutdownNow();
                System.out.println("shutdown finished");
            }
        });
    }
}