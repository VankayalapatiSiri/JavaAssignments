import java.util.concurrent.TimeUnit;

public class ThreadsAndRunnableExample {
    public static void main(String[] args) {
        Runnable runnable=()->{
            try {
                String name = Thread.currentThread().getName();
                TimeUnit.SECONDS.sleep(1);
                System.out.println(name);
                for (int i = 0; i <= 5; i++) {
                    System.out.println(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
