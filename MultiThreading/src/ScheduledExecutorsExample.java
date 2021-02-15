import java.util.concurrent.*;

public class ScheduledExecutorsExample {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(4);
        Runnable task = () -> {try {
            System.out.println("Scheduling: " + System.nanoTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        };
        int initialDelay = 0;
        int period = 1;
        ScheduledFuture<?> future = executor.scheduleAtFixedRate( task, initialDelay, period, TimeUnit.SECONDS);

        TimeUnit.MILLISECONDS.sleep(1000);
        //getDelay() to retrieve the remaining delay
        long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
        System.out.printf("Remaining Delay: %sms", remainingDelay);



    }
}
