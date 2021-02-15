import org.w3c.dom.ls.LSOutput;

class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Exiting from Thread A ...");
    }
}

class ThreadId extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.start();
        ThreadId id = new ThreadId();
        id.start();

        System.out.println("... Multithreading is over ");
    }
}
