import java.util.concurrent.*;

public class CallableAndFutureExample {
    public static void main(String[] args) throws ExecutionException, TimeoutException, InterruptedException {
        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 1;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<Integer> future = executor.submit(task);
        System.out.println("future done? " + future.isDone());
        Integer result = future.get(1, TimeUnit.SECONDS);
        System.out.println("future done? " + future.isDone());
        System.out.println(result);
    }
}
