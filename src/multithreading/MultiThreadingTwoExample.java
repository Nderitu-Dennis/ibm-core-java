package multithreading;

public class MultiThreadingTwoExample extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("multithreading two " + i + Thread.currentThread().getName());
        /*   try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}
