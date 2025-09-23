package practice_9;

public class VolatileExample {
    private static volatile boolean stop = false;

    public static void main(String[] args) {
        Thread counterThread = new Thread(() -> {
            int counter = 0;
            while (!stop) {
                counter++;
                System.out.println(counter);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException _) {

                }
            }
            System.out.println("stop!");
        });
        counterThread.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException _) {

        }
        stop = true;
        System.out.println("флаг стоит на true!");
    }
}
