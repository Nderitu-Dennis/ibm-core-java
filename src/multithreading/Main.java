package multithreading;

public class Main {
    public static void main(String[] args) {
        MultiThreadingExampleOne one = new MultiThreadingExampleOne();
        one.start();

        MultiThreadingTwoExample two = new MultiThreadingTwoExample();
        two.start();
    }
}
