
class Thread4 extends Thread {
    public void run() {
        System.out.println("Start Thread 4 ....");
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread 4: i = " + i);
        }
        System.out.println("... Exit Thread 4");
    }
}

class Thread5 extends Thread {
    public void run() {
        System.out.println("Start Thread 5 ....");
        for (int j = 1; j <= 5; j++) {
            System.out.println("From Thread 5: j = " + j);
            if (j == 2)
                stop();
        }
        System.out.println("... Exit Thread 5");
    }
}

class Thread6 extends Thread {
    public void run() {
        System.out.println("Start Thread 6 ....");
        for (int k = 1; k <= 5; k++) {
            System.out.println("From Thread 6: k = " + k);
            if (k == 3) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("... Exit Thread 6");
        }
    }

    static class Thread7 extends Thread {
        public void run() {
            for (int i = 1; i < 5; i++) {
                try {
                    // thread to sleep for 500 milliseconds
                    sleep(500);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(i);
            }
        }
    }

    public static class Example3 {
        public static void main(String[] args) {
            Thread4 t4 = new Thread4();
            Thread5 t5 = new Thread5();
            Thread6 t6 = new Thread6();
            Thread7 t7 = new Thread7();
            t4.start();
            t5.start();
            t6.start();
            t7.start();
            //t7.suspend();
            //t7.resume();
            for (int i = 0; i < 3; i++) {
                // Control passes to child thread
                t4.yield();
                System.out.println(Thread.currentThread().getName() + " in control");
            }

        }
    }
}
