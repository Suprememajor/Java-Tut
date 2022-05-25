package multithreading;

public class MultithreadThing2 implements Runnable{

    private int threadNumber;

    public MultithreadThing2(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread number " + threadNumber);
            if (threadNumber == 3) throw new RuntimeException();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
