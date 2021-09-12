


public class Print1_100 {


    public static void main(String[] args) {
        TestThird t = new TestThird();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}


class TestThird implements Runnable {

    int i = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (i <= 100) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    i++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}























