package multithreading;

public class MultiThreadingExampleOne extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("multithreading one " + i + Thread.currentThread().getName());
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error occured: " + e.getMessage());
            }
        }
    }
}
