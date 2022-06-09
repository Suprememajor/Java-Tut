package advance.synchronization;

public class MathUtils {
    void getMultiples(int n) {
        synchronized (this) {
            for (int i = 0; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
