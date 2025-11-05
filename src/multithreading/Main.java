package multithreading;

public class Main {
    public static void main(String[] args) {
        MultiThreadingExampleOne one = new MultiThreadingExampleOne();
        one.start();
        // one.join(); // two will wait for one to finish execution first

        MultiThreadingTwoExample two = new MultiThreadingTwoExample();
        two.start();
        one.interrupt();

    }
}
