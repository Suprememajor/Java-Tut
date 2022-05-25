package multithreading;

public class Multithreading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultithreadThing myThing = new MultithreadThing(i + 1);
            myThing.start();
        }

        for (int i = 0; i < 5; i++) {
            MultithreadThing2 myThing = new MultithreadThing2(i + 1);
            Thread myThread = new Thread(myThing);
            myThread.start();
        }
    }
}
