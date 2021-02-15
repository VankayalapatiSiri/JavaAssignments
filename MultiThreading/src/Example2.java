//By implementing Runnable interface
class ThreadB implements Runnable{
    public void run( ) {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Exiting from Thread A ...");
    }
}
public class Example2 {
    public static void main(String[] args) {
        ThreadB b=new ThreadB();
        Thread t = new Thread(b);
        t.start();
        System.out.println("... Multithreading is over ");

    }
}
