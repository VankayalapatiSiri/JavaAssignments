import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllAndInvokeAnyExample {
    static Callable<String> callable(String result, long sleepSeconds) {
        return () -> {
            TimeUnit.SECONDS.sleep(sleepSeconds);
            return result;
        };
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor= Executors.newFixedThreadPool(4);
        List<Callable<String>> callables = Arrays.asList(
                callable("task1", 2),
                callable("task2", 1),
                callable("task3", 3));

        String result = executor.invokeAny(callables);
       List<Future<String>> result1=executor.invokeAll(callables);
        System.out.println(result);
       result1.stream().forEach(System.out::println);
//        executor.invokeAll(callables)
//                .stream()
//                .map(future -> {
//                    try {
//                        return future.get();
//                    }
//                    catch (Exception e) {
//                        throw new IllegalStateException(e);
//                    }
//                })
//                .forEach(System.out::println);
    }
}
