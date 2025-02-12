package multithreading;

public class MultiThreadingTwoExample extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("multithreading two " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
